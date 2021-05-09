package com.tablayoutwithviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.tablayoutwithviewpager.adapter.ViewPagerAdapter
import com.tablayoutwithviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        tabLayout = binding.tabLayout
        viewPager = binding.viewPager
        viewPagerAdapter.addFragment(FragmentA.fragmentA, "Home")
        viewPagerAdapter.addFragment(FragmentB.fragmentB, "Details")
        viewPagerAdapter.addFragment(FragmentC.fragmentC, "Profile")
        viewPager.adapter = viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}