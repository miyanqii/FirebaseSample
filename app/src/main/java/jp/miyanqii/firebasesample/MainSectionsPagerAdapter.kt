package jp.miyanqii.firebasesample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import jp.miyanqii.firebasesample.model.entity.ContentCategory

class MainSectionsPagerAdapter(fm: FragmentManager, var categories: List<ContentCategory>) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = PlaceholderFragment.newInstance(position + 1)
    override fun getCount(): Int  = 3
    override fun getPageTitle(position: Int): CharSequence? =  (position + 1).toString()
}