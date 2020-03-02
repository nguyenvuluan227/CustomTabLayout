package com.nguyenvuluan.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()

    }

    private fun setupViewPager() {
        viewPager.adapter = ViewPagerAdapter(this)
        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        TabLayoutMediator(tabLayout, viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> {
                        tab.text = getString(R.string.text_home)
                        tab.setIcon(R.drawable.ic_star)
                    }
                    1 -> {
                        tab.text = getString(R.string.text_reports)
                        tab.setIcon(R.drawable.ic_star)
                    }
                    2 -> {
                        tab.text = getString(R.string.text_notifications)
                        tab.setIcon(R.drawable.ic_star)
                    }
                    3 -> {
                        tab.text = getString(R.string.text_accounts)
                        tab.setIcon(R.drawable.ic_star)
                    }
                }
            }).attach()
    }
}
