# Data Extraction Guide

This document provides a complete mapping of all pages, their images, and audio files from the original app.

## Overview

- **Total Pages**: 24 (0-23)
  - Page 0: Index/Address page
  - Pages 1-23: Lesson pages
- **Total Images**: ~2,289 (including hover states)
- **Total Audio Files**: 1,079

## Audio Array Mapping

Based on `SoundsArray.java`, here's the mapping of pages to audio arrays:

### Page 0 (Address/Index)
- **Array**: Not in pageWithLetter (special navigation page)
- **Purpose**: Navigation to different lessons
- **Interactive**: Clickable cells that navigate to pages 1-21

### Page 1
- **Array**: `page1`
- **Audio Count**: 32
- **Layout**: 
  - 1 header (basmala)
  - 1 title (lesson1)
  - 30 letters in 6x5 grid
- **Audio Files**: basmla, lesson1, l1geem, l1sthaa, l1taa, l1baa, l1alf, l1raa, l1zaal, l1daal, l15aa, l17aa, l1daad, l1saad, l1sheen, l1seen, l1zaa, l1faa, l1ghaeen, l13aeen, l1zzaa, l1ttaa, l1noon, l1meem, l1laam, l1kaaf, l1qaaf, l1yaa2, l1yaa, l1hamza, l1haa, l1waw

### Page 2
- **Array**: `page2`
- **Audio Count**: 55
- **Layout**: Title + 9 rows × 6 columns grid
- **Includes**: Combined letter sounds

### Page 3
- **Array**: `page3`
- **Audio Count**: 61
- **Layout**: 10 rows × 6 columns grid
- **Includes**: More complex letter combinations

### Page 4
- **Array**: `page4`
- **Audio Count**: 30
- **Layout**: Mixed (2x5 grid + 1x3 + title + 4x4)
- **Special**: Has special background changes for certain buttons

### Page 5
- **Array**: `page5`
- **Audio Count**: 73
- **Layout**: Title + 9 rows × 8 columns grid
- **Includes**: Letter variations with diacritics

### Page 6
- **Array**: `page6`
- **Audio Count**: 80
- **Layout**: 10 rows × 8 columns grid
- **Special**: Has special background changes for certain buttons

### Page 7
- **Array**: `page7`
- **Audio Count**: 61
- **Layout**: 3x8 grid + title + 6x6 grid
- **Includes**: More letter combinations

### Page 8
- **Array**: `page8`
- **Audio Count**: 54
- **Layout**: 3x6 grid + title + 5x7 grid
- **Includes**: Vowel variations

### Page 9
- **Array**: `page9`
- **Audio Count**: 64
- **Layout**: Title + 9x7 grid
- **Includes**: Short vowel markers

### Page 10
- **Array**: `page10`
- **Audio Count**: 70
- **Layout**: 10x7 grid
- **Includes**: Vowel combinations

### Page 11
- **Array**: `page11`
- **Audio Count**: 50
- **Layout**: 1x7 + title + 7x6 grid
- **Includes**: Words/phrases

### Page 12
- **Array**: `page12`
- **Audio Count**: 57
- **Layout**: 9x6 grid + 1x3
- **Includes**: More words

### Page 13
- **Array**: `page13`
- **Audio Count**: 51
- **Layout**: 1x2 + title + 8x6 grid
- **Includes**: Sukun variations

### Page 14
- **Array**: `page14`
- **Audio Count**: 52
- **Layout**: Title + multiple grids (3x6, 1x5, 3x6, 2x5)
- **Includes**: Combined sounds

### Page 15
- **Array**: `page15`
- **Audio Count**: 47
- **Layout**: Multiple grids (5x5, 1x4, 1x5, 2x4, 1x5)
- **Includes**: More combinations

### Page 16
- **Array**: `page16`
- **Audio Count**: 40
- **Layout**: Complex mixed layout
- **Includes**: Advanced combinations

### Page 17
- **Array**: `page17`
- **Audio Count**: 32
- **Layout**: Multiple sections with mixed layouts
- **Includes**: Reading exercises

