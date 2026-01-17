package com.norani.refactored.data.models

/**
 * Represents a playlist of audio files to be played sequentially.
 * Manages playback state and repeat functionality.
 *
 * @property items List of audio resource names to play
 * @property repeatCount Number of times to repeat the entire playlist (0 = play once)
 */
data class AudioPlaylist(
    val items: List<String>,
    val repeatCount: Int = 0
) {
    private var currentIndex: Int = 0
    private var remainingRepeats: Int = repeatCount

    /**
     * Get the current audio item.
     */
    fun getCurrentItem(): String? {
        return items.getOrNull(currentIndex)
    }

    /**
     * Move to the next item in the playlist.
     * Handles repeat logic automatically.
     *
     * @return true if there's a next item, false if playlist is complete
     */
    fun moveToNext(): Boolean {
        currentIndex++
        
        if (currentIndex >= items.size) {
            // Reached end of playlist
            if (remainingRepeats > 0) {
                // Reset to beginning for repeat
                currentIndex = 0
                remainingRepeats--
                return true
            }
            // Playlist complete
            return false
        }
        return true
    }

    /**
     * Reset the playlist to the beginning.
     */
    fun reset() {
        currentIndex = 0
        remainingRepeats = repeatCount
    }

    /**
     * Get the current position in the playlist (0-based).
     */
    fun getCurrentPosition(): Int = currentIndex

    /**
     * Get the total number of items in the playlist.
     */
    fun getTotalItems(): Int = items.size

    /**
     * Check if the playlist has more items to play.
     */
    fun hasNext(): Boolean {
        return currentIndex < items.size - 1 || remainingRepeats > 0
    }

    /**
     * Get the progress through the current iteration (0.0 to 1.0).
     */
    fun getProgress(): Float {
        if (items.isEmpty()) return 1.0f
        return (currentIndex + 1).toFloat() / items.size.toFloat()
    }

    /**
     * Get the number of repeats remaining.
     */
    fun getRepeatsRemaining(): Int = remainingRepeats

    companion object {
        /**
         * Create a playlist from a Page object.
         */
        fun fromPage(page: Page, repeatCount: Int = 0): AudioPlaylist {
            val audioItems = page.getAllItems().map { it.audio }
            return AudioPlaylist(audioItems, repeatCount)
        }

        /**
         * Create a playlist for a single audio item.
         */
        fun single(audio: String): AudioPlaylist {
            return AudioPlaylist(listOf(audio), 0)
        }
    }
}

/**
 * State of audio playback.
 */
sealed class AudioPlaybackState {
    /**
     * No audio is playing.
     */
    object Stopped : AudioPlaybackState()

    /**
     * Audio is currently playing.
     * 
     * @property currentItem The audio resource being played
     * @property position Position in the playlist
     * @property totalItems Total items in the playlist
     */
    data class Playing(
        val currentItem: String,
        val position: Int,
        val totalItems: Int
    ) : AudioPlaybackState()

    /**
     * Audio is paused.
     * 
     * @property currentItem The audio resource that's paused
     * @property position Position in the playlist
     */
    data class Paused(
        val currentItem: String,
        val position: Int
    ) : AudioPlaybackState()

    /**
     * An error occurred during playback.
     * 
     * @property message Error message
     */
    data class Error(val message: String) : AudioPlaybackState()
}
