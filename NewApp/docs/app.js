// Norani Web App - Main Application Logic

class NoraniApp {
    constructor() {
        this.currentPage = 0;
        this.totalPages = 24;
        this.pages = [];
        this.audioPlayer = null;
        this.currentAudioIndex = 0;
        this.isPlaying = false;
        this.isPaused = false;
        this.repeatMode = false;
        this.repeatCount = 0;
        this.currentAudioPlaylist = [];
        
        this.init();
    }

    async init() {
        this.showLoading(true);
        
        try {
            // Load all page configurations
            await this.loadAllPages();
            
            // Setup UI elements
            this.setupEventListeners();
            this.populatePageSelector();
            
            // Load the first page
            await this.loadPage(0);
            
            this.showLoading(false);
        } catch (error) {
            console.error('Error initializing app:', error);
            this.showError();
        }
    }

    async loadAllPages() {
        const promises = [];
        for (let i = 0; i < this.totalPages; i++) {
            promises.push(this.fetchPageConfig(i));
        }
        
        this.pages = await Promise.all(promises);
    }

    async fetchPageConfig(pageNumber) {
        try {
            const response = await fetch(`../app/src/main/assets/pages/page${pageNumber}.json`);
            if (!response.ok) {
                throw new Error(`Failed to load page${pageNumber}.json`);
            }
            return await response.json();
        } catch (error) {
            console.error(`Error loading page ${pageNumber}:`, error);
            return null;
        }
    }

    setupEventListeners() {
        // Navigation
        document.getElementById('prev-btn').addEventListener('click', () => this.navigatePage(-1));
        document.getElementById('next-btn').addEventListener('click', () => this.navigatePage(1));
        document.getElementById('page-select').addEventListener('change', (e) => {
            this.loadPage(parseInt(e.target.value));
        });

        // Audio controls
        document.getElementById('play-all-btn').addEventListener('click', () => this.playAll());
        document.getElementById('pause-btn').addEventListener('click', () => this.pause());
        document.getElementById('stop-btn').addEventListener('click', () => this.stop());
        document.getElementById('repeat-btn').addEventListener('click', () => this.toggleRepeat());

        // Help dialog
        document.getElementById('help-btn').addEventListener('click', () => this.showHelp());
        document.getElementById('close-dialog').addEventListener('click', () => this.closeHelp());
        document.getElementById('dialog-overlay').addEventListener('click', () => this.closeHelp());

        // Keyboard navigation
        document.addEventListener('keydown', (e) => {
            if (e.key === 'ArrowLeft') this.navigatePage(-1);
            if (e.key === 'ArrowRight') this.navigatePage(1);
            if (e.key === 'Escape') this.closeHelp();
        });
    }

    populatePageSelector() {
        const select = document.getElementById('page-select');
        select.innerHTML = '';
        
        for (let i = 0; i < this.totalPages; i++) {
            const option = document.createElement('option');
            option.value = i;
            option.textContent = `صفحة ${i + 1}`;
            select.appendChild(option);
        }
    }

    async loadPage(pageNumber) {
        if (pageNumber < 0 || pageNumber >= this.totalPages) return;
        
        this.currentPage = pageNumber;
        this.stop(); // Stop any playing audio
        
        const pageConfig = this.pages[pageNumber];
        if (!pageConfig) {
            console.error(`Page ${pageNumber} not loaded`);
            return;
        }

        // Update UI
        this.updateNavigationButtons();
        document.getElementById('current-page').textContent = pageNumber + 1;
        document.getElementById('page-select').value = pageNumber;

        // Set background
        this.setBackground(pageConfig.backgroundImage);

        // Clear and render interactive items
        await this.renderInteractiveItems(pageConfig);
    }

    setBackground(imageName) {
        const background = document.getElementById('page-background');
        if (imageName) {
            background.style.backgroundImage = `url('../app/src/main/res/drawable/${imageName}.png')`;
        } else {
            background.style.backgroundImage = 'none';
        }
    }

    async renderInteractiveItems(pageConfig) {
        const container = document.getElementById('interactive-items');
        container.innerHTML = '';
        this.currentAudioPlaylist = [];

        if (!pageConfig.sections || pageConfig.sections.length === 0) {
            return;
        }

        // Process all sections
        for (const section of pageConfig.sections) {
            if (!section.items || section.items.length === 0) continue;

            if (section.type === 'GRID') {
                this.renderGridSection(section, container);
            } else {
                this.renderCustomSection(section, container);
            }
        }
    }

