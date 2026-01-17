package com.norani.refactored.data.repository

import android.content.Context
import com.norani.refactored.data.local.PageConfigParser
import com.norani.refactored.data.models.Page
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Repository for accessing page data.
 * Provides a clean API for loading and caching page configurations.
 *
 * This follows the Repository pattern, abstracting data access and providing
 * a single source of truth for page data.
 */
class PageRepository(context: Context) {

    private val parser = PageConfigParser(context)
    
    // Simple in-memory cache for pages
    private val pageCache = mutableMapOf<Int, Page?>()

    /**
     * Get a specific page by ID.
     * Uses cache if available, otherwise loads from assets.
     *
     * @param pageId The page ID (0-23)
     * @return The Page object, or null if not found or failed to load
     */
    suspend fun getPage(pageId: Int): Page? = withContext(Dispatchers.IO) {
        if (!pageCache.containsKey(pageId)) {
            pageCache[pageId] = parser.loadPage(pageId)
        }
        pageCache[pageId]
    }

    /**
     * Get all pages.
     * Loads from cache if available.
     *
     * @return List of all pages (may contain nulls for missing/failed pages)
     */
    suspend fun getAllPages(): List<Page?> = withContext(Dispatchers.IO) {
        (0 until PageConfigParser.TOTAL_PAGES).map { getPage(it) }
    }

    /**
     * Get all valid pages (excluding nulls).
     *
     * @return List of successfully loaded pages
     */
    suspend fun getValidPages(): List<Page> = withContext(Dispatchers.IO) {
        getAllPages().filterNotNull()
    }

    /**
     * Get list of available page IDs that have configuration files.
     *
     * @return List of page IDs
     */
    suspend fun getAvailablePageIds(): List<Int> = withContext(Dispatchers.IO) {
        parser.getAvailablePageIds()
    }

    /**
     * Check if a page exists and is valid.
     *
     * @param pageId The page ID to check
     * @return true if page exists and loads successfully
     */
    suspend fun isPageAvailable(pageId: Int): Boolean = withContext(Dispatchers.IO) {
        getPage(pageId) != null
    }

    /**
     * Preload all pages into cache.
     * Useful for improving performance after app startup.
     *
     * @return Number of pages successfully loaded
     */
    suspend fun preloadAllPages(): Int = withContext(Dispatchers.IO) {
        val pages = getAllPages()
        pages.filterNotNull().size
    }

    /**
     * Clear the page cache.
     * Forces reload from assets on next access.
     */
    fun clearCache() {
        pageCache.clear()
    }

    /**
     * Clear cache for a specific page.
     *
     * @param pageId The page ID to clear from cache
     */
    fun clearPageCache(pageId: Int) {
        pageCache.remove(pageId)
    }

    /**
     * Get cache statistics.
     *
     * @return Map of cache info (size, hit ratio, etc.)
     */
    fun getCacheStats(): Map<String, Any> {
        return mapOf(
            "cacheSize" to pageCache.size,
            "cachedPages" to pageCache.keys.sorted(),
            "totalPages" to PageConfigParser.TOTAL_PAGES
        )
    }
}
