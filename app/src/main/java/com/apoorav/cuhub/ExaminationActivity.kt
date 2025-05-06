package com.apoorav.cuhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExaminationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examination)

        val res : Button = findViewById(R.id.btn_result)
        val datesheet : Button = findViewById(R.id.btn_datesheet)

        res.setOnClickListener(){
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

        datesheet.setOnClickListener(){
            val intent = Intent(this, DatesheetActivity::class.java)
            startActivity(intent)
        }
    }
}