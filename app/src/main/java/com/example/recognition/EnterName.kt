package com.example.recognition

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityEnterNameBinding

class EnterName : AppCompatActivity() {
    private lateinit var binding: ActivityEnterNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_enter_name)
        binding = ActivityEnterNameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val category = intent.getStringExtra("Category").toString()
        Log.i("The category is", category)


        binding.btnStart.setOnClickListener{
            Log.i("Clicked", "Confirmed")
            val username = binding.euUsername.text
            if(username.toString() == "" || username.toString() == " "){
                Toast.makeText(this, "please enter valid username",Toast.LENGTH_LONG).show()
                binding.euUsername.error = "Please enter username"
            } else{
                //TODO: navigate to the question pages.
                Log.i("Welcome to", username.toString())
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra("username", username.toString())
                intent.putExtra("Category", "${category}")
                startActivity(intent)
                finish()
            }
        }

        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }
    }
}