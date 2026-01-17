package com.norani.refactored.data.local

import android.content.Context
import com.norani.refactored.data.models.Page
import kotlinx.serialization.json.Json
import java.io.IOException

/**
 * Parser for reading page configuration files from assets.
 * Handles JSON deserialization and error handling.
 */
class PageConfigParser(private val context: Context) {

    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        prettyPrint = true
    }

    /**
     * Load a specific page configuration from assets.
     *
     * @param pageId The ID of the page to load (0-23)
     * @return The parsed Page object, or null if parsing fails
     */
    fun loadPage(pageId: Int): Page? {
        return try {
            val filename = "pages/page$pageId.json"
            val jsonString = readAssetFile(filename)
            json.decodeFromString(Page.serializer(), jsonString)
        } catch (e: IOException) {
            android.util.Log.e(TAG, "Failed to load page $pageId: ${e.message}")
            null
        } catch (e: Exception) {
            android.util.Log.e(TAG, "Failed to parse page $pageId: ${e.message}")
            null
        }
    }

    /**
     * Load all page configurations.
     *
     * @return List of all pages (0-23), with null entries for pages that fail to load
     */
    fun loadAllPages(): List<Page?> {
        return (0..23).map { loadPage(it) }
    }

    /**
     * Load all valid pages (excluding those that failed to load).
     *
     * @return List of successfully loaded pages
     */
    fun loadValidPages(): List<Page> {
        return loadAllPages().filterNotNull()
    }

    /**
     * Check if a page configuration file exists.
     *
     * @param pageId The page ID to check
     * @return true if the file exists, false otherwise
     */
    fun pageExists(pageId: Int): Boolean {
        return try {
            val filename = "pages/page$pageId.json"
            context.assets.list("pages")?.contains("page$pageId.json") ?: false
        } catch (e: IOException) {
            false
        }
    }

    /**
     * Get list of all available page IDs.
     *
     * @return List of page IDs that have configuration files
     */
    fun getAvailablePageIds(): List<Int> {
        return try {
            context.assets.list("pages")
                ?.filter { it.startsWith("page") && it.endsWith(".json") }
                ?.mapNotNull { filename ->
                    // Extract number from "pageX.json"
                    filename.removePrefix("page").removeSuffix(".json").toIntOrNull()
                }
                ?.sorted()
                ?: emptyList()
        } catch (e: IOException) {
            android.util.Log.e(TAG, "Failed to list page files: ${e.message}")
            emptyList()
        }
    }

    /**
     * Read a file from assets as a string.
     *
     * @param filename Path to file within assets directory
     * @return File content as string
     * @throws IOException if file cannot be read
     */
    private fun readAssetFile(filename: String): String {
        return context.assets.open(filename).bufferedReader().use { it.readText() }
    }

    /**
     * Validate a page configuration.
     *
     * @param page The page to validate
     * @return ValidationResult with any errors found
     */
    fun validatePage(page: Page): ValidationResult {
        val errors = mutableListOf<String>()

        // Check page ID range
        if (page.pageId !in 0..23) {
            errors.add("Invalid page ID: ${page.pageId} (must be 0-23)")
        }

        // Check sections
        if (page.sections.isEmpty() && page.pageId != 0) {
            errors.add("Page ${page.pageId} has no sections")
        }

        // Validate each section
        page.sections.forEachIndexed { index, section ->
            if (!section.isValid()) {
                errors.add("Section $index (${section.sectionId}) is invalid")
            }

            // Check items
            if (section.items.isEmpty()) {
                errors.add("Section ${section.sectionId} has no items")
            }

            section.items.forEach { item ->
                if (item.image.isBlank()) {
                    errors.add("Item ${item.id} has no image")
                }
                if (item.audio.isBlank()) {
                    errors.add("Item ${item.id} has no audio")
                }
            }
        }

        return ValidationResult(errors.isEmpty(), errors)
    }

    companion object {
        private const val TAG = "PageConfigParser"
        
        /**
         * Total number of pages in the app.
         */
        const val TOTAL_PAGES = 24
    }
}

/**
 * Result of page validation.
 *
 * @property isValid Whether the page is valid
 * @property errors List of validation errors (empty if valid)
 */
data class ValidationResult(
    val isValid: Boolean,
    val errors: List<String>
) {
    fun getErrorMessage(): String {
        return errors.joinToString("\n")
    }
}
