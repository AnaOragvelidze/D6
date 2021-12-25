package com.example.d6.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.d6.MainActivity
import com.example.d6.fragments.FragmentFirst
import com.example.d6.fragments.FragmentsSecond

class ViewPagerFragmentAdapter (activity: FragmentActivity): FragmentStateAdapter(activity){

    override fun getItemCount()=2

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> FragmentFirst()
            1 -> FragmentsSecond()
            else -> FragmentFirst()

        }
    }


}