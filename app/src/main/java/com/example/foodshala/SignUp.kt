package com.example.foodshala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signinbtn = findViewById<Button>(R.id.signinbtn)
        signinbtn.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

    }
}