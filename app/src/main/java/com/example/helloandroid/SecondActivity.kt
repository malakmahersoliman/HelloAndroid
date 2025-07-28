package com.example.helloandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "onCreate")
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("USER_NAME") ?: "Dreamer"
        val tvQuote = findViewById<TextView>(R.id.tvQuote)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnShare = findViewById<Button>(R.id.btnShare)

        tvQuote.text = "\"It often seems to me that the night is much more alive and richly colored than the day.\"\n\n— Do you agree , $name"

        btnBack.setOnClickListener {
            finish()
        }

        btnShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                "\"I dream my painting and I paint my dream.\" — $name"
            )
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy")
    }
}