# Image to Audio Mapping in Norani App

## Overview

This document explains how drawable images (PNG files) are linked to audio files (MP3 files) in the original Norani APK and how this mapping has been extracted for the refactored app.

## Summary Statistics

- **Total Images**: 2,289 PNG files (including hover states)
- **Unique Images**: ~1,145 (each image has a matching `_hover` version)
- **Total Audio Files**: 1,079 MP3 files
- **Pages**: 24 pages (page0 through page23)

## How the Mapping Works

### 1. Image Naming Convention

Images follow a strict naming pattern:
```
{prefix}_l{col}_{row}[_hover].PNG
```

Examples:
- `page1_l0_0.PNG` - Page 1, column 0, row 0 (normal state)
- `page1_l0_0_hover.PNG` - Page 1, column 0, row 0 (hover/pressed state)
- `p1title_l0_0.PNG` - Page 1 title section
- `bas_l0_0.PNG` - Basmala section on page 1

**Prefixes**:
- `pageN` - Main content for page N (e.g., `page1`, `page2`)
- `pageNa`, `pageNb`, `pageNc`, etc. - Multiple sections on page N
- `pNtitle` - Title section for page N
- `addressa`, `addressb` - Index/navigation page (page 0)
- `bas` - Basmala (page 1)

### 2. Audio Array Structure

Audio files are organized in `SoundsArray.java` with arrays for each page:

```java
public int[] page1 = {
    R.raw.basmla,      // Index 0
    R.raw.lesson1,     // Index 1
    R.raw.l1geem,      // Index 2
    R.raw.l1sthaa,     // Index 3
    // ... etc
};
```

### 3. Layout Definition

The `ScreenSlidePageFragment.java` file contains `CreateRow()` calls that define:
- Which image prefix to use
- Grid dimensions (rows × columns)
- Position and sizing
- Spacing between items

Example for Page 1:
```java
case 15:  // Page 1
    CreateRow("bas_", ...);        // 1 item (Basmala)
    CreateRow("p1title_", ...);    // 1 item (Title)
    CreateRow("page1_", ...);      // 30 items (6 rows × 5 cols of letters)
```

### 4. Mapping Logic

The mapping follows this sequence:

1. **Grid Creation**: `CreateRow()` creates a grid of buttons
2. **Image Assignment**: Each grid position gets an image based on:
   - Prefix (e.g., "page1_")
   - Column index (l0, l1, l2, ...)
   - Row index (0, 1, 2, ...)

3. **Audio Assignment**: Each button gets sequential audio from the page's array:
   ```
   Button 0 → Audio index 0
   Button 1 → Audio index 1
   Button 2 → Audio index 2
   ...
   ```

4. **Click Handler**: When clicked, a button:
   - Plays its assigned audio file
   - Shows the `_hover` version of its image
   - Updates the background if needed (for special pages like 4, 6, 20)

### 5. Special Cases

Some pages have special behavior:

**Page 4** - Conditional backgrounds:
- Certain buttons trigger `page4_hover1` background
- Other buttons trigger `page4_hover2` background
- Remaining buttons show individual `_hover` images

**Page 6** - Group hover effect:
- Specific buttons show a shared `page6_hover` background

**Page 20** - Similar group behavior:
- Certain buttons trigger `page20_hover` background

## Example: Page 1 Detailed Mapping

Page 1 contains 32 interactive items:

| Section | Prefix | Grid | Items | Audio Start | Description |
|---------|--------|------|-------|-------------|-------------|
| 1 | `bas_` | 1×1 | 1 | 0 | Basmala |
| 2 | `p1title_` | 1×1 | 1 | 1 | Lesson title |
| 3 | `page1_` | 6×5 | 30 | 2 | Arabic letters |

**Detailed Item Mapping**:
```
bas_l0_0       → basmla       (Index 0)
p1title_l0_0   → lesson1      (Index 1)
page1_l0_0     → l1geem       (Index 2)
page1_l1_0     → l1sthaa      (Index 3)
page1_l2_0     → l1taa        (Index 4)
page1_l3_0     → l1baa        (Index 5)
page1_l4_0     → l1alf        (Index 6)
page1_l0_1     → l1raa        (Index 7)
...
page1_l4_5     → l1waw        (Index 31)
```

## Extraction Process

The refactored app uses automated extraction:

### Step 1: Extract Audio Arrays
Parse `SoundsArray.java` to extract all `pageN` arrays with their audio file references.

### Step 2: Parse Layout Information
Parse `ScreenSlidePageFragment.java` to extract:
- CreateRow calls for each page
- Image prefixes used
- Grid dimensions

### Step 3: List Drawable Images
Scan `res/drawable/` directory and group images by prefix:
- Match pattern: `{prefix}_l{col}_{row}`
- Sort by row, then column
- Exclude `_hover` variants from primary list

### Step 4: Generate JSON Mappings
For each page:
1. Get the audio array
2. Get the layout prefixes
3. Match images to audio sequentially
4. Generate structured JSON configuration

### Result
24 JSON files (page0.json through page23.json) containing:
- Page metadata
- Section definitions
- Item mappings with:
  - Image name
  - Audio file name
  - Hover image name
  - Grid position

## JSON Structure Example

```json
{
  "pageId": 1,
  "pageName": "page1",
  "backgroundImage": "page1",
  "helpDialog": "dialog_p1",
  "sections": [
    {
      "sectionId": "section_0",
      "type": "GRID",
      "layout": {
        "rows": 1,
        "cols": 1,
        "position": { "left": 100, "top": 100 },
        "itemSize": { "width": 145, "height": 115 },
        "spacing": { "horizontal": 10, "vertical": 10 }
      },
      "items": [
        {
          "id": "item_0",
          "image": "bas_l0_0",
          "audio": "basmla",
          "hoverImage": "bas_l0_0_hover",
          "gridPosition": { "row": 0, "col": 0 }
        }
      ]
    }
  ]
}
```

## Tools

### `refine_json_configs.py`
Automated script that:
- Extracts audio arrays from `SoundsArray.java`
- Parses layout definitions from `ScreenSlidePageFragment.java`
- Scans drawable images
- Generates JSON configuration files
- Maps images to audio based on grid positions

### Usage
```bash
cd /home/i826753/git/jmasalma/Norani/NewApp
python3 tools/refine_json_configs.py
```

## Notes

- Page 0 (index page) has no audio files - buttons navigate to other pages
- Some pages use "mute" as placeholder audio (silent)
- Title sections (pNtitle) typically have single audio files
- The hover images provide visual feedback when buttons are pressed
- Grid positions are 0-indexed (first row/column is 0)

## References

- Original source: `/home/i826753/git/jmasalma/Norani/apk/`
- Refactored app: `/home/i826753/git/jmasalma/Norani/NewApp/`
- Image resources: `app/src/main/res/drawable/`
- Audio resources: `app/src/main/res/raw/`
- JSON configs: `app/src/main/assets/pages/`
