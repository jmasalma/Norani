#!/usr/bin/env python3
"""
Script to extract page configurations from the old Norani app source files
and generate JSON configuration files for the new app.

Usage:
    python3 extract_json_configs.py

This script reads SoundsArray.java and ScreenSlidePageFragment.java from the
old APK to extract audio arrays and layout information, then generates JSON
files for each page.
"""

import json
import re
import os
from pathlib import Path

# Paths
OLD_APK_DIR = Path("/home/i826753/git/jmasalma/Norani/apk")
SOUNDS_ARRAY_FILE = OLD_APK_DIR / "classes2/sources/com/zoomat/noorania/SoundsArray.java"
SCREEN_SLIDE_FILE = OLD_APK_DIR / "classes2/sources/com/zoomat/noorania/ScreenSlidePageFragment.java"
OUTPUT_DIR = Path("/home/i826753/git/jmasalma/Norani/NewApp/app/src/main/assets/pages")

def extract_audio_arrays(sounds_file):
    """Extract all audio arrays from SoundsArray.java"""
    with open(sounds_file, 'r') as f:
        content = f.read()
    
    # Find all arrays (page0, page1, page2, etc.)
    arrays = {}
    
    # Pattern to match array declarations with R.raw. references
    # Example: public int[] page1 = {R.raw.audio1, R.raw.audio2, ...};
    pattern = r'public\s+int\[\]\s+(page\d+)\s*=\s*\{([^}]+)\}'
    
    for match in re.finditer(pattern, content, re.MULTILINE | re.DOTALL):
        array_name = match.group(1)
        array_content = match.group(2)
        
        # Extract R.raw. references and get just the audio names
        raw_refs = re.findall(r'R\.raw\.(\w+)', array_content)
        arrays[array_name] = raw_refs
        
        print(f"Found array {array_name} with {len(raw_refs)} items")
    
    return arrays

def parse_layout_info(screen_slide_file):
    """
    Parse layout information from ScreenSlidePageFragment.java
    This extracts CreateRow calls and other layout details
    """
    with open(screen_slide_file, 'r') as f:
        content = f.read()
    
    # Extract the LoadGame() method content
    load_game_pattern = r'private\s+void\s+LoadGame\s*\([^)]*\)\s*\{(.*?)\n\s*\}'
    load_game_match = re.search(load_game_pattern, content, re.DOTALL)
    
    if not load_game_match:
        print("Could not find LoadGame() method")
        return {}
    
    load_game_content = load_game_match.group(1)
    
    # Split by case statements
    case_pattern = r'case\s+(\d+):\s*(.*?)(?=case\s+\d+:|default:|\Z)'
    
    pages = {}
    for match in re.finditer(case_pattern, load_game_content, re.DOTALL):
        page_num = int(match.group(1))
        case_content = match.group(2)
        
        pages[page_num] = {
            'content': case_content,
            'create_row_calls': extract_create_row_calls(case_content)
        }
    
    return pages

def extract_create_row_calls(case_content):
    """Extract CreateRow method calls and their parameters"""
    # Pattern for CreateRow calls
    # CreateRow(rows, cols, left, top, width, height, h_spacing, v_spacing)
    pattern = r'CreateRow\s*\(\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*\)'
    
    rows = []
    for match in re.finditer(pattern, case_content):
        rows.append({
            'rows': int(match.group(1)),
            'cols': int(match.group(2)),
            'left': int(match.group(3)),
            'top': int(match.group(4)),
            'width': int(match.group(5)),
            'height': int(match.group(6)),
            'h_spacing': int(match.group(7)),
            'v_spacing': int(match.group(8))
        })
    
    return rows

def generate_page_json(page_id, audio_array, layout_info):
    """Generate JSON configuration for a page"""
    
    page_config = {
        "pageId": page_id,
        "pageName": f"page{page_id}",
        "backgroundImage": f"page{page_id}",
        "helpDialog": f"dialog_p{page_id}" if page_id > 0 else None,
        "sections": []
    }
    
    # If we have layout info and create row calls
    if layout_info and 'create_row_calls' in layout_info:
        create_rows = layout_info['create_row_calls']
        audio_index = 0
        
        for i, row_config in enumerate(create_rows):
            section = {
                "sectionId": f"section_{i}",
                "type": "GRID",
                "layout": {
                    "rows": row_config['rows'],
                    "cols": row_config['cols'],
                    "position": {
                        "left": row_config['left'],
                        "top": row_config['top']
                    },
                    "itemSize": {
                        "width": row_config['width'],
                        "height": row_config['height']
                    },
                    "spacing": {
                        "horizontal": row_config['h_spacing'],
                        "vertical": row_config['v_spacing']
                    }
                },
                "items": []
            }
            
            # Add items for this grid
            total_items = row_config['rows'] * row_config['cols']
            for row in range(row_config['rows']):
                for col in range(row_config['cols']):
                    if audio_index < len(audio_array):
                        item = {
                            "id": f"item_{audio_index}",
                            "image": f"page{page_id}_l{col}_{row}",
                            "audio": audio_array[audio_index],
                            "position": None,
                            "size": None,
                            "hoverImage": None,
                            "gridPosition": {
                                "row": row,
                                "col": col
                            }
                        }
                        section["items"].append(item)
                        audio_index += 1
            
            page_config["sections"].append(section)
    
    return page_config

def main():
    print("Starting JSON extraction...")
    print(f"Reading from: {OLD_APK_DIR}")
    print(f"Output to: {OUTPUT_DIR}")
    
    # Ensure output directory exists
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
    
    # Extract audio arrays
    print("\n=== Extracting audio arrays ===")
    audio_arrays = extract_audio_arrays(SOUNDS_ARRAY_FILE)
    
    # Parse layout information
    print("\n=== Parsing layout information ===")
    layout_info = parse_layout_info(SCREEN_SLIDE_FILE)
    
    # Generate JSON files
    print("\n=== Generating JSON files ===")
    pages_generated = 0
    
    for page_id in range(24):  # 0-23
        array_name = f"page{page_id}"
        
        if array_name in audio_arrays:
            audio_array = audio_arrays[array_name]
            layout = layout_info.get(page_id, {})
            
            # Generate JSON
            page_json = generate_page_json(page_id, audio_array, layout)
            
            # Write to file
            output_file = OUTPUT_DIR / f"page{page_id}.json"
            with open(output_file, 'w') as f:
                json.dump(page_json, f, indent=2)
            
            print(f"✓ Generated {output_file} ({len(audio_array)} audio items)")
            pages_generated += 1
        else:
            print(f"✗ No audio array found for page{page_id}")
    
    print(f"\n=== Summary ===")
    print(f"Generated {pages_generated} JSON files")
    print(f"Location: {OUTPUT_DIR}")
    print("\nNote: These are auto-generated and may need manual refinement.")
    print("Please review the JSON files and adjust positions/layouts as needed.")

if __name__ == "__main__":
    main()
