package com.example.recognition
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityQuestionsBinding
import com.example.recognition.models.Constants.LogoQuestions
import com.example.recognition.models.Constants.getAllCelebQuestions
import com.example.recognition.models.Constants.getMemeQuestions
import com.example.recognition.models.Constants.getMusicQuestions
import com.example.recognition.models.Constants.getTvQuestions
import com.example.recognition.models.Question

class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val username = intent.getStringExtra("username").toString()
        val category = intent.getStringExtra("Category").toString()
        var currentScore = intent.getIntExtra("CurrentScore:", 0)

        Log.i("Category Name", category)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        when (category) {
            "Memes" -> {
                val questions = getMemeQuestions()
                var questionNumber = intent.getIntExtra("number", 0)
                val currQuestion = questions[questionNumber]
                var currentScore = intent.getIntExtra("currentScore", 0)
                updateUI(username, currQuestion)

                binding.answerOne.setOnClickListener{
                    currentScore += 1
                    binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        intent.putExtra("currentScore", currentScore)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    } else{

                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        intent.putExtra("currentScore", currentScore)
                        startActivity(intent)
                        finish()
                    }
                    Log.i("Score", "${currentScore}/${questions.count()}")
                }
                binding.answerTwo.setOnClickListener{
                    binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                    currentScore = currentScore
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        intent.putExtra("currentScore", currentScore)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        intent.putExtra("currentScore", currentScore)
                        startActivity(intent)
                        finish()
                    }
                    Log.i("Score", "${currentScore}/${questions.count()}")
                }
                binding.answerThree.setOnClickListener{
                    binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
                binding.answerFour.setOnClickListener{
                    binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            "Music" -> {
                val questions = getMusicQuestions()
                var questionNumber = intent.getIntExtra("number", 0)
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
                binding.answerThree.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
                binding.answerFour.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            "Movies and Tv" -> {
                val questions = getTvQuestions()
                var questionNumber = intent.getIntExtra("number", 0)
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    if(questionNumber+1 == questions.count()){

                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
                binding.answerThree.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
                binding.answerFour.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            "Celebrities" -> {
                val questions = getAllCelebQuestions()
                var questionNumber = intent.getIntExtra("number", 0)
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.answerThree.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.answerFour.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }

            }
            else -> {
                val questions = LogoQuestions()
                var questionNumber = intent.getIntExtra("number", 0)
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.answerThree.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.answerFour.setOnClickListener{
                    if(questionNumber+1 == questions.count()){
                        val intent = Intent(this, ResultsActivity::class.java)
                        intent.putExtra("Category", category)
                        startActivity(intent)
                        finish()
                    } else{
                        val intent = Intent(this, QuestionsActivity::class.java)
                        intent.putExtra("number", questionNumber+1)
                        intent.putExtra("Category", category)
                        intent.putExtra("username", username)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }
        //TODO: Set up a timer for each Question
        //TODO: ASk Armand if he knows how I could use this timer to move on the next activity once it's done
            object : CountDownTimer(31000,1000){
                override fun onTick(millisUntilFinished: Long){
                    binding.timerText.text ="" + (millisUntilFinished / 1000).toString()
                    if(millisUntilFinished/1000 < 15){
                        binding.timerText.setTextColor(Color.YELLOW)
                        //Hello
                    }
                    if (millisUntilFinished/1000 < 10){
                        binding.timerText.setTextColor(Color.RED)
                    }
                }
                override fun onFinish(){
                    binding.timerText.setTextColor(Color.WHITE)
                    binding.timerText.text=  "Time is up!"
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