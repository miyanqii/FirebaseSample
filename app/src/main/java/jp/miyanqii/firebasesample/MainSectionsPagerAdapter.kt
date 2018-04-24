package jp.miyanqii.firebasesample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MainSectionsPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = PlaceholderFragment.newInstance(position + 1)
    override fun getCount(): Int  = 3
    override fun getPageTitle(position: Int): CharSequence? =  (position + 1).toString()
}