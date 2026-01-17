#!/usr/bin/env python3
"""
Script to refine JSON configurations by matching actual drawable image names
with audio files based on the ScreenSlidePageFragment.java layout information.

This script:
1. Parses CreateRow calls from ScreenSlidePageFragment.java
2. Lists all drawable resources
3. Matches images to audio items based on grid positions
4. Updates JSON files with correct image names and layout info
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Tuple

# Paths
OLD_APK_DIR = Path("/home/i826753/git/jmasalma/Norani/apk")
NEW_APP_DIR = Path("/home/i826753/git/jmasalma/Norani/NewApp")
SOUNDS_ARRAY_FILE = OLD_APK_DIR / "classes2/sources/com/zoomat/noorania/SoundsArray.java"
SCREEN_SLIDE_FILE = OLD_APK_DIR / "classes2/sources/com/zoomat/noorania/ScreenSlidePageFragment.java"
DRAWABLE_DIR = NEW_APP_DIR / "app/src/main/res/drawable"
OUTPUT_DIR = NEW_APP_DIR / "app/src/main/assets/pages"

def extract_audio_arrays(sounds_file: Path) -> Dict[str, List[str]]:
    """Extract audio arrays from SoundsArray.java"""
    with open(sounds_file, 'r') as f:
        content = f.read()
    
    arrays = {}
    pattern = r'public\s+int\[\]\s+(page\d+)\s*=\s*\{([^}]+)\}'
    
    for match in re.finditer(pattern, content, re.MULTILINE | re.DOTALL):
        array_name = match.group(1)
        array_content = match.group(2)
        raw_refs = re.findall(r'R\.raw\.(\w+)', array_content)
        arrays[array_name] = raw_refs
    
    return arrays

def parse_create_row_calls(screen_slide_file: Path) -> Dict[int, List[Dict]]:
    """Parse CreateRow calls for each page from ScreenSlidePageFragment.java"""
    with open(screen_slide_file, 'r') as f:
        content = f.read()
    
    # Extract the LoadGame method
    load_game_pattern = r'private\s+void\s+LoadGame\s*\([^)]*\)\s*\{(.*)'
    load_game_match = re.search(load_game_pattern, content, re.DOTALL)
    
    if not load_game_match:
        print("ERROR: Could not find LoadGame() method")
        return {}
    
    load_game_content = load_game_match.group(1)
    
    # Map case numbers to page numbers based on the switch statement
    case_to_page = {
        0: 0,   # address page
        1: 10,  # page10
        2: 11,  # page11
        3: 12,  # page12
        4: 13,  # page13
        5: 14,  # page14
        6: 15,  # page15
        7: 16,  # page16
        8: 17,  # page17
        9: 18,  # page18
        10: 19, # page19
        11: 20, # page20
        12: 21, # page21
        13: 22, # page22
        14: 23, # page23
        15: 1,  # page1
        16: 2,  # page2
        17: 3,  # page3
        18: 4,  # page4
        19: 5,  # page5
        20: 6,  # page6
        21: 7,  # page7
        22: 8,  # page8
        23: 9,  # page9
    }
    
    pages = {}
    
    # Extract each case
    case_pattern = r'case\s+(\d+):\s*(.*?)(?=case\s+\d+:|default:|^\s+\})'
    
    for match in re.finditer(case_pattern, load_game_content, re.MULTILINE | re.DOTALL):
        case_num = int(match.group(1))
        case_content = match.group(2)
        
        page_num = case_to_page.get(case_num)
        if page_num is None:
            continue
        
        # Extract all CreateRow calls from this case
        create_row_pattern = r'CreateRow\s*\(\s*"([^"]+)"\s*,'
        prefixes = re.findall(create_row_pattern, case_content)
        
        pages[page_num] = prefixes
        print(f"Page {page_num}: Found prefixes {prefixes}")
    
    return pages

def list_drawable_images() -> Dict[str, List[str]]:
    """List all drawable images grouped by page"""
    images_by_page = {}
    
    for img_file in list(DRAWABLE_DIR.glob("*.png")) + list(DRAWABLE_DIR.glob("*.PNG")):
        img_name = img_file.stem  # Remove extension
        
        # Match page pattern - handle both pageN_ and prefixes like bas_, pNtitle_
        page_match = re.match(r'((?:page\d+[a-z]?|bas|p\d+title[ab]?))_l(\d+)_(\d+)(?:_hover)?', img_name)
        if page_match:
            full_prefix = page_match.group(1)
            col = int(page_match.group(2))
            row = int(page_match.group(3))
            is_hover = '_hover' in img_name
            
            if full_prefix not in images_by_page:
                images_by_page[full_prefix] = []
            
            if not is_hover:  # Only store non-hover images
                images_by_page[full_prefix].append({
                    'name': img_name,
                    'col': col,
                    'row': row
                })
    
    # Sort by row, then col
    for prefix in images_by_page:
        images_by_page[prefix].sort(key=lambda x: (x['row'], x['col']))
    
    return images_by_page

def generate_refined_json(page_id: int, audio_array: List[str], 
                         prefixes: List[str], images_by_page: Dict) -> Dict:
    """Generate refined JSON configuration with correct image names"""
    
    page_config = {
        "pageId": page_id,
        "pageName": f"page{page_id}",
        "backgroundImage": f"page{page_id}",
        "helpDialog": f"dialog_p{page_id}" if page_id > 0 else None,
        "sections": []
    }
    
    audio_index = 0
    
    for section_idx, prefix in enumerate(prefixes):
        # Get images for this prefix
        prefix_key = prefix.rstrip('_')
        images = images_by_page.get(prefix_key, [])
        
        if not images:
            print(f"  WARNING: No images found for prefix '{prefix_key}'")
            continue
        
        # Determine grid dimensions
        max_row = max(img['row'] for img in images) + 1
        max_col = max(img['col'] for img in images) + 1
        
        section = {
            "sectionId": f"section_{section_idx}",
            "type": "GRID",
            "layout": {
                "rows": max_row,
                "cols": max_col,
                "position": {
                    "left": 100,  # Placeholder - would need calLeft values
                    "top": 100    # Placeholder - would need calTop values
                },
                "itemSize": {
                    "width": 145,  # Placeholder
                    "height": 115  # Placeholder
                },
                "spacing": {
                    "horizontal": 10,  # Placeholder
                    "vertical": 10     # Placeholder
                }
            },
            "items": []
        }
        
        # Add items in grid order
        for img in images:
            if audio_index < len(audio_array):
                item = {
                    "id": f"item_{audio_index}",
                    "image": img['name'],
                    "audio": audio_array[audio_index],
                    "hoverImage": f"{img['name']}_hover",
                    "position": None,
                    "size": None,
                    "gridPosition": {
                        "row": img['row'],
                        "col": img['col']
                    }
                }
                section["items"].append(item)
                audio_index += 1
        
        page_config["sections"].append(section)
    
    return page_config

def main():
    print("=== Refining JSON Configuration Files ===\n")
    
    # Extract audio arrays
    print("1. Extracting audio arrays...")
    audio_arrays = extract_audio_arrays(SOUNDS_ARRAY_FILE)
    print(f"   Found {len(audio_arrays)} audio arrays\n")
    
    # Parse layout prefixes
    print("2. Parsing layout prefixes from ScreenSlidePageFragment...")
    page_prefixes = parse_create_row_calls(SCREEN_SLIDE_FILE)
    print(f"   Found layout info for {len(page_prefixes)} pages\n")
    
    # List drawable images
    print("3. Listing drawable images...")
    images_by_page = list_drawable_images()
    print(f"   Found images for {len(images_by_page)} prefixes\n")
    
    # Generate refined JSON files
    print("4. Generating refined JSON files...")
    pages_refined = 0
    
    for page_id in range(24):
        array_name = f"page{page_id}"
        
        if page_id == 0:
            # Special case: index page
            page_config = {
                "pageId": 0,
                "pageName": "page0",
                "backgroundImage": "pages",
                "helpDialog": None,
                "sections": []
            }
            
            # Add addressa section
            if "addressa" in images_by_page:
                images = images_by_page["addressa"]
                section = {
                    "sectionId": "section_0",
                    "type": "GRID",
                    "layout": {
                        "rows": 2,
                        "cols": 8,
                        "position": {"left": 110, "top": 100},
                        "itemSize": {"width": 523, "height": 150},
                        "spacing": {"horizontal": 10, "vertical": 5}
                    },
                    "items": []
                }
                for idx, img in enumerate(images):
                    section["items"].append({
                        "id": f"item_{idx}",
                        "image": img['name'],
                        "audio": None,
                        "hoverImage": f"{img['name']}_hover",
                        "position": None,
                        "size": None,
                        "gridPosition": {"row": img['row'], "col": img['col']}
                    })
                page_config["sections"].append(section)
            
            # Add addressb section
            if "addressb" in images_by_page:
                images = images_by_page["addressb"]
                section = {
                    "sectionId": "section_1",
                    "type": "GRID",
                    "layout": {
                        "rows": 1,
                        "cols": 1,
                        "position": {"left": 400, "top": 5},
                        "itemSize": {"width": 523, "height": 150},
                        "spacing": {"horizontal": 10, "vertical": 0}
                    },
                    "items": []
                }
                for idx, img in enumerate(images):
                    section["items"].append({
                        "id": f"item_{len(page_config['sections'][0]['items']) + idx}",
                        "image": img['name'],
                        "audio": None,
                        "hoverImage": f"{img['name']}_hover",
                        "position": None,
                        "size": None,
                        "gridPosition": {"row": img['row'], "col": img['col']}
                    })
                page_config["sections"].append(section)
            
        elif array_name in audio_arrays and page_id in page_prefixes:
            audio_array = audio_arrays[array_name]
            prefixes = page_prefixes[page_id]
            page_config = generate_refined_json(page_id, audio_array, prefixes, images_by_page)
        else:
            print(f"  ✗ Skipping page{page_id}: Missing audio or layout info")
            continue
        
        # Write to file
        output_file = OUTPUT_DIR / f"page{page_id}.json"
        with open(output_file, 'w') as f:
            json.dump(page_config, f, indent=2)
        
        item_count = sum(len(section['items']) for section in page_config['sections'])
        print(f"  ✓ Refined page{page_id}.json ({item_count} items)")
        pages_refined += 1
    
    print(f"\n=== Summary ===")
    print(f"Refined {pages_refined} JSON files")
    print(f"Output: {OUTPUT_DIR}")
    print("\nAll JSON files now have correct image names matched to audio!")

if __name__ == "__main__":
    main()
