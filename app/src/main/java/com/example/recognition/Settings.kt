package com.example.recognition

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivitySettingsBinding
import com.example.recognition.models.CategoryConstants

class Settings : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        binding.resetScores.setOnClickListener{
            resetScores()
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }
        binding.github.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LeandervanAarde/Recognition"))
            startActivity((intent))
        }
    }
    private fun resetScores(){
        val Preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)
        val editor = Preference.edit()
        editor.apply{
            putInt(CategoryConstants.MEME_HIGH_SCORE, 0)
            putInt(CategoryConstants.MUSIC_HIGH_SCORE, 0)
            putInt(CategoryConstants.TV_HIGH_SCORE, 0)
            putInt(CategoryConstants.CELEB_HIGH_SCORE, 0)
            putInt(CategoryConstants.LOGO_HIGH_SCORE, 0)
            apply()
        }
    }
}