# نوراني - Norani Arabic Learning Website

A comprehensive web application for learning Arabic reading using the Norani method, featuring 17 progressive lessons with integrated audio pronunciation.

## 🌟 Features

### 📚 17 Structured Lessons
- **Lessons 1-4**: Arabic alphabet letters (الحروف العربية)
- **Lessons 5-8**: Diacritics and vowel marks (الحركات)
- **Lessons 9-17**: Word formation and reading practice (الكلمات والقراءة)

### 🎵 Audio Integration
- 1079+ audio files from the original Norani APK
- Individual letter pronunciation
- Word pronunciation
- Interactive audio controls (Play, Pause, Repeat)

### 🎨 Modern Design
- Beautiful Arabic typography using Amiri and Cairo fonts
- Responsive design for all devices
- Gradient backgrounds and smooth animations
- Right-to-left (RTL) layout support

### 🚀 Interactive Features
- Click-to-select letters and words
- Visual feedback with active states
- Progress tracking across lessons
- Keyboard navigation support
- Local storage for progress saving

## 🛠️ Technical Stack

- **HTML5**: Semantic structure with Arabic language support
- **CSS3**: Modern styling with flexbox/grid, animations, and responsive design
- **JavaScript ES6+**: Object-oriented architecture with class-based components
- **Audio API**: HTML5 audio with error handling and controls

## 📁 Project Structure

```
new-website/
├── index.html              # Main HTML file
├── css/
│   └── style.css          # All styles and responsive design
├── js/
│   ├── lessons.js         # Lesson data and content structure
│   └── app.js            # Main application logic
├── audio/                 # 1079 audio files from APK
│   ├── lesson1.mp3
│   ├── l1alf.mp3
│   ├── p11_word1.mp3
│   └── ... (all audio files)
└── README.md             # This documentation
```

## 🎯 Lesson Progression

### Phase 1: Letters (Lessons 1-4)
1. **الدرس الأول**: Basic Arabic letters (ا، ب، ت، ث، ج، ح، خ، د)
2. **الدرس الثاني**: More letters (ذ، ر، ز، س، ش، ص، ض، ط)
3. **الدرس الثالث**: Remaining letters (ظ، ع، غ، ف، ق، ك، ل، م)
4. **الدرس الرابع**: Final letters (ن، ه، و، ي، ء)

### Phase 2: Diacritics (Lessons 5-8)
5. **الدرس الخامس**: Basic diacritics (فتحة، ضمة، كسرة)
6. **الدرس السادس**: Diacritics on different letters
7. **الدرس السابع**: Advanced diacritics practice
8. **الدرس الثامن**: Complete diacritics mastery

### Phase 3: Words & Reading (Lessons 9-17)
9. **الدرس التاسع**: Simple word formation
10. **الدرس العاشر**: More simple words
11. **الدرس الحادي عشر**: Words with different diacritics
12. **الدرس الثاني عشر**: Complex words
13. **الدرس الثالث عشر**: Words with damma
14. **الدرس الرابع عشر**: Words with kasra
15. **الدرس الخامس عشر**: Compound words
16. **الدرس السادس عشر**: Simple sentences
17. **الدرس السابع عشر**: Final review

## 🎮 Usage Instructions

### Navigation
- **Next/Previous Buttons**: Navigate between lessons
- **Lesson Grid**: Click any lesson number to jump directly
- **Keyboard Shortcuts**:
  - `←/→`: Next/Previous lesson
  - `↑/↓`: Navigate items within lesson
  - `Space`: Play/Pause audio
  - `R`: Repeat audio

### Learning Flow
1. Start with Lesson 1 (Arabic letters)
2. Click on letters/words to hear pronunciation
3. Use audio controls to repeat and practice
4. Progress through lessons sequentially
5. Your progress is automatically saved

### Audio Features
- **Play Button (▶️)**: Start audio playback
- **Pause Button (⏸️)**: Pause current audio
- **Repeat Button (🔄)**: Replay current audio
- Individual letter/word audio on click

## 🔧 Setup & Installation

1. **Clone or Download**: Get the project files
2. **Audio Files**: Ensure all 1079 audio files are in the `audio/` directory
3. **Web Server**: Serve files through a web server (required for audio loading)
4. **Open**: Navigate to `index.html` in your browser

### Local Development
```bash
# Using Python 3
python -m http.server 8000

# Using Node.js
npx serve .

# Using PHP
php -S localhost:8000
```

## 📱 Browser Compatibility

- ✅ Chrome 60+
- ✅ Firefox 55+
- ✅ Safari 12+
- ✅ Edge 79+
- ✅ Mobile browsers (iOS Safari, Chrome Mobile)

## 🎨 Design Features

### Typography
- **Amiri**: Traditional Arabic serif font for letters and titles
- **Cairo**: Modern Arabic sans-serif for UI elements
- Proper Arabic text rendering and ligatures

### Color Scheme
- **Primary Gradient**: Purple to blue (#667eea to #764ba2)
- **Accent Colors**: Green for audio controls, various states
- **Background**: Semi-transparent white cards over gradient

### Responsive Design
- Mobile-first approach
- Flexible grid layouts
- Touch-friendly interface
- Optimized for tablets and phones

## 🚀 Performance Features

- **Lazy Loading**: Audio files loaded on demand
- **Local Storage**: Progress and preferences saved locally
- **Efficient DOM**: Minimal reflows and repaints
- **Optimized Assets**: Compressed and optimized resources

## 🔮 Future Enhancements

- [ ] User accounts and cloud sync
- [ ] Achievement system and badges
- [ ] Voice recognition for pronunciation practice
- [ ] Additional lesson packs
- [ ] Offline mode with service workers
- [ ] Multi-language interface support

## 📄 License

This project uses audio content from the original Norani APK. Please ensure compliance with original licensing terms.

## 🤝 Contributing

Contributions welcome! Areas for improvement:
- Additional lesson content
- UI/UX enhancements
- Performance optimizations
- Accessibility improvements
- Translation support

## 📞 Support

For issues or questions:
1. Check browser console for errors
2. Ensure audio files are properly loaded
3. Verify web server is serving files correctly
4. Test with different browsers

---

**Built with ❤️ for Arabic language learners worldwide**

*نوراني - تعلم القراءة العربية بطريقة نوراني*