    renderGridSection(section, container) {
        const layout = section.layout;
        if (!layout) return;

        const containerWidth = 1200; // Base width
        const containerHeight = 900; // Base height (4:3 ratio)

        for (const item of section.items) {
            if (!item.gridPosition) continue;

            const row = item.gridPosition.row;
            const col = item.gridPosition.col;

            const left = layout.position.left + (col * (layout.itemSize.width + layout.spacing.horizontal));
            const top = layout.position.top + (row * (layout.itemSize.height + layout.spacing.vertical));

            this.createInteractiveItem(item, left, top, layout.itemSize.width, layout.itemSize.height, container);
        }
    }

    renderCustomSection(section, container) {
        for (const item of section.items) {
            if (!item.position || !item.size) {
                // Use grid layout if available
                if (section.layout && item.gridPosition) {
                    const layout = section.layout;
                    const row = item.gridPosition.row;
                    const col = item.gridPosition.col;
                    const left = layout.position.left + (col * (layout.itemSize.width + layout.spacing.horizontal));
                    const top = layout.position.top + (row * (layout.itemSize.height + layout.spacing.vertical));
                    this.createInteractiveItem(item, left, top, layout.itemSize.width, layout.itemSize.height, container);
                }
                continue;
            }

            this.createInteractiveItem(
                item,
                item.position.left,
                item.position.top,
                item.size.width,
                item.size.height,
                container
            );
        }
    }

    createInteractiveItem(item, left, top, width, height, container) {
        const div = document.createElement('div');
        div.className = 'interactive-item';
        div.dataset.itemId = item.id;
        div.dataset.audio = item.audio;
        div.dataset.image = item.image;
        div.dataset.hoverImage = item.hoverImage || item.image;

        // Position (using percentage for responsiveness)
        div.style.left = `${(left / 1200) * 100}%`;
        div.style.top = `${(top / 900) * 100}%`;
        div.style.width = `${(width / 1200) * 100}%`;
        div.style.height = `${(height / 900) * 100}%`;

        // Add image
        const img = document.createElement('img');
        img.src = `../app/src/main/res/drawable/${item.image}.png`;
        img.alt = item.id;
        img.onerror = () => {
            // Try PNG, then png, then jpg
            const imageBase = `../app/src/main/res/drawable/${item.image}`;
            img.onerror = null; // Prevent infinite loop
            img.src = `${imageBase}.PNG`;
        };
        div.appendChild(img);

        // Add hover effect
        div.addEventListener('mouseenter', () => {
            if (item.hoverImage) {
                img.src = `../app/src/main/res/drawable/${item.hoverImage}.png`;
            }
        });

        div.addEventListener('mouseleave', () => {
            img.src = `../app/src/main/res/drawable/${item.image}.png`;
        });

        // Add click handler for audio
        div.addEventListener('click', () => {
            this.playItemAudio(item.audio, div);
        });

        container.appendChild(div);

        // Add to playlist
        if (item.audio) {
            this.currentAudioPlaylist.push({
                audio: item.audio,
                element: div
            });
        }
    }

    playItemAudio(audioName, element) {
        if (this.isPlaying) {
            this.stop();
        }

        this.audioPlayer = new Audio(`../app/src/main/res/raw/${audioName}.mp3`);
        
        // Highlight playing item
        element.classList.add('playing');

        this.audioPlayer.play();
        this.isPlaying = true;

        this.audioPlayer.onended = () => {
            element.classList.remove('playing');
            this.isPlaying = false;
            this.audioPlayer = null;
        };

        this.audioPlayer.onerror = () => {
            console.error(`Error loading audio: ${audioName}`);
            element.classList.remove('playing');
            this.isPlaying = false;
        };
    }

    playAll() {
        if (this.currentAudioPlaylist.length === 0) return;

        this.stop();
        this.currentAudioIndex = 0;
        this.isPlaying = true;
        this.isPaused = false;

        this.updateControlButtons();
        this.playNextInPlaylist();
    }

