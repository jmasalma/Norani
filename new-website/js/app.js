// Norani App - Main Application Logic
class NoraniApp {
    constructor() {
        this.currentLessonIndex = 0;
        this.currentItemIndex = 0;
        this.audioPlayer = null;
        this.isPlaying = false;
        this.autoPlay = false;
        
        this.init();
    }

    init() {
        this.setupElements();
        this.setupEventListeners();
        this.loadLesson(0);
        this.createLessonGrid();
    }

    setupElements() {
        // Navigation elements
        this.prevBtn = document.getElementById('prevBtn');
        this.nextBtn = document.getElementById('nextBtn');
        this.lessonCounter = document.getElementById('lessonCounter');
        
        // Content elements
        this.lessonTitle = document.getElementById('lessonTitle');
        this.lessonContent = document.getElementById('lessonContent');
        this.progressFill = document.getElementById('progressFill');
        
        // Audio elements
        this.audioPlayer = document.getElementById('audioPlayer');
        this.audioSource = document.getElementById('audioSource');
        this.playBtn = document.getElementById('playBtn');
        this.pauseBtn = document.getElementById('pauseBtn');
        this.repeatBtn = document.getElementById('repeatBtn');
        
        // Lesson grid
        this.lessonGrid = document.getElementById('lessonGrid');
    }

    setupEventListeners() {
        // Navigation buttons
        this.prevBtn.addEventListener('click', () => this.previousLesson());
        this.nextBtn.addEventListener('click', () => this.nextLesson());
        
        // Audio controls
        this.playBtn.addEventListener('click', () => this.playAudio());
        this.pauseBtn.addEventListener('click', () => this.pauseAudio());
        this.repeatBtn.addEventListener('click', () => this.repeatAudio());
        
        // Audio player events
        this.audioPlayer.addEventListener('ended', () => this.onAudioEnded());
        this.audioPlayer.addEventListener('play', () => this.onAudioPlay());
        this.audioPlayer.addEventListener('pause', () => this.onAudioPause());
        this.audioPlayer.addEventListener('error', (e) => this.onAudioError(e));
        
        // Keyboard navigation
        document.addEventListener('keydown', (e) => this.handleKeyboard(e));
    }

    loadLesson(index) {
        if (index < 0 || index >= lessons.length) return;
        
        this.currentLessonIndex = index;
        this.currentItemIndex = 0;
        
        const lesson = lessons[index];
        
        // Update UI
        this.updateLessonTitle(lesson);
        this.updateLessonCounter();
        this.updateNavigationButtons();
        this.updateProgressBar();
        this.renderLessonContent(lesson);
        this.updateLessonGrid();
        
        // Load main lesson audio
        this.loadAudio(lesson.mainAudio);
        
        // Add fade-in animation
        this.lessonContent.classList.add('fade-in');
        setTimeout(() => {
            this.lessonContent.classList.remove('fade-in');
        }, 500);
    }

    updateLessonTitle(lesson) {
        this.lessonTitle.textContent = lesson.title;
        document.title = `نوراني - ${lesson.title}`;
    }

    updateLessonCounter() {
        this.lessonCounter.textContent = `الدرس ${this.currentLessonIndex + 1} من ${lessons.length}`;
    }

    updateNavigationButtons() {
        this.prevBtn.disabled = this.currentLessonIndex === 0;
        this.nextBtn.disabled = this.currentLessonIndex === lessons.length - 1;
    }

    updateProgressBar() {
        const progress = ((this.currentLessonIndex + 1) / lessons.length) * 100;
        this.progressFill.style.width = `${progress}%`;
    }

    renderLessonContent(lesson) {
        this.lessonContent.innerHTML = '';
        
        // Add lesson description
        const description = document.createElement('div');
        description.className = 'lesson-description';
        description.innerHTML = `<p style="text-align: center; font-size: 1.2rem; margin-bottom: 30px; color: #4a5568;">${lesson.description}</p>`;
        this.lessonContent.appendChild(description);
        
        if (lesson.type === 'letters' || lesson.type === 'harakat') {
            this.renderLetterGrid(lesson.content.letters);
        } else if (lesson.type === 'words' || lesson.type === 'sentences' || lesson.type === 'review') {
            this.renderWordGrid(lesson.content.words);
        }
    }

