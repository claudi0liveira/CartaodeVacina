package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

private val SPLASH_TIME_OUT : Long = 5000 // 1 seg

@Suppress("DEPRECATION")

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed ( {

            startActivity (Intent ( this , MainActivity :: class . java ))

            finish ()
        } , SPLASH_TIME_OUT )

    }


}