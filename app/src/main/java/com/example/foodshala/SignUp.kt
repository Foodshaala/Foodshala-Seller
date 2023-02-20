package com.example.foodshala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val Bottomtext = findViewById<TextView>(R.id.Bottomtext)
        Bottomtext.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

    }

}