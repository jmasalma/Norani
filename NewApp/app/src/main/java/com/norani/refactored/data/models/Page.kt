package com.norani.refactored.data.models

import kotlinx.serialization.Serializable

/**
 * Represents a single educational page in the Norani app.
 * Each page contains interactive elements organized into sections.
 *
 * @property pageId Unique identifier for the page (0-23)
 * @property pageName Internal name of the page (e.g., "page1", "address")
 * @property backgroundImage Resource name for the page background
 * @property helpDialog Resource name for the help/info dialog overlay
 * @property sections List of sections containing interactive items
 */
@Serializable
data class Page(
    val pageId: Int,
    val pageName: String,
    val backgroundImage: String,
    val helpDialog: String? = null,
    val sections: List<PageSection> = emptyList()
) {
    /**
     * Get all interactive items from all sections, flattened into a single list.
     * This is useful for sequential audio playback.
     */
    fun getAllItems(): List<InteractiveItem> {
        return sections.flatMap { it.items }
    }

    /**
     * Get a specific item by its ID.
     */
    fun getItemById(itemId: String): InteractiveItem? {
        return getAllItems().find { it.id == itemId }
    }

    /**
     * Get the total number of interactive items on this page.
     */
    fun getItemCount(): Int {
        return getAllItems().size
    }

    /**
     * Check if this page has any interactive content.
     */
    fun hasInteractiveContent(): Boolean {
        return sections.isNotEmpty() && getAllItems().isNotEmpty()
    }
}
