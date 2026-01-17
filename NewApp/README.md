# Norani App - Clean Architecture Refactor

## Overview

This is a complete refactoring of the Norani educational app with a modern, maintainable architecture. The app teaches Arabic letters through interactive audio-visual lessons across 23 pages.

## Key Improvements

### 🎯 Architecture
- **Clean Architecture**: Clear separation of Data, Domain, and Presentation layers
- **MVVM Pattern**: ViewModel + LiveData for lifecycle-aware UI
- **Repository Pattern**: Centralized data management
- **Dependency Injection**: Ready for Hilt/Koin integration

### 📊 Data-Driven Design
- **JSON Configuration**: All page layouts defined in JSON files
- **No Hardcoded Arrays**: Easy to add/modify content without code changes
- **Flexible Layouts**: Support for grids, single items, and custom layouts

### 🧪 Testability
- **Unit Tests**: Business logic is testable
- **Mock Data**: Test without actual resources
- **Clear Dependencies**: Easy to mock and inject

## Project Structure

```
NewApp/
├── app/src/main/
│   ├── java/com/norani/refactored/
│   │   ├── data/
│   │   │   ├── models/           # Data classes (Page, Item, etc.)
│   │   │   ├── repository/       # Data access layer
│   │   │   └── local/            # JSON parsing
│   │   ├── domain/
│   │   │   └── usecases/         # Business logic
│   │   ├── presentation/
│   │   │   ├── main/             # MainActivity
│   │   │   ├── page/             # Page fragments & ViewModels
│   │   │   ├── components/       # Reusable UI components
│   │   │   └── utils/            # Helper classes
│   │   └── di/                   # Dependency injection
│   ├── assets/pages/             # JSON page configurations
│   └── res/                      # Android resources
├── docs/                         # Additional documentation
└── README.md
```

## Core Components

### Data Models

**Page**: Represents a single lesson page
- ID, name, background image
- Help dialog resource
- List of sections (header, grid, custom)

**PageSection**: A logical grouping of interactive items
- Section type (SINGLE, GRID, CUSTOM)
- Layout information
- List of interactive items

**InteractiveItem**: A clickable button with audio
- Image resource (normal and hover)
- Audio resource
- Position and size
- Unique identifier

### Key Features

1. **Audio Playback**
   - Sequential playback of all items on a page
   - Individual item playback
   - Play, pause, stop, repeat controls
   - Repeat counter

2. **Page Navigation**
   - ViewPager2 for smooth swiping
   - Go-to page functionality
   - 23 pages total (index page + 22 lesson pages)

3. **Visual Feedback**
   - Hover state images
   - Special background changes for certain pages
   - Help dialog overlays

4. **Media Controls**
   - Play all items in sequence
   - Pause/resume functionality
   - Stop and reset
   - Repeat mode with counter

## JSON Configuration Format

```json
{
  "pageId": 1,
  "pageName": "page1",
  "backgroundImage": "page1_bg",
  "helpDialog": "dialog_p1",
  "sections": [
    {
      "sectionId": "header",
      "type": "SINGLE",
      "items": [
        {
          "id": "basmla",
          "image": "bas_l0_0",
          "audio": "basmla",
          "position": {"left": 300, "top": 50},
          "size": {"width": 672, "height": 130}
        }
      ]
    },
    {
      "sectionId": "letters",
      "type": "GRID",
      "layout": {
        "rows": 6,
        "cols": 5,
        "position": {"left": 103, "top": 200},
        "itemSize": {"width": 205, "height": 161},
        "spacing": {"horizontal": 11, "vertical": 12}
      },
      "items": [
        {"id": "l1_alf", "image": "page1_l0_0", "audio": "l1alf"},
        {"id": "l1_baa", "image": "page1_l1_0", "audio": "l1baa"}
      ]
    }
  ]
}
```

## Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- Kotlin 1.8+
- Android SDK 24+ (minimum)
- Gradle 8.0+

### Setup

1. **Copy Resources**
   ```bash
   # Copy drawable images from old APK
   cp -r ../apk/res/drawable/* app/src/main/res/drawable/
   
   # Copy audio files
   cp -r ../apk/res/raw/* app/src/main/res/raw/
   ```

2. **Open in Android Studio**
   - Open the NewApp folder as an Android project
   - Let Gradle sync
   - Build the project

3. **Run**
   - Connect device or start emulator
   - Run the app from Android Studio

## Adding New Pages

1. Create a JSON file in `app/src/main/assets/pages/`
   ```bash
   touch app/src/main/assets/pages/page24.json
   ```

2. Define the page structure (follow existing examples)

3. Add images to `res/drawable/`

4. Add audio to `res/raw/`

5. That's it! No code changes needed.

## Technology Stack

- **Language**: Kotlin
- **UI**: XML layouts with ViewBinding
- **Architecture**: MVVM + Clean Architecture
- **Async**: Kotlin Coroutines
- **State Management**: LiveData / StateFlow
- **Navigation**: ViewPager2
- **JSON Parsing**: kotlinx.serialization (or Gson)
- **Audio**: MediaPlayer / ExoPlayer

## Migration from Old App

The old app had:
- Hardcoded arrays in `SoundsArray.java`
- Massive switch statements in `LoadGame()`
- Tight coupling between UI and data
- Difficult to modify or extend

The new app has:
- JSON configuration files
- Data-driven UI generation
- Clear separation of concerns
- Easy to maintain and extend

## Development Roadmap

- [x] Architecture design
- [x] Data models
- [x] JSON configuration system
- [ ] Core repository implementation
- [ ] Audio player service
- [ ] Page fragment with ViewPager2
- [ ] Media controls UI
- [ ] Help dialog system
- [ ] Testing suite
- [ ] Documentation

## Contributing

When adding features:
1. Follow the existing architecture patterns
2. Add unit tests for business logic
3. Update documentation
4. Use meaningful commit messages

## License

[Specify your license here]

## Contact

[Your contact information]

---

**Note**: This is a refactored version maintaining all original functionality with improved code quality and maintainability.
