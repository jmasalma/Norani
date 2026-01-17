package com.norani.refactored.presentation.main

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.norani.refactored.R
import com.norani.refactored.data.local.PageConfigParser
import com.norani.refactored.data.repository.PageRepository
import com.norani.refactored.presentation.page.PageFragment
import com.norani.refactored.presentation.utils.AudioPlayer

/**
 * Main activity that hosts the ViewPager2 for swiping between pages.
 * This is the entry point of the application.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var pageRepository: PageRepository
    private lateinit var audioPlayer: AudioPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize dependencies
        pageRepository = PageRepository(this)
        audioPlayer = AudioPlayer(this)
        
        // Create ViewPager2
        viewPager = ViewPager2(this).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            
            // Set up adapter
            adapter = PageAdapter(this@MainActivity, PageConfigParser.TOTAL_PAGES)
        }
        
        setContentView(viewPager)
        
        // Start at page 0 (index page)
        viewPager.setCurrentItem(0, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        audioPlayer.release()
    }

    /**
     * Get the PageRepository instance.
     * Used by fragments to access page data.
     */
    fun getPageRepository(): PageRepository = pageRepository

    /**
     * Get the AudioPlayer instance.
     * Used by fragments to play audio.
     */
    fun getAudioPlayer(): AudioPlayer = audioPlayer
}
