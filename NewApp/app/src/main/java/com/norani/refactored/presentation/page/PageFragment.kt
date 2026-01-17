package com.norani.refactored.presentation.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.norani.refactored.data.models.*
import kotlinx.coroutines.launch

/**
 * Fragment that displays a single page with interactive elements.
 * Dynamically generates UI based on page configuration.
 *
 * This fragment is part of a ViewPager, allowing users to swipe between pages.
 */
class PageFragment : Fragment() {

    private lateinit var viewModel: PageViewModel
    private var pageId: Int = 0
    
    private lateinit var rootLayout: RelativeLayout
    private val interactiveButtons = mutableMapOf<String, ImageButton>()
    private var currentHoveredButton: ImageButton? = null
    private var currentHoveredItemId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageId = arguments?.getInt(ARG_PAGE_ID) ?: 0
        
        // Get dependencies from MainActivity
        val mainActivity = requireActivity() as com.norani.refactored.presentation.main.MainActivity
        val pageRepository = mainActivity.getPageRepository()
        val audioPlayer = mainActivity.getAudioPlayer()
        
        // Initialize ViewModel
        viewModel = PageViewModel(pageRepository, audioPlayer)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Create root layout programmatically
        rootLayout = RelativeLayout(requireContext()).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
        
        return rootLayout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupObservers()
        viewModel.loadPage(pageId)
    }

    /**
     * Setup LiveData/StateFlow observers for reactive UI updates.
     */
    private fun setupObservers() {
        // Observe page data changes
        viewModel.currentPage.observe(viewLifecycleOwner) { page ->
            page?.let { renderPage(it) }
        }

        // Observe selected item for visual feedback
        viewModel.selectedItemId.observe(viewLifecycleOwner) { itemId ->
            updateVisualFeedback(itemId)
        }

        // Observe playback state
        lifecycleScope.launch {
            viewModel.playbackState.collect { state ->
                handlePlaybackStateChange(state)
            }
        }
    }

    /**
     * Render the page by creating interactive elements based on configuration.
     */
    private fun renderPage(page: Page) {
        // Clear existing views
        rootLayout.removeAllViews()
        interactiveButtons.clear()

        // Set background
        setPageBackground(page.backgroundImage)

        // Render each section
        page.sections.forEach { section ->
            when (section.type) {
                SectionType.SINGLE -> renderSingleSection(section)
                SectionType.GRID -> renderGridSection(section)
                SectionType.CUSTOM -> renderCustomSection(section)
            }
        }
    }

    /**
     * Render a section with single items (absolute positioning).
     */
    private fun renderSingleSection(section: PageSection) {
        section.items.forEach { item ->
            if (item.position != null && item.size != null) {
                createInteractiveButton(item, item.position, item.size)
            }
        }
    }

    /**
     * Render a section with grid layout.
     */
    private fun renderGridSection(section: PageSection) {
        val gridLayout = section.layout ?: return

        section.items.forEach { item ->
            val gridPos = item.gridPosition ?: return@forEach
            val position = gridLayout.calculateCellPosition(gridPos.row, gridPos.col)
            createInteractiveButton(item, position, gridLayout.itemSize)
        }
    }

    /**
     * Render a section with custom positioning (each item has its own position).
     */
    private fun renderCustomSection(section: PageSection) {
        section.items.forEach { item ->
            if (item.position != null && item.size != null) {
                createInteractiveButton(item, item.position, item.size)
            }
        }
    }

    /**
     * Create an interactive button for an item.
     */
    private fun createInteractiveButton(
        item: InteractiveItem,
        position: Position,
        size: Size
    ) {
        val button = ImageButton(requireContext()).apply {
            // Set layout parameters
            layoutParams = RelativeLayout.LayoutParams(size.width, size.height).apply {
                leftMargin = position.left
                topMargin = position.top
            }

            // Set background image
            background = getDrawableByName(item.image)

            // Make transparent (image is in background)
            setImageDrawable(null)

            // Set click listener
            setOnClickListener {
                onItemClicked(item)
            }

            // Store for later reference
            tag = item.id
        }

        rootLayout.addView(button)
        interactiveButtons[item.id] = button
    }

    /**
     * Handle click on an interactive item.
     */
    private fun onItemClicked(item: InteractiveItem) {
        viewModel.playItemAudio(item)
    }

    /**
     * Update visual feedback when an item is selected.
     */
    private fun updateVisualFeedback(selectedItemId: String?) {
        // Restore previous hovered button to normal state
        currentHoveredButton?.let { button ->
            currentHoveredItemId?.let { itemId ->
                val page = viewModel.currentPage.value
                val item = page?.getItemById(itemId)
                item?.let { button.background = getDrawableByName(it.image) }
            }
        }

        // Apply hover state to newly selected button
        if (selectedItemId != null) {
            val button = interactiveButtons[selectedItemId]
            val page = viewModel.currentPage.value
            val item = page?.getItemById(selectedItemId)
            
            if (button != null && item != null) {
                button.background = getDrawableByName(item.getHoverImageResource())
                currentHoveredButton = button
                currentHoveredItemId = selectedItemId
            }
        } else {
            currentHoveredButton = null
            currentHoveredItemId = null
        }
    }

    /**
     * Handle playback state changes.
     */
    private fun handlePlaybackStateChange(state: AudioPlaybackState) {
        when (state) {
            is AudioPlaybackState.Stopped -> {
                // Clear any visual feedback
                updateVisualFeedback(null)
            }
            is AudioPlaybackState.Playing -> {
                // Visual feedback handled by selectedItemId observer
            }
            is AudioPlaybackState.Paused -> {
                // Keep current visual state
            }
            is AudioPlaybackState.Error -> {
                android.util.Log.e(TAG, "Playback error: ${state.message}")
            }
        }
    }

    /**
     * Set the page background image.
     */
    private fun setPageBackground(backgroundImageName: String) {
        rootLayout.background = getDrawableByName(backgroundImageName)
    }

    /**
     * Get drawable resource by name.
     */
    private fun getDrawableByName(name: String): android.graphics.drawable.Drawable? {
        val resourceId = resources.getIdentifier(name, "drawable", requireContext().packageName)
        return if (resourceId != 0) {
            ContextCompat.getDrawable(requireContext(), resourceId)
        } else {
            android.util.Log.w(TAG, "Drawable not found: $name")
            null
        }
    }

    override fun onPause() {
        super.onPause()
        // Stop audio when navigating away
        viewModel.onPageChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        interactiveButtons.clear()
        currentHoveredButton = null
    }

    companion object {
        private const val TAG = "PageFragment"
        private const val ARG_PAGE_ID = "page_id"

        /**
         * Create a new instance of PageFragment for a specific page.
         *
         * @param pageId The page ID to display
         * @return New PageFragment instance
         */
        fun newInstance(pageId: Int): PageFragment {
            return PageFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PAGE_ID, pageId)
                }
            }
        }
    }
}
