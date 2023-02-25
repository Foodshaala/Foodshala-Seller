package com.example.foodshala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        CoroutineScope(Dispatchers.Main).launch {
            delay(1000L)
            startActivity(Intent(this@SplashScreen,LogIn::class.java))
            finish()
        }
    }
}