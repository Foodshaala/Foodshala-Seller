package com.example.foodshala

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var token = getSharedPreferences("username", Context.MODE_PRIVATE)

        username.text = token.getString("loginuser"," ")

        logout.setOnClickListener {
            var editor = token.edit()
            editor.putString("loginuser"," ")
            editor.commit()
             var intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

    }
}