package com.example.recognition

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivitySettingsBinding
import com.example.recognition.models.CategoryConstants

class Settings : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.resetScores.setOnClickListener{
            resetScores()
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish()
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