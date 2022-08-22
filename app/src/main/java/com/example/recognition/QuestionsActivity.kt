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
        var questionNumber: Int = intent.getIntExtra("number", 0)
        var currentScore = intent.getIntExtra("currentScore", 0)
        var amountOfQ = 0

        Log.i("InitialVals", "$questionNumber,$category,$username,$currentScore")
        Log.i("Category Name", category)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        val timer =  object : CountDownTimer(11000,1000){
            override fun onTick(millisUntilFinished: Long){
                binding.timerText.text ="" + (millisUntilFinished / 1000).toString()
                if(millisUntilFinished/1000 < 5){
                    binding.timerText.setTextColor(Color.YELLOW)
                }
                if (millisUntilFinished/1000 < 3){
                    binding.timerText.setTextColor(Color.RED)
                }
            }

            override fun onFinish(){
                binding.timerText.setTextColor(Color.RED)
                binding.timerText.text = "0"
                Log.i("Values", "$questionNumber,$category,$username,$currentScore")
                nextActivity(questionNumber,category,username,currentScore, amountOfQ)
            }
        }

        timer.start()

        when (category) {
            "Memes" -> {
                val questions = getMemeQuestions()
                amountOfQ = questions.count()
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    timer.cancel()
                    binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                    if(binding.answerOne.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerOne.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerTwo.setOnClickListener{
                    timer.cancel()
                    if(binding.answerTwo.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerThree.setOnClickListener{
                    timer.cancel()
                    if(binding.answerThree.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerThree.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerFour.setOnClickListener{
                    timer.cancel()
                    if(binding.answerFour.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerFour.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                Log.i("Score", "${currentScore}/${questions.count()}")
            }
            "Music" -> {
                val questions = getMusicQuestions()
                amountOfQ = questions.count()
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    timer.cancel()
                    if(binding.answerOne.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerOne.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerTwo.setOnClickListener{
                    timer.cancel()
                    if(binding.answerTwo.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerThree.setOnClickListener{
                    timer.cancel()
                    if(binding.answerThree.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerThree.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerFour.setOnClickListener{
                    timer.cancel()
                    if(binding.answerFour.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerFour.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                Log.i("Score", "${currentScore}/${questions.count()}")
            }
            "Movies and Tv" -> {
                val questions = getTvQuestions()
                amountOfQ = questions.count()
                amountOfQ = questions.count()
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    timer.cancel()
                    if(binding.answerOne.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerOne.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerTwo.setOnClickListener{
                    timer.cancel()
                    if(binding.answerTwo.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerThree.setOnClickListener{
                    timer.cancel()
                    if(binding.answerThree.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerThree.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerFour.setOnClickListener{
                    timer.cancel()
                    if(binding.answerFour.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerFour.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                Log.i("Score", "${currentScore}/${questions.count()}")
            }
            "Celebrities" -> {
                val questions = getAllCelebQuestions()
                amountOfQ = questions.count()
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    timer.cancel()
                    if(binding.answerOne.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerOne.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerTwo.setOnClickListener{
                    timer.cancel()
                    if(binding.answerTwo.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerThree.setOnClickListener{
                    timer.cancel()
                    if(binding.answerThree.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerThree.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerFour.setOnClickListener{
                    timer.cancel()
                    if(binding.answerFour.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerFour.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                Log.i("Score", "${currentScore}/${questions.count()}")
            }
            "Logos" -> {
                val questions = LogoQuestions()
                amountOfQ = questions.count()
                val currQuestion = questions[questionNumber]
                updateUI(username, currQuestion)
                binding.answerOne.setOnClickListener{
                    timer.cancel()
                    if(binding.answerOne.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerOne.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerOne.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerTwo.setOnClickListener{
                    timer.cancel()
                    if(binding.answerTwo.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerTwo.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerThree.setOnClickListener{
                    timer.cancel()
                    if(binding.answerThree.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerThree.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerThree.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                binding.answerFour.setOnClickListener{
                    timer.cancel()
                    if(binding.answerFour.text == currQuestion.correctAnswer){
                        timer.cancel()
                        currentScore += 1
                        binding.answerFour.setBackgroundColor(Color.parseColor("#64CB40"))
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    } else{
                        binding.answerFour.setBackgroundColor(Color.parseColor("#EE3A57"))
                        currentScore += 0
                        nextActivity(questionNumber,category,username,currentScore, amountOfQ)
                    }
                }
                Log.i("Score", "${currentScore}/${questions.count()}")
            }
        }
        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun nextActivity( questionNumber: Int, category: String, username: String, currentScore: Int, questions: Int ){
        if(questionNumber+1 == questions){
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
    }
    fun updateUI(username: String, currentQuestion: Question, ){
        val category = intent.getStringExtra("Category").toString()
        if(currentQuestion.id == 1){
            binding.nameText.text= "Okay $username, ${currentQuestion.QuestionTxt}"
        } else{
            binding.nameText.text = "${currentQuestion.QuestionTxt}"
        }
        binding.textView.text = "$category"
        binding.imageContainer.setImageResource(currentQuestion.QuestionImg)
        binding.answerOne.text = currentQuestion.OptionOne
        binding.answerTwo.text = currentQuestion.OptionTwo
        binding.answerThree.text = currentQuestion.OptionThree
        binding.answerFour.text = currentQuestion.OptionFour
    }
}