### Page 18
- **Array**: `page18`
- **Audio Count**: 61
- **Layout**: 7x7 grid + title + mixed sections
- **Includes**: Extended phrases
- **Special**: Has mute audio placeholder

### Page 19
- **Array**: `page19`
- **Audio Count**: 44
- **Layout**: Multiple grids (4x5, 1x6, 1x5, 1x4, 3x3)
- **Includes**: Complex words

### Page 20
- **Array**: `page20`
- **Audio Count**: 31
- **Layout**: Mixed sections with various grid sizes
- **Includes**: Reading practice
- **Special**: Has special background changes

### Page 21
- **Array**: `page21`
- **Audio Count**: 27
- **Layout**: Multiple title sections with grids
- **Includes**: Connected text

### Page 22
- **Array**: `page22`
- **Audio Count**: 29
- **Layout**: Similar to page 21
- **Includes**: More reading exercises

### Page 23
- **Array**: `page23`
- **Audio Count**: 13
- **Layout**: 3x3 grid + 1x4 grid
- **Includes**: Final exercises

## Image Naming Convention

### Normal State Images
- Format: `{page}_{section}_l{col}_{row}`
- Example: `page1_l0_0` (page 1, column 0, row 0)
- Special: `bas_l0_0` (basmala), `p1title_l0_0` (title)

### Hover State Images
- Format: `{normal_name}_hover`
- Example: `page1_l0_0_hover`
- Automatically appended by the system

### Background Images
- Format: `page{number}` or `page{number}_hover`
- Example: `page1`, `page4_hover1`, `page4_hover2`

### Dialog Images
- Format: `dialog_p{number}`
- Example: `dialog_p1`, `dialog_p2`

## Audio File Naming Convention

### Format
- Descriptive names based on content
- Examples:
  - `basmla` - Basmala (In the name of Allah)
  - `lesson1` - Lesson title
  - `l1alf`, `l1baa`, etc. - Individual letters
  - `p2_lam`, `p2_ba_alf`, etc. - Letter combinations
  - `p10_ka`, `p10_qo`, etc. - Letters with vowels

### Special Audio
- `mute` - Silent placeholder (used in some pages)

## Creating JSON Files

### Steps for Each Page:

1. **Identify the page array** in `SoundsArray.java`
2. **Determine the layout** from `LoadGame()` in `ScreenSlidePageFragment.java`
3. **Extract CreateRow calls** to understand:
   - Row/column counts
   - Position and sizing
   - Spacing values
4. **Map audio array to images** using positional indexing
5. **Create JSON structure** following the Page model

### Example Template:

```json
{
  "pageId": X,
  "pageName": "pageX",
  "backgroundImage": "pageX",
  "helpDialog": "dialog_pX",
  "sections": [
    {
      "sectionId": "section_name",
      "type": "GRID" | "SINGLE" | "CUSTOM",
      "layout": {
        "rows": N,
        "cols": M,
        "position": {"left": X, "top": Y},
        "itemSize": {"width": W, "height": H},
        "spacing": {"horizontal": SH, "vertical": SV}
      },
      "items": [...]
    }
  ]
}
```

## Priority for Implementation

1. ✅ **Page 1** - Already created (example template)
2. **Page 0** - Index/navigation (special handling)
3. **Pages 2-10** - Core lessons with grids
4. **Pages 11-23** - Advanced lessons

## Notes

- Some pages have special background behavior (pages 4, 6, 20)
- Page 18 and 20 have `mute` audio placeholders
- The address page (0) doesn't have audio, just navigation
- Grid positions can be calculated automatically using GridLayout.calculateCellPosition()
- Audio files are referenced by name without extension
- All dimensions are in pixels (original app: 1286×1740)

## Tools Needed

To complete all JSON files, you can:
1. Parse `SoundsArray.java` to extract audio arrays
2. Parse `LoadGame()` switch cases to extract layout info
3. Generate JSON programmatically using a script

## Validation

Each JSON file should:
- Match the audio count from the array
- Have correct grid dimensions
- Use valid resource names
- Follow the naming conventions
