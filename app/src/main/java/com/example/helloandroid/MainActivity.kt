package com.example.helloandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {


    private lateinit var etUserName: EditText
    private lateinit var tvWelcome: TextView
    private lateinit var btnGoToSecond: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate called")
        setContentView(R.layout.activity_main)


        etUserName = findViewById(R.id.etUserName)
        tvWelcome = findViewById(R.id.tvWelcome)
        btnGoToSecond = findViewById(R.id.btnGoToSecond)

        btnGoToSecond.setOnClickListener {
            val name = etUserName.text.toString().trim()

            if (name.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name) // pass the name
                startActivity(intent)
            } else {
                tvWelcome.text = "Please enter your name 🌙"
            }
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}