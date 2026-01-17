package com.norani.refactored.presentation.utils

import android.content.Context
import android.media.MediaPlayer
import com.norani.refactored.data.models.AudioPlaybackState
import com.norani.refactored.data.models.AudioPlaylist
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Manages audio playback for the application.
 * Handles both single audio clips and playlist playback with repeat functionality.
 *
 * This class uses MediaPlayer and provides a reactive API using StateFlow
 * to notify observers of playback state changes.
 */
class AudioPlayer(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null
    private var currentPlaylist: AudioPlaylist? = null

    private val _playbackState = MutableStateFlow<AudioPlaybackState>(AudioPlaybackState.Stopped)
    val playbackState: StateFlow<AudioPlaybackState> = _playbackState.asStateFlow()

    /**
     * Play a single audio file.
     *
     * @param audioResourceName Name of the audio resource (without extension)
     */
    fun playSingle(audioResourceName: String) {
        stop()
        currentPlaylist = AudioPlaylist.single(audioResourceName)
        playCurrentItem()
    }

    /**
     * Play a playlist of audio files sequentially.
     *
     * @param playlist The AudioPlaylist to play
     */
    fun playPlaylist(playlist: AudioPlaylist) {
        stop()
        playlist.reset()
        currentPlaylist = playlist
        playCurrentItem()
    }

    /**
     * Pause the current playback.
     * Can be resumed later from the same position.
     */
    fun pause() {
        mediaPlayer?.let { player ->
            if (player.isPlaying) {
                player.pause()
                currentPlaylist?.getCurrentItem()?.let { item ->
                    _playbackState.value = AudioPlaybackState.Paused(
                        currentItem = item,
                        position = currentPlaylist?.getCurrentPosition() ?: 0
                    )
                }
            }
        }
    }

    /**
     * Resume playback from paused state.
     */
    fun resume() {
        mediaPlayer?.let { player ->
            if (!player.isPlaying) {
                player.start()
                currentPlaylist?.getCurrentItem()?.let { item ->
                    _playbackState.value = AudioPlaybackState.Playing(
                        currentItem = item,
                        position = currentPlaylist?.getCurrentPosition() ?: 0,
                        totalItems = currentPlaylist?.getTotalItems() ?: 1
                    )
                }
            }
        }
    }

    /**
     * Stop playback and reset to the beginning.
     */
    fun stop() {
        mediaPlayer?.let { player ->
            try {
                if (player.isPlaying) {
                    player.stop()
                }
                player.release()
            } catch (e: IllegalStateException) {
                android.util.Log.e(TAG, "Error stopping media player: ${e.message}")
            }
        }
        mediaPlayer = null
        currentPlaylist?.reset()
        _playbackState.value = AudioPlaybackState.Stopped
    }

    /**
     * Check if audio is currently playing.
     */
    fun isPlaying(): Boolean {
        return mediaPlayer?.isPlaying == true
    }

    /**
     * Check if audio is paused.
     */
    fun isPaused(): Boolean {
        return _playbackState.value is AudioPlaybackState.Paused
    }

    /**
     * Check if audio is stopped.
     */
    fun isStopped(): Boolean {
        return _playbackState.value is AudioPlaybackState.Stopped
    }

    /**
     * Get the current playlist, if any.
     */
    fun getCurrentPlaylist(): AudioPlaylist? = currentPlaylist

    /**
     * Play the current item in the playlist.
     */
    private fun playCurrentItem() {
        val playlist = currentPlaylist ?: return
        val audioName = playlist.getCurrentItem() ?: return

        try {
            // Get resource ID from name
            val resourceId = getAudioResourceId(audioName)
            if (resourceId == 0) {
                _playbackState.value = AudioPlaybackState.Error("Audio resource not found: $audioName")
                return
            }

            // Create and configure media player
            mediaPlayer = MediaPlayer.create(context, resourceId)?.apply {
                setOnCompletionListener { onAudioComplete() }
                setOnErrorListener { _, what, extra ->
                    _playbackState.value = AudioPlaybackState.Error(
                        "MediaPlayer error: what=$what, extra=$extra"
                    )
                    true
                }
            }

            // Start playback
            mediaPlayer?.start()
            _playbackState.value = AudioPlaybackState.Playing(
                currentItem = audioName,
                position = playlist.getCurrentPosition(),
                totalItems = playlist.getTotalItems()
            )

        } catch (e: Exception) {
            android.util.Log.e(TAG, "Error playing audio: ${e.message}")
            _playbackState.value = AudioPlaybackState.Error(e.message ?: "Unknown error")
        }
    }

    /**
     * Handle completion of an audio clip.
     * Automatically moves to next item if available.
     */
    private fun onAudioComplete() {
        val playlist = currentPlaylist ?: return

        // Release current media player
        mediaPlayer?.release()
        mediaPlayer = null

        // Move to next item
        if (playlist.moveToNext()) {
            playCurrentItem()
        } else {
            // Playlist complete
            _playbackState.value = AudioPlaybackState.Stopped
            currentPlaylist = null
        }
    }

    /**
     * Get Android resource ID for an audio file by name.
     *
     * @param audioName Name of the audio resource (without extension)
     * @return Resource ID, or 0 if not found
     */
    private fun getAudioResourceId(audioName: String): Int {
        // Handle special case for mute
        if (audioName == "mute") {
            return 0 // Return 0 to indicate no audio
        }

        return context.resources.getIdentifier(
            audioName,
            "raw",
            context.packageName
        )
    }

    /**
     * Release resources when done with the player.
     * Should be called when the player is no longer needed.
     */
    fun release() {
        stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    companion object {
        private const val TAG = "AudioPlayer"
    }
}
