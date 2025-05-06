package com.apoorav.cuhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import kotlinx.coroutines.delay

class SplashScreen_activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var lottie = findViewById<LottieAnimationView>(R.id.lottie)

        Handler().postDelayed(Runnable() {
            kotlin.run {
                val i = Intent(this, LoginActivity::class.java)
                startActivity(i)
                finish()
            }
        },4500)
    }
}