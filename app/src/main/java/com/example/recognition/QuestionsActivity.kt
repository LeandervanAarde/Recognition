package com.example.recognition

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityQuestionsBinding
import com.example.recognition.models.Constants.getMemeQuestions
import com.example.recognition.models.Question

class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Get the extra data from the extra intent
//        val intent = Intent(this, QuestionsActivity::class.java)
        val username = intent.getStringExtra("username").toString()
        val category = intent.getStringExtra("Category").toString()
//        Log.i("the Namey be", username)
        Log.i("Category Name", category)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        if(category == "Memes"){
            val questions = getMemeQuestions()
            var questionNumber = intent.getIntExtra("number", 0)
            val currQuestion = questions[questionNumber]
            updateUI(username, currQuestion)
            binding.answerOne.setOnClickListener{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra("number", questionNumber+1)
                intent.putExtra("Category", category)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
            }
            Log.i("questionNumber", questionNumber.toString())
        }




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
    fun updateUI(username: String, currentQuestion: Question){
        if(currentQuestion.id == 1){
            binding.nameText.text= "Okay $username, ${currentQuestion.QuestionTxt}"
        } else{
            binding.nameText.text = "${currentQuestion.QuestionTxt}"
        }
        binding.answerOne.text = currentQuestion.OptionOne
        binding.answerTwo.text = currentQuestion.OptionTwo
        binding.answerThree.text = currentQuestion.OptionThree
        binding.answerFour.text = currentQuestion.OptionFour
    }
}

