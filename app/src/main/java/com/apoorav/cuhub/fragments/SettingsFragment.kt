package com.apoorav.cuhub.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.apoorav.cuhub.LoginActivity
import com.apoorav.cuhub.R
import com.google.firebase.auth.FirebaseAuth

class SettingsFragment : Fragment() {
    lateinit var mAuth : FirebaseAuth



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_settings, container, false)
        mAuth = FirebaseAuth.getInstance()

        val logout : Button = view.findViewById(R.id.btn_logout)
        logout.setOnClickListener(){
            mAuth.signOut()
            val i = Intent(activity, LoginActivity::class.java)
            startActivity(i)
            activity?.finish()
        }


        return view
    }

}