package com.ebookfrenzy.tablayoutdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return Tab1Fragment()
            1 -> return Tab2Fragment()
            2 -> return Tab3Fragment()
            3 -> return Tab4Fragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}