    renderLetterGrid(letters) {
        const grid = document.createElement('div');
        grid.className = 'letter-grid';
        
        letters.forEach((letter, index) => {
            const card = document.createElement('div');
            card.className = 'letter-card';
            card.innerHTML = `
                <span class="arabic-letter">${letter.arabic}</span>
                <span class="letter-name">${letter.name}</span>
            `;
            
            card.addEventListener('click', () => {
                this.selectItem(index);
                this.playItemAudio(letter.audio);
            });
            
            grid.appendChild(card);
        });
        
        this.lessonContent.appendChild(grid);
    }

    renderWordGrid(words) {
        const grid = document.createElement('div');
        grid.className = 'word-grid';
        
        words.forEach((word, index) => {
            const card = document.createElement('div');
            card.className = 'word-card';
            card.innerHTML = `
                <span class="arabic-word">${word.arabic}</span>
            `;
            
            card.addEventListener('click', () => {
                this.selectItem(index);
                this.playItemAudio(word.audio);
            });
            
            grid.appendChild(card);
        });
        
        this.lessonContent.appendChild(grid);
    }

    selectItem(index) {
        this.currentItemIndex = index;
        
        // Remove active class from all items
        const cards = this.lessonContent.querySelectorAll('.letter-card, .word-card');
        cards.forEach(card => card.classList.remove('active'));
        
        // Add active class to selected item
        if (cards[index]) {
            cards[index].classList.add('active');
        }
    }

    createLessonGrid() {
        this.lessonGrid.innerHTML = '';
        
        lessons.forEach((lesson, index) => {
            const item = document.createElement('div');
            item.className = 'lesson-item';
            if (index === this.currentLessonIndex) {
                item.classList.add('active');
            }
            
            item.innerHTML = `
                <div class="lesson-number">${index + 1}</div>
                <div class="lesson-description">${lesson.description}</div>
            `;
            
            item.addEventListener('click', () => {
                this.loadLesson(index);
            });
            
            this.lessonGrid.appendChild(item);
        });
    }

    updateLessonGrid() {
        const items = this.lessonGrid.querySelectorAll('.lesson-item');
        items.forEach((item, index) => {
            item.classList.toggle('active', index === this.currentLessonIndex);
        });
    }

    // Audio Management
    loadAudio(audioFile) {
        if (!audioFile) return;
        
        const audioPath = `audio/${audioFile}`;
        this.audioSource.src = audioPath;
        this.audioPlayer.load();
        
        // Reset audio controls
        this.showPlayButton();
    }

    playAudio() {
        if (this.audioPlayer.src) {
            this.audioPlayer.play().catch(e => {
                console.error('Error playing audio:', e);
                this.showError('خطأ في تشغيل الصوت');
            });
        }
    }

    pauseAudio() {
        this.audioPlayer.pause();
    }

    repeatAudio() {
        this.audioPlayer.currentTime = 0;
        this.playAudio();
    }

    playItemAudio(audioFile) {
        if (audioFile) {
            this.loadAudio(audioFile);
            setTimeout(() => this.playAudio(), 100);
        }
    }

    onAudioPlay() {
        this.isPlaying = true;
        this.showPauseButton();
    }

    onAudioPause() {
        this.isPlaying = false;
        this.showPlayButton();
    }

    onAudioEnded() {
        this.isPlaying = false;
        this.showPlayButton();
        
        // Auto-advance to next item if enabled
        if (this.autoPlay) {
            this.nextItem();
        }
    }

    onAudioError(e) {
        console.error('Audio error:', e);
        this.showError('خطأ في تحميل الملف الصوتي');
        this.showPlayButton();
    }

    showPlayButton() {
        this.playBtn.style.display = 'inline-block';
        this.pauseBtn.style.display = 'none';
    }

