package com.apoorav.cuhub

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginActivity : AppCompatActivity() {
//    private var et_uid : TextInputEditText? = null
//    private var et_pass : TextInputEditText? = null
//    //private var btn_login : Button? = null
//    private var fg_btn : TextView? = null
    lateinit var mAuth : FirebaseAuth
    lateinit var mUser : FirebaseUser
    lateinit var et_uid : TextInputEditText
    lateinit var et_pass : TextInputEditText

    //var progressBar : ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mAuth = FirebaseAuth.getInstance()


        et_uid  = findViewById(R.id.et_uid)
        et_pass = findViewById(R.id.et_pass)
        val btn_login : Button = findViewById(R.id.btn_login)
        val fg_btn : TextView = findViewById(R.id.fg_btn)


        //mUser = mAuth.currentUser!!
        //var uid : String = et_uid!!.text.toString()

        btn_login.setOnClickListener{
//            if (uid.contains("admin")) {
//                PerformLogin()
//            }
            var uid : String = et_uid.text.toString()
            var pass : String = et_pass.text.toString()
           // PerformLogin(uid, pass)
            if(uid.isEmpty()){
                et_uid.setError("Please Enter Your Login Username!")
            } else if(pass.isEmpty()){
                et_pass.setError("Please Enter Your Password!")
            }else{
                mAuth.signInWithEmailAndPassword(uid, pass)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            val intent = Intent(this, StudentMM::class.java)
                            startActivity(intent)
                            finish()
                            mUser = mAuth.currentUser!!
                            //updateUI(user)
                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                            //updateUI(null)
                        }
                    }
            }
        }

    }

//    private fun PerformLogin(uid: String, pass: String) {
//        var uid : String = uid
//        var pass : String = pass
//
//        if(uid.isEmpty()){
//            et_uid.setError("Please Enter Your Login Username!")
//        } else if(pass.isEmpty()){
//            et_pass.setError("Please Enter Your Password!")
//        }else{
//            mAuth.signInWithEmailAndPassword(uid, pass)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        // Sign in success, update UI with the signed-in user's information
//                        val intent = Intent(this, AdminActivity::class.java)
//                        startActivity(intent)
//                        finish()
//                        mUser = mAuth.currentUser!!
//                        //updateUI(user)
//                    } else {
//                        // If sign in fails, display a message to the user.
//
//                        Toast.makeText(baseContext, "Authentication failed.",
//                            Toast.LENGTH_SHORT).show()
//                        //updateUI(null)
//                    }
//                }
//        }
//    }
}