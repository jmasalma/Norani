package com.norani.refactored.presentation.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.norani.refactored.presentation.page.PageFragment

/**
 * Adapter for ViewPager2 that creates PageFragments for each page.
 */
class PageAdapter(
    fragmentActivity: FragmentActivity,
    private val pageCount: Int
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = pageCount

    override fun createFragment(position: Int): Fragment {
        return PageFragment.newInstance(position)
    }
}
