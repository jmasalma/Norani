// Norani Qaida Flashcard Application
class NoraniFlashcards {
    constructor() {
        this.currentLesson = null;
        this.currentCardIndex = 0;
        this.isFlipped = false;
        this.cards = [];
        this.shuffled = false;
        
        this.initializeElements();
        this.bindEvents();
        this.showMenu();
    }
    
    initializeElements() {
        // Navigation elements
        this.navButtons = document.querySelectorAll('.nav-btn');
        this.lessonTitle = document.getElementById('lesson-title');
        this.lessonDescription = document.getElementById('lesson-description');
        this.lessonInfo = document.querySelector('.lesson-info');
        
        // Flashcard elements
        this.flashcardContainer = document.getElementById('flashcard-container');
        this.flashcard = document.getElementById('flashcard');
        this.arabicText = document.getElementById('arabic-text');
        this.hint = document.getElementById('hint');
        this.transliteration = document.getElementById('transliteration');
        this.pronunciation = document.getElementById('pronunciation');
        this.explanation = document.getElementById('explanation');
        
        // Progress elements
        this.progressFill = document.getElementById('progress-fill');
        this.progressText = document.getElementById('progress-text');
        
        // Control buttons
        this.flipBtn = document.getElementById('flip-btn');
        this.prevBtn = document.getElementById('prev-btn');
        this.nextBtn = document.getElementById('next-btn');
        this.shuffleBtn = document.getElementById('shuffle-btn');
        this.restartBtn = document.getElementById('restart-btn');
        this.backToMenuBtn = document.getElementById('back-to-menu');
    }
    
    bindEvents() {
        // Navigation buttons
        this.navButtons.forEach(btn => {
            btn.addEventListener('click', (e) => {
                const lessonNum = parseInt(e.target.dataset.lesson);
                this.loadLesson(lessonNum);
            });
        });
        
        // Control buttons
        this.flipBtn.addEventListener('click', () => this.flipCard());
        this.prevBtn.addEventListener('click', () => this.previousCard());
        this.nextBtn.addEventListener('click', () => this.nextCard());
        this.shuffleBtn.addEventListener('click', () => this.shuffleCards());
        this.restartBtn.addEventListener('click', () => this.restartLesson());
        this.backToMenuBtn.addEventListener('click', () => this.showMenu());
        
        // Flashcard click to flip
        this.flashcard.addEventListener('click', () => this.flipCard());
        
        // Keyboard navigation
        document.addEventListener('keydown', (e) => {
            if (this.currentLesson) {
                switch(e.key) {
                    case ' ':
                    case 'Enter':
                        e.preventDefault();
                        this.flipCard();
                        break;
                    case 'ArrowLeft':
                        e.preventDefault();
                        this.previousCard();
                        break;
                    case 'ArrowRight':
                        e.preventDefault();
                        this.nextCard();
                        break;
                    case 'r':
                    case 'R':
                        if (e.ctrlKey || e.metaKey) {
                            e.preventDefault();
                            this.restartLesson();
                        }
                        break;
                    case 's':
                    case 'S':
                        if (e.ctrlKey || e.metaKey) {
                            e.preventDefault();
                            this.shuffleCards();
                        }
                        break;
                    case 'Escape':
                        this.showMenu();
                        break;
                }
            }
        });
    }
    
    loadLesson(lessonNum) {
        if (!flashcardsData[lessonNum]) {
            console.error('Lesson not found:', lessonNum);
            return;
        }
        
        this.currentLesson = lessonNum;
        this.cards = [...flashcardsData[lessonNum].cards];
        this.currentCardIndex = 0;
        this.shuffled = false;
        
        // Update UI
        this.updateNavButtons();
        this.lessonTitle.textContent = flashcardsData[lessonNum].title;
        this.lessonDescription.textContent = flashcardsData[lessonNum].description;
        
        // Show flashcard container and hide menu
        this.flashcardContainer.style.display = 'block';
        this.lessonInfo.style.display = 'none';
        
        // Load first card
        this.loadCard();
        this.updateProgress();
        this.updateControls();
    }
    
    loadCard() {
        if (!this.cards[this.currentCardIndex]) return;
        
        const card = this.cards[this.currentCardIndex];
        
        // Reset flip state
        this.isFlipped = false;
        this.flashcard.classList.remove('flipped');
        this.flipBtn.textContent = 'Show Answer';
        
        // Load front side
        this.arabicText.textContent = card.arabic;
        this.hint.textContent = card.hint;
        
        // Load back side
        this.transliteration.textContent = card.transliteration;
        this.pronunciation.textContent = `[${card.pronunciation}]`;
        this.explanation.textContent = card.explanation;
        
        // Add animation
        this.flashcard.style.animation = 'none';
        this.flashcard.offsetHeight; // Trigger reflow
        this.flashcard.style.animation = 'cardSlide 0.3s ease-out';
    }
    
