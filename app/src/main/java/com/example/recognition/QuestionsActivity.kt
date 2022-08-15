package com.example.recognition

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Get the extra data from the extra intent
        val username = intent.getStringExtra("username").toString()
        val category = intent.getStringExtra("Category").toString()
        Log.i("the Namey be", username)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        updateUI(username)

        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }



        //TODO: Set up a timer for each Question
        object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long){
                binding.timerText.text ="" + (millisUntilFinished / 1000).toString() + "." + millisUntilFinished % 100
                if(millisUntilFinished/1000 < 15){
                    binding.timerText.setTextColor(Color.YELLOW)
                }
                if (millisUntilFinished/1000 < 10){
                    binding.timerText.setTextColor(Color.RED)
                }
            }
            override fun onFinish(){
                binding.timerText.setTextColor(Color.WHITE)
                binding.timerText.text ="Time is up!"
            }
        }.start()
    }
    fun updateUI(username: String){
        binding.nameText.text= "Okay $username, what is generally associated with this meme?"
    }
}

