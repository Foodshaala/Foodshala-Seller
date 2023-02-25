package com.example.foodshala

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(HomeFragment())
        var token = getSharedPreferences("username", Context.MODE_PRIVATE)

//        username.text = token.getString("loginuser"," ")
//
//        logout.setOnClickListener {
//            var editor = token.edit()
//            editor.putString("loginuser"," ")
//            editor.commit()
//             var intent = Intent(this,LogIn::class.java)
//            startActivity(intent)
//        }

        bottomNav.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.home -> setFragment(HomeFragment())
                R.id.post -> setFragment(PostFragment())
                R.id.Analytics -> setFragment(AnalyticsFragment())
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun setFragment(fragment: Fragment){
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FragmentFL, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}