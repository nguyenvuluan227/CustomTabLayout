package com.nguyenvuluan.customlayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nguyenvuluan.customlayout.fragment.HomeFragment
import com.nguyenvuluan.customlayout.fragment.NotificationsFragment
import com.nguyenvuluan.customlayout.fragment.ReportsFragment

class ViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment.newInstance()
            1 -> ReportsFragment.newInstance()
            2 -> NotificationsFragment.newInstance()
            3 -> ReportsFragment.newInstance()
            else -> HomeFragment.newInstance()
        }
    }

}