    flipCard() {
        this.isFlipped = !this.isFlipped;
        this.flashcard.classList.toggle('flipped');
        this.flipBtn.textContent = this.isFlipped ? 'Show Question' : 'Show Answer';
    }
    
    nextCard() {
        if (this.currentCardIndex < this.cards.length - 1) {
            this.currentCardIndex++;
            this.loadCard();
            this.updateProgress();
            this.updateControls();
        }
    }
    
    previousCard() {
        if (this.currentCardIndex > 0) {
            this.currentCardIndex--;
            this.loadCard();
            this.updateProgress();
            this.updateControls();
        }
    }
    
    shuffleCards() {
        // Fisher-Yates shuffle algorithm
        for (let i = this.cards.length - 1; i > 0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [this.cards[i], this.cards[j]] = [this.cards[j], this.cards[i]];
        }
        
        this.shuffled = true;
        this.currentCardIndex = 0;
        this.loadCard();
        this.updateProgress();
        this.updateControls();
        
        // Visual feedback
        this.shuffleBtn.textContent = 'Shuffled!';
        setTimeout(() => {
            this.shuffleBtn.textContent = 'Shuffle';
        }, 1000);
    }
    
    restartLesson() {
        if (this.currentLesson) {
            this.loadLesson(this.currentLesson);
        }
    }
    
    showMenu() {
        this.currentLesson = null;
        this.flashcardContainer.style.display = 'none';
        this.lessonInfo.style.display = 'block';
        this.lessonTitle.textContent = 'Select a lesson to begin';
        this.lessonDescription.textContent = 'Choose a lesson from the navigation above to start learning.';
        this.updateNavButtons();
    }
    
    updateNavButtons() {
        this.navButtons.forEach(btn => {
            const lessonNum = parseInt(btn.dataset.lesson);
            if (lessonNum === this.currentLesson) {
                btn.classList.add('active');
            } else {
                btn.classList.remove('active');
            }
        });
    }
    
    updateProgress() {
        if (!this.cards.length) return;
        
        const progress = ((this.currentCardIndex + 1) / this.cards.length) * 100;
        this.progressFill.style.width = `${progress}%`;
        this.progressText.textContent = `${this.currentCardIndex + 1} / ${this.cards.length}`;
    }
    
    updateControls() {
        // Update previous button
        this.prevBtn.disabled = this.currentCardIndex === 0;
        
        // Update next button
        this.nextBtn.disabled = this.currentCardIndex === this.cards.length - 1;
        
        // Update shuffle button text
        if (this.shuffled) {
            this.shuffleBtn.textContent = 'Shuffle Again';
        } else {
            this.shuffleBtn.textContent = 'Shuffle';
        }
    }
}

// Add CSS animations
const style = document.createElement('style');
style.textContent = `
    @keyframes cardSlide {
        from {
            transform: translateX(20px);
            opacity: 0;
        }
        to {
            transform: translateX(0);
            opacity: 1;
        }
    }
    
    @keyframes pulse {
        0% { transform: scale(1); }
        50% { transform: scale(1.05); }
        100% { transform: scale(1); }
    }
    
    .nav-btn.active {
        animation: pulse 0.3s ease-out;
    }
    
    .control-btn:active {
        transform: translateY(1px);
    }
    
    .flashcard-inner {
        transition: transform 0.6s cubic-bezier(0.4, 0.0, 0.2, 1);
    }
    
    .progress-fill {
        transition: width 0.5s cubic-bezier(0.4, 0.0, 0.2, 1);
    }
    
    /* Responsive improvements */
    @media (max-width: 768px) {
        .controls {
            gap: 10px;
        }
        
        .control-btn {
            padding: 10px 16px;
            font-size: 0.9rem;
        }
    }
    
    /* Focus styles for accessibility */
    .control-btn:focus,
    .nav-btn:focus {
        outline: 2px solid #3498db;
        outline-offset: 2px;
    }
    
    /* High contrast mode support */
    @media (prefers-contrast: high) {
        .flashcard-front,
        .flashcard-back {
            border: 2px solid #000;
        }
        
        .control-btn {
            border: 2px solid #000;
        }
    }
    
    /* Reduced motion support */
    @media (prefers-reduced-motion: reduce) {
        .flashcard-inner {
            transition: none;
        }
        
        .progress-fill {
            transition: none;
        }
        
        @keyframes cardSlide {
            from, to {
                transform: translateX(0);
                opacity: 1;
            }
        }
    }
`;
document.head.appendChild(style);

// Initialize the application when DOM is loaded
document.addEventListener('DOMContentLoaded', () => {
    new NoraniFlashcards();
});

// Add service worker for offline functionality (optional)
if ('serviceWorker' in navigator) {
    window.addEventListener('load', () => {
        navigator.serviceWorker.register('/sw.js')
            .then(registration => {
                console.log('SW registered: ', registration);
            })
            .catch(registrationError => {
                console.log('SW registration failed: ', registrationError);
            });
    });
}
