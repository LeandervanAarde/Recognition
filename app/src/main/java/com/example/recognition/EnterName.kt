package com.example.recognition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityEnterNameBinding

class EnterName : AppCompatActivity() {
    private lateinit var binding: ActivityEnterNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)
        binding = ActivityEnterNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}