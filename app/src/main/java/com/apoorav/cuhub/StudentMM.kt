package com.apoorav.cuhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.apoorav.cuhub.fragments.HomeFragment
import com.apoorav.cuhub.fragments.ProfileFragment
import com.apoorav.cuhub.fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class StudentMM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_mm)

        val BottomNav : BottomNavigationView = findViewById(R.id.bottomNav)

        val homeFragment : Fragment = HomeFragment()
        val profileFragment : Fragment = ProfileFragment()
        val settingsFragment : Fragment = SettingsFragment()

        makeCuurentFrag(homeFragment)

        BottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCuurentFrag(homeFragment)
                R.id.ic_profile -> makeCuurentFrag(profileFragment)
                R.id.ic_settings -> makeCuurentFrag(settingsFragment)
            }
            true


        }





    }

    private fun makeCuurentFrag(fragment: Fragment) = supportFragmentManager.beginTransaction().apply{
        replace(R.id.fLayout, fragment)
        commit()
    }
}