    playNextInPlaylist() {
        if (this.currentAudioIndex >= this.currentAudioPlaylist.length) {
            if (this.repeatMode) {
                this.repeatCount++;
                document.getElementById('repeat-count').textContent = this.repeatCount;
                this.currentAudioIndex = 0;
            } else {
                this.stop();
                return;
            }
        }

        const item = this.currentAudioPlaylist[this.currentAudioIndex];
        
        // Remove previous highlight
        document.querySelectorAll('.interactive-item').forEach(el => el.classList.remove('playing'));
        
        // Highlight current item
        item.element.classList.add('playing');

        this.audioPlayer = new Audio(`../app/src/main/res/raw/${item.audio}.mp3`);
        
        this.audioPlayer.play();

        this.audioPlayer.onended = () => {
            item.element.classList.remove('playing');
            this.currentAudioIndex++;
            this.playNextInPlaylist();
        };

        this.audioPlayer.onerror = () => {
            console.error(`Error loading audio: ${item.audio}`);
            item.element.classList.remove('playing');
            this.currentAudioIndex++;
            this.playNextInPlaylist();
        };
    }

    pause() {
        if (!this.audioPlayer || !this.isPlaying) return;

        if (this.isPaused) {
            this.audioPlayer.play();
            this.isPaused = false;
        } else {
            this.audioPlayer.pause();
            this.isPaused = true;
        }

        this.updateControlButtons();
    }

    stop() {
        if (this.audioPlayer) {
            this.audioPlayer.pause();
            this.audioPlayer = null;
        }

        this.isPlaying = false;
        this.isPaused = false;
        this.currentAudioIndex = 0;

        // Remove all playing highlights
        document.querySelectorAll('.interactive-item').forEach(el => el.classList.remove('playing'));

        this.updateControlButtons();
    }

    toggleRepeat() {
        this.repeatMode = !this.repeatMode;
        const btn = document.getElementById('repeat-btn');
        const counter = document.getElementById('repeat-counter');

        if (this.repeatMode) {
            btn.style.background = '#ff6b6b';
            counter.style.display = 'block';
            this.repeatCount = 0;
            document.getElementById('repeat-count').textContent = '0';
        } else {
            btn.style.background = '#667eea';
            counter.style.display = 'none';
        }
    }

    updateControlButtons() {
        const playBtn = document.getElementById('play-all-btn');
        const pauseBtn = document.getElementById('pause-btn');
        const stopBtn = document.getElementById('stop-btn');

        playBtn.disabled = this.isPlaying && !this.isPaused;
        pauseBtn.disabled = !this.isPlaying;
        stopBtn.disabled = !this.isPlaying;

        if (this.isPaused) {
            pauseBtn.innerHTML = '<span class="icon">▶</span> استئناف';
        } else {
            pauseBtn.innerHTML = '<span class="icon">⏸</span> إيقاف';
        }
    }

    navigatePage(direction) {
        const newPage = this.currentPage + direction;
        if (newPage >= 0 && newPage < this.totalPages) {
            this.loadPage(newPage);
        }
    }

    updateNavigationButtons() {
        document.getElementById('prev-btn').disabled = this.currentPage === 0;
        document.getElementById('next-btn').disabled = this.currentPage === this.totalPages - 1;
    }

    showHelp() {
        const pageConfig = this.pages[this.currentPage];
        if (!pageConfig || !pageConfig.helpDialog) return;

        const dialog = document.getElementById('help-dialog');
        const dialogImage = document.getElementById('dialog-image');

        dialogImage.src = `../app/src/main/res/drawable/${pageConfig.helpDialog}.png`;
        dialogImage.onerror = () => {
            dialogImage.src = `../app/src/main/res/drawable/${pageConfig.helpDialog}.PNG`;
        };

        dialog.style.display = 'block';
    }

    closeHelp() {
        document.getElementById('help-dialog').style.display = 'none';
    }

    showLoading(show) {
        document.getElementById('loading').style.display = show ? 'flex' : 'none';
    }

    showError() {
        this.showLoading(false);
        document.getElementById('error-message').style.display = 'block';
    }
}

// Initialize the app when DOM is loaded
document.addEventListener('DOMContentLoaded', () => {
    window.noraniApp = new NoraniApp();
});
