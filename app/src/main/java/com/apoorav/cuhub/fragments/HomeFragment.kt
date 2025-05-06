package com.apoorav.cuhub.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.apoorav.cuhub.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        val vcourse : Button = view.findViewById(R.id.btn_vcourse)
        val attendance : Button = view.findViewById(R.id.btn_attendance)
        val examination : Button = view.findViewById(R.id.btn_examination)
        val timetable : Button = view.findViewById(R.id.btn_timetable)
        val fees : Button = view.findViewById(R.id.btn_fees)

        fees.setOnClickListener(){
            val i = Intent(activity, FeesActivity::class.java)
            startActivity(i)
        }

        timetable.setOnClickListener(){
            val intent = Intent(activity, TtActivity::class.java)
            startActivity(intent)
        }

        examination.setOnClickListener(){
            val intent = Intent(activity, ExaminationActivity::class.java)
            startActivity(intent)
        }

        attendance.setOnClickListener(){
            val intent = Intent(activity, AttendanceActivity::class.java)
            startActivity(intent)
        }

        vcourse.setOnClickListener(){
            val intent = Intent(activity, CourseActivity::class.java)
            startActivity(intent)
        }
        return view
    }




}