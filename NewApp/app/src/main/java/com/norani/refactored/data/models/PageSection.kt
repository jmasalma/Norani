package com.norani.refactored.data.models

import kotlinx.serialization.Serializable

/**
 * Represents a logical section within a page.
 * Sections group related interactive items and define their layout.
 *
 * @property sectionId Unique identifier for the section (e.g., "header", "letters", "grid1")
 * @property type Type of section layout (SINGLE, GRID, CUSTOM)
 * @property layout Optional grid layout information (required for GRID type)
 * @property items List of interactive items in this section
 */
@Serializable
data class PageSection(
    val sectionId: String,
    val type: SectionType,
    val layout: GridLayout? = null,
    val items: List<InteractiveItem> = emptyList()
) {
    /**
     * Validate that the section has required layout information based on type.
     */
    fun isValid(): Boolean {
        return when (type) {
            SectionType.GRID -> layout != null
            SectionType.SINGLE, SectionType.CUSTOM -> true
        }
    }
}

/**
 * Grid layout configuration for sections that use grid-based positioning.
 *
 * @property rows Number of rows in the grid
 * @property cols Number of columns in the grid
 * @property position Top-left position of the grid on the page
 * @property itemSize Size of each grid cell
 * @property spacing Spacing between grid cells
 */
@Serializable
data class GridLayout(
    val rows: Int,
    val cols: Int,
    val position: Position,
    val itemSize: Size,
    val spacing: Spacing
) {
    /**
     * Calculate the position of a specific grid cell.
     *
     * @param row Row index (0-based)
     * @param col Column index (0-based)
     * @return The calculated position for the cell
     */
    fun calculateCellPosition(row: Int, col: Int): Position {
        val left = position.left + (col * (itemSize.width + spacing.horizontal))
        val top = position.top + (row * (itemSize.height + spacing.vertical))
        return Position(left, top)
    }

    /**
     * Get the total number of cells in this grid.
     */
    fun getTotalCells(): Int = rows * cols
}

/**
 * Spacing between grid items.
 *
 * @property horizontal Horizontal spacing (margin between columns)
 * @property vertical Vertical spacing (margin between rows)
 */
@Serializable
data class Spacing(
    val horizontal: Int,
    val vertical: Int
)

/**
 * Types of section layouts supported by the app.
 */
@Serializable
enum class SectionType {
    /**
     * Single item positioned independently.
     * Used for headers, titles, or unique elements.
     */
    SINGLE,

    /**
     * Items arranged in a regular grid.
     * Requires GridLayout configuration.
     */
    GRID,

    /**
     * Custom positioning for each item.
     * Items use their own position properties.
     */
    CUSTOM
}