    showPauseButton() {
        this.playBtn.style.display = 'none';
        this.pauseBtn.style.display = 'inline-block';
    }

    // Navigation
    previousLesson() {
        if (this.currentLessonIndex > 0) {
            this.loadLesson(this.currentLessonIndex - 1);
        }
    }

    nextLesson() {
        if (this.currentLessonIndex < lessons.length - 1) {
            this.loadLesson(this.currentLessonIndex + 1);
        }
    }

    nextItem() {
        const lesson = lessons[this.currentLessonIndex];
        const items = lesson.content.letters || lesson.content.words;
        
        if (this.currentItemIndex < items.length - 1) {
            this.selectItem(this.currentItemIndex + 1);
            const nextItem = items[this.currentItemIndex];
            this.playItemAudio(nextItem.audio);
        } else {
            // Move to next lesson
            this.nextLesson();
        }
    }

    previousItem() {
        if (this.currentItemIndex > 0) {
            this.selectItem(this.currentItemIndex - 1);
            const lesson = lessons[this.currentLessonIndex];
            const items = lesson.content.letters || lesson.content.words;
            const prevItem = items[this.currentItemIndex];
            this.playItemAudio(prevItem.audio);
        }
    }

    // Keyboard Navigation
    handleKeyboard(e) {
        switch(e.key) {
            case 'ArrowLeft':
                e.preventDefault();
                this.nextLesson();
                break;
            case 'ArrowRight':
                e.preventDefault();
                this.previousLesson();
                break;
            case 'ArrowUp':
                e.preventDefault();
                this.previousItem();
                break;
            case 'ArrowDown':
                e.preventDefault();
                this.nextItem();
                break;
            case ' ':
                e.preventDefault();
                if (this.isPlaying) {
                    this.pauseAudio();
                } else {
                    this.playAudio();
                }
                break;
            case 'r':
            case 'R':
                e.preventDefault();
                this.repeatAudio();
                break;
        }
    }

    // Utility Methods
    showError(message) {
        // Create a simple error notification
        const errorDiv = document.createElement('div');
        errorDiv.style.cssText = `
            position: fixed;
            top: 20px;
            right: 20px;
            background: #fed7d7;
            color: #c53030;
            padding: 15px 20px;
            border-radius: 8px;
            border: 1px solid #feb2b2;
            z-index: 1000;
            font-family: 'Cairo', sans-serif;
        `;
        errorDiv.textContent = message;
        
        document.body.appendChild(errorDiv);
        
        setTimeout(() => {
            document.body.removeChild(errorDiv);
        }, 3000);
    }

    // Save/Load Progress (using localStorage)
    saveProgress() {
        const progress = {
            currentLessonIndex: this.currentLessonIndex,
            currentItemIndex: this.currentItemIndex,
            completedLessons: this.getCompletedLessons()
        };
        localStorage.setItem('noraniProgress', JSON.stringify(progress));
    }

    loadProgress() {
        const saved = localStorage.getItem('noraniProgress');
        if (saved) {
            try {
                const progress = JSON.parse(saved);
                this.currentLessonIndex = progress.currentLessonIndex || 0;
                this.currentItemIndex = progress.currentItemIndex || 0;
                return progress;
            } catch (e) {
                console.error('Error loading progress:', e);
            }
        }
        return null;
    }

    getCompletedLessons() {
        // This could be expanded to track which lessons are completed
        return [];
    }
}

// Initialize the app when the page loads
document.addEventListener('DOMContentLoaded', () => {
    window.noraniApp = new NoraniApp();
    
    // Load saved progress
    const progress = window.noraniApp.loadProgress();
    if (progress) {
        window.noraniApp.loadLesson(progress.currentLessonIndex);
    }
    
    // Save progress periodically
    setInterval(() => {
        window.noraniApp.saveProgress();
    }, 30000); // Save every 30 seconds
});

// Save progress before page unload
window.addEventListener('beforeunload', () => {
    if (window.noraniApp) {
        window.noraniApp.saveProgress();
    }
});
