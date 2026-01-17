package com.norani.refactored.data.models

import kotlinx.serialization.Serializable

/**
 * Represents an interactive button/element on a page.
 * Each item has an image, audio file, and position on the screen.
 *
 * @property id Unique identifier for the item (e.g., "l1_alf", "basmla")
 * @property image Resource name for the normal state image (without extension)
 * @property audio Resource name for the audio file to play (without extension)
 * @property position Position on the screen (for SINGLE and CUSTOM types)
 * @property size Size of the interactive element
 * @property hoverImage Optional resource name for hover state (defaults to "{image}_hover")
 * @property gridPosition Optional grid position (row, col) for GRID type items
 */
@Serializable
data class InteractiveItem(
    val id: String,
    val image: String,
    val audio: String,
    val position: Position? = null,
    val size: Size? = null,
    val hoverImage: String? = null,
    val gridPosition: GridPosition? = null
) {
    /**
     * Get the hover image resource name.
     * If not explicitly set, appends "_hover" to the normal image name.
     */
    fun getHoverImageResource(): String {
        return hoverImage ?: "${image}_hover"
    }

    /**
     * Check if this item has a valid position (either absolute or grid-based).
     */
    fun hasPosition(): Boolean {
        return position != null || gridPosition != null
    }

    /**
     * Check if this item has size information.
     */
    fun hasSize(): Boolean {
        return size != null
    }
}

/**
 * Position on the screen in pixels.
 *
 * @property left Distance from left edge
 * @property top Distance from top edge
 */
@Serializable
data class Position(
    val left: Int,
    val top: Int
) {
    companion object {
        val ZERO = Position(0, 0)
    }

    /**
     * Add offset to this position.
     */
    operator fun plus(offset: Position): Position {
        return Position(left + offset.left, top + offset.top)
    }
}

/**
 * Size in pixels.
 *
 * @property width Width in pixels
 * @property height Height in pixels
 */
@Serializable
data class Size(
    val width: Int,
    val height: Int
) {
    /**
     * Calculate aspect ratio.
     */
    fun aspectRatio(): Float {
        return width.toFloat() / height.toFloat()
    }

    /**
     * Scale this size by a factor.
     */
    fun scale(factor: Float): Size {
        return Size(
            (width * factor).toInt(),
            (height * factor).toInt()
        )
    }
}

/**
 * Position within a grid (row and column indices).
 *
 * @property row Row index (0-based)
 * @property col Column index (0-based)
 */
@Serializable
data class GridPosition(
    val row: Int,
    val col: Int
) {
    /**
     * Calculate linear index from 2D grid position.
     * Useful for array indexing.
     */
    fun toLinearIndex(cols: Int): Int {
        return row * cols + col
    }

    companion object {
        /**
         * Create GridPosition from linear index.
         *
         * @param index Linear index (0-based)
         * @param cols Number of columns in the grid
         */
        fun fromLinearIndex(index: Int, cols: Int): GridPosition {
            return GridPosition(
                row = index / cols,
                col = index % cols
            )
        }
    }
}
