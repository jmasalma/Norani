package com.norani.refactored.presentation.page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.norani.refactored.data.models.AudioPlaybackState
import com.norani.refactored.data.models.AudioPlaylist
import com.norani.refactored.data.models.InteractiveItem
import com.norani.refactored.data.models.Page
import com.norani.refactored.data.repository.PageRepository
import com.norani.refactored.presentation.utils.AudioPlayer
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * ViewModel for managing page state and business logic.
 * Handles page loading, audio playback, and user interactions.
 *
 * This follows the MVVM pattern, keeping business logic separate from UI.
 */
class PageViewModel(
    private val pageRepository: PageRepository,
    private val audioPlayer: AudioPlayer
) : ViewModel() {

    // Current page data
    private val _currentPage = MutableLiveData<Page?>()
    val currentPage: LiveData<Page?> = _currentPage

    // Loading state
    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> = _isLoading

    // Error messages
    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    // Audio playback state (from AudioPlayer)
    val playbackState: StateFlow<AudioPlaybackState> = audioPlayer.playbackState

    // Repeat counter
    private val _repeatCount = MutableLiveData<Int>(0)
    val repeatCount: LiveData<Int> = _repeatCount

    // Currently selected item (for visual feedback)
    private val _selectedItemId = MutableLiveData<String?>()
    val selectedItemId: LiveData<String?> = _selectedItemId

    /**
     * Load a specific page by ID.
     *
     * @param pageId The page ID to load (0-23)
     */
    fun loadPage(pageId: Int) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            try {
                val page = pageRepository.getPage(pageId)
                if (page != null) {
                    _currentPage.value = page
                } else {
                    _error.value = "Failed to load page $pageId"
                }
            } catch (e: Exception) {
                _error.value = "Error loading page: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }

    /**
     * Play audio for a specific item.
     *
     * @param item The interactive item to play audio for
     */
    fun playItemAudio(item: InteractiveItem) {
        // Stop any current playlist playback
        audioPlayer.stop()
        
        // Update selected item for visual feedback
        _selectedItemId.value = item.id
        
        // Play the audio
        audioPlayer.playSingle(item.audio)
    }

    /**
     * Play all items on the current page sequentially.
     */
    fun playPageSequentially() {
        val page = _currentPage.value ?: return
        
        if (!page.hasInteractiveContent()) {
            _error.value = "No interactive content on this page"
            return
        }

        // Clear selected item (playing full sequence)
        _selectedItemId.value = null

        // Create playlist from page items
        val playlist = AudioPlaylist.fromPage(page, _repeatCount.value ?: 0)
        
        // Start playback
        audioPlayer.playPlaylist(playlist)
    }

    /**
     * Pause the current audio playback.
     */
    fun pauseAudio() {
        audioPlayer.pause()
    }

    /**
     * Resume the paused audio playback.
     */
    fun resumeAudio() {
        audioPlayer.resume()
    }

    /**
     * Stop the current audio playback.
     */
    fun stopAudio() {
        audioPlayer.stop()
        _selectedItemId.value = null
        _repeatCount.value = 0
    }

    /**
     * Toggle between play and pause.
     */
    fun togglePlayPause() {
        when {
            audioPlayer.isPlaying() -> pauseAudio()
            audioPlayer.isPaused() -> resumeAudio()
            else -> playPageSequentially()
        }
    }

    /**
     * Increment the repeat counter.
     */
    fun incrementRepeatCount() {
        _repeatCount.value = (_repeatCount.value ?: 0) + 1
    }

    /**
     * Reset the repeat counter.
     */
    fun resetRepeatCount() {
        _repeatCount.value = 0
    }

    /**
     * Clear any error messages.
     */
    fun clearError() {
        _error.value = null
    }

    /**
     * Clear the selected item.
     */
    fun clearSelection() {
        _selectedItemId.value = null
    }

    /**
     * Check if a specific item is currently selected.
     *
     * @param itemId The item ID to check
     * @return true if this item is selected
     */
    fun isItemSelected(itemId: String): Boolean {
        return _selectedItemId.value == itemId
    }

    /**
     * Preload multiple pages for better performance.
     *
     * @param pageIds List of page IDs to preload
     */
    fun preloadPages(pageIds: List<Int>) {
        viewModelScope.launch {
            pageIds.forEach { pageId ->
                pageRepository.getPage(pageId)
            }
        }
    }

    /**
     * Called when the page is changed (e.g., user swipes to another page).
     * Stops any ongoing audio playback and resets state.
     */
    fun onPageChanged() {
        stopAudio()
        clearSelection()
        clearError()
    }

    /**
     * Clean up resources when ViewModel is destroyed.
     */
    override fun onCleared() {
        super.onCleared()
        audioPlayer.release()
    }

    companion object {
        private const val TAG = "PageViewModel"
    }
}
