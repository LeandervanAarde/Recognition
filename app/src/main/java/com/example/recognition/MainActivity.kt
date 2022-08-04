package com.example.recognition

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<com.google.android.material.button.MaterialButton>(R.id.btn_start)
        buttonClick.setOnClickListener{
            Log.i("Clicked?", "YES")
            val intent = Intent(this, HomeScreen::class.java )
            startActivity(intent)
        }
    }
}