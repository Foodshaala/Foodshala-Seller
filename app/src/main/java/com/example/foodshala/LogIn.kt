package com.example.foodshala

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {

    var email = "vibhav@gmail.com"
    var pass = "vibhav"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        var token = getSharedPreferences("username", Context.MODE_PRIVATE)

        if(token.getString("loginuser", " ")!=" ")
        {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val txt_SignUp = findViewById<TextView>(R.id.txt_SignUp)
        txt_SignUp.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        val forgotPass = findViewById<TextView>(R.id.txt_forgotPassword)
        forgotPass.setOnClickListener{
            val intent = Intent(this,ForgotPassword::class.java)
            startActivity(intent)
        }

        btnLogIn.setOnClickListener {
            val user = edt_email.text.toString()
            var pas = edt_password.text.toString()

            if(user == email && pass == pas)
            {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", user)

                var editor = token.edit()
                editor.putString("loginuser",user)
                editor.commit()

                startActivity(intent)
            }
        }
    }

}