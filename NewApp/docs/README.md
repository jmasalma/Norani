# Norani Web App - GitHub Pages Version

This is a web-based version of the Norani educational app, designed to be hosted on GitHub Pages.

## 📱 About Norani App

Norani is an interactive educational application for teaching Arabic letters through audio-visual lessons. The app features:

- 24 interactive pages with Arabic letters and sounds
- Audio playback for each letter
- Sequential playback of all items on a page
- Repeat mode with counter
- Help dialogs for each page
- Beautiful, responsive interface

## 🚀 Hosting on GitHub Pages

### Prerequisites

Before deploying to GitHub Pages, you need to copy the necessary assets from the Android app:

1. **Copy JSON configurations** (already in place):
   - Located in `../app/src/main/assets/pages/`
   - Contains page0.json through page23.json

2. **Copy images** (required):
   - Source: `../app/src/main/res/drawable/`
   - All PNG images including backgrounds, interactive items, and hover states

3. **Copy audio files** (required):
   - Source: `../app/src/main/res/raw/`
   - All MP3 audio files for letters and sounds

### Setup Instructions

#### Option 1: Using GitHub Web Interface

1. Go to your repository on GitHub
2. Navigate to Settings → Pages
3. Under "Source", select the branch (usually `main` or `master`)
4. Select `/docs` as the folder
5. Click Save
6. Your site will be published at `https://[username].github.io/[repository-name]/`

#### Option 2: Using Git Command Line

```bash
# Make sure you're in the NewApp directory
cd /home/i826753/git/jmasalma/Norani/NewApp

# Add and commit all files
git add docs/
git commit -m "Add web version for GitHub Pages"

# Push to GitHub
git push origin main
```

Then enable GitHub Pages in repository settings as described in Option 1.

## 📁 Required File Structure

For the web app to work properly, maintain this structure:

```
docs/
├── index.html          # Main HTML file
├── styles.css          # Styles
├── app.js             # Application logic
├── README.md          # This file
└── (Copy these from Android project)
    └── app/
        └── src/
            └── main/
                ├── assets/
                │   └── pages/     # JSON page configurations
                ├── res/
                    ├── drawable/  # Images (PNG files)
                    └── raw/       # Audio files (MP3)
```

## 🛠️ Local Development

To test the web app locally:

1. You need a local web server (browsers restrict file:// protocol for security)

### Using Python:
```bash
cd docs
python3 -m http.server 8000
```

### Using Node.js:
```bash
cd docs
npx http-server
```

### Using VS Code:
Install the "Live Server" extension and right-click on `index.html` → "Open with Live Server"

Then visit: `http://localhost:8000`

## 🎨 Features

### Navigation
- **Previous/Next buttons**: Navigate between pages
- **Page selector**: Jump directly to any page
- **Keyboard shortcuts**: 
  - Arrow Left/Right: Navigate pages
  - Escape: Close help dialog

### Audio Controls
- **Play All**: Play all items on the current page sequentially
- **Pause**: Pause/resume playback
- **Stop**: Stop playback and reset
- **Repeat**: Enable repeat mode with counter

### Interactive Elements
- Click any letter/item to hear its pronunciation
- Hover over items to see hover state (if available)
- Visual feedback during audio playback

### Help System
- Click the "?" button to view page-specific help
- Help dialogs provide guidance for each lesson

## 🌐 Browser Compatibility

Tested and working on:
- ✅ Chrome/Chromium (Latest)
- ✅ Firefox (Latest)
- ✅ Safari (Latest)
- ✅ Edge (Latest)

## 📱 Responsive Design

The app is fully responsive and works on:
- Desktop computers
- Tablets
- Mobile phones (portrait and landscape)

## 🔧 Customization

### Changing Colors
Edit `styles.css` and modify the CSS variables or color values:
- Primary color: `#667eea`
- Accent color: `#764ba2`
- Error color: `#ff4757`

### Adding New Pages
1. Create a new JSON file in `app/src/main/assets/pages/`
2. Follow the existing page structure
3. Add corresponding images and audio files
4. Update `totalPages` in `app.js` if needed

## 🐛 Troubleshooting

### Images Not Loading
- Check that PNG files exist in the correct location
- Some images may have `.PNG` extension (uppercase) - the code handles both
- Check browser console for 404 errors

### Audio Not Playing
- Verify MP3 files are in `app/src/main/res/raw/`
- Check browser console for audio loading errors
- Some browsers require user interaction before playing audio

### JSON Not Loading
- Ensure all page JSON files are in `app/src/main/assets/pages/`
- Check browser console for fetch errors
- Verify JSON syntax is valid

## 📄 License

[Specify your license here]

## 👥 Contributing

Contributions are welcome! Please feel free to submit issues or pull requests.

## 📧 Contact

For questions or support, please contact [your contact information].

---

**Note**: This is a web adaptation of the Android Norani app, maintaining all original functionality with improved accessibility and cross-platform compatibility.
