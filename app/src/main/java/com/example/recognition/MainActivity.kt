package com.example.recognition

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<com.google.android.material.button.MaterialButton>(R.id.btn_start)
        buttonClick.setOnClickListener{
            Log.i("Clicked?", "YES")
            val intent = Intent(this, HomeScreen::class.java )
            startActivity(intent)
        }
    }
}