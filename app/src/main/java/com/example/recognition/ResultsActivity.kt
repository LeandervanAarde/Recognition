package com.example.recognition
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityResultsBinding
import com.example.recognition.models.CategoryConstants
import com.example.recognition.models.Constants.LogoQuestions
import com.example.recognition.models.Constants.getAllCelebQuestions
import com.example.recognition.models.Constants.getMemeQuestions
import com.example.recognition.models.Constants.getMusicQuestions
import com.example.recognition.models.Constants.getTvQuestions

class ResultsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        val Preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)
        val editor = Preference.edit()
        val category = intent.getStringExtra("Category").toString()
        Log.i("CATEGORY", category)
        intent.putExtra("Category", category)
        //Get the data
        val finalScore = intent.getIntExtra("currentScore", 0)
        val userName = intent.getStringExtra("username").toString()

        Log.i("The final score is...", finalScore.toString())

        when (category) {
            "Memes" -> {
                val length = getMemeQuestions().count()
                val questions = getMemeQuestions()
//                createResults(length, questions[0])
                Log.i("${category} score...", "$finalScore/$length" )
                binding.textView3.text = "$userName Score: $finalScore/$length"
                val lastScore = Preference.getInt(CategoryConstants.MEME_LAST_SCORE,0)
                val highScore = Preference.getInt(CategoryConstants.MEME_HIGH_SCORE, 0)
                if(highScore == 0){
                    editor.apply{
                        putInt(CategoryConstants.MEME_HIGH_SCORE, finalScore)
                        apply()
                    }
                } else if( finalScore > highScore){
                    editor.apply{
                        putInt(CategoryConstants.MEME_HIGH_SCORE, finalScore)
                        apply()
                    }
                }
                for(i in 0 until length){

                    val question = TextView(this)
                    question.textSize = 19f
                    question.setTextColor(Color.parseColor("#FFFFFF"))
                    question.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    question.text = "Q: ${questions[i].QuestionTxt}"
//                    layout.addView(question)
                    binding.linearLayoutBrah.addView(question)
                    Log.i("Q", "${questions[i].QuestionTxt}")

                    val answerOne = TextView(this)
                    answerOne.textSize = 17f
                    answerOne.setTextColor(Color.parseColor("#64CB40"))
                    answerOne.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerOne.text = "Q: ${questions[i].OptionOne}"
                    binding.linearLayoutBrah.addView(answerOne)

                    val answerTwo = TextView(this)
                    answerTwo.textSize = 17f
                    answerTwo.setTextColor(Color.parseColor("#EE3A57"))
                    answerTwo.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerTwo.text = "Q: ${questions[i].OptionTwo}"
                    binding.linearLayoutBrah.addView(answerTwo)

                    val answerThree = TextView(this)
                    answerThree.textSize = 17f
                    answerThree.setTextColor(Color.parseColor("#EE3A57"))
                    answerThree.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerThree.text = "Q: ${questions[i].OptionThree}"
                    binding.linearLayoutBrah.addView(answerThree)

                    val answerFour = TextView(this)
                    answerFour.textSize = 17f
                    answerFour.setTextColor(Color.parseColor("#EE3A57"))
                    answerFour.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerFour.text = "Q: ${questions[i].OptionFour}"

                    binding.linearLayoutBrah.addView(answerFour)
                }
                binding.textView4.text = "High Score: $highScore / $length"
            }
            "Music" -> {
                val length = getMusicQuestions().count()
                val questions = getMusicQuestions()
                Log.i("${category} score...", "$finalScore/$length")
                binding.textView3.text = "$userName Score: $finalScore/$length"
                val lastScore = Preference.getInt(CategoryConstants.MUSIC_LAST_SCORE,0)
                val musicHighScore = Preference.getInt(CategoryConstants.MUSIC_HIGH_SCORE, 0)
                if(finalScore == 0){
                    editor.apply{
                        putInt(CategoryConstants.MUSIC_HIGH_SCORE, finalScore)
                        apply()
                    }
                } else if( finalScore > musicHighScore){
                    editor.apply{
                        putInt(CategoryConstants.MUSIC_HIGH_SCORE, finalScore)
                        apply()
                    }
                }

                for(i in 0 until length){

                    val question = TextView(this)
                    question.textSize = 19f
                    question.setTextColor(Color.parseColor("#FFFFFF"))
                    question.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    question.text = "Q: ${questions[i].QuestionTxt}"
//                    layout.addView(question)
                    binding.linearLayoutBrah.addView(question)
                    Log.i("Q", "${questions[i].QuestionTxt}")

                    val answerOne = TextView(this)
                    answerOne.textSize = 17f
                    answerOne.setTextColor(Color.parseColor("#64CB40"))
                    answerOne.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerOne.text = "Q: ${questions[i].OptionOne}"
                    binding.linearLayoutBrah.addView(answerOne)

                    val answerTwo = TextView(this)
                    answerTwo.textSize = 17f
                    answerTwo.setTextColor(Color.parseColor("#EE3A57"))
                    answerTwo.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerTwo.text = "Q: ${questions[i].OptionTwo}"
                    binding.linearLayoutBrah.addView(answerTwo)

                    val answerThree = TextView(this)
                    answerThree.textSize = 17f
                    answerThree.setTextColor(Color.parseColor("#EE3A57"))
                    answerThree.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerThree.text = "Q: ${questions[i].OptionThree}"
                    binding.linearLayoutBrah.addView(answerThree)

                    val answerFour = TextView(this)
                    answerFour.textSize = 17f
                    answerFour.setTextColor(Color.parseColor("#EE3A57"))
                    answerFour.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerFour.text = "Q: ${questions[i].OptionFour}"

                    binding.linearLayoutBrah.addView(answerFour)


                }
                binding.textView4.text = "High Score: $musicHighScore / $length"
            }
            "Movies and Tv" -> {
                val length = getTvQuestions().count()
                val questions = getTvQuestions()
                Log.i("${category} score...", "$finalScore/$length" )
                binding.textView3.text = "$userName Score: $finalScore/$length"
                val lastScore = Preference.getInt(CategoryConstants.TV_LAST_SCORE,0)
                val highScore = Preference.getInt(CategoryConstants.TV_HIGH_SCORE, 0)
                if(highScore == 0){
                    editor.apply{
                        putInt(CategoryConstants.TV_HIGH_SCORE, finalScore)
                        apply()
                    }
                } else if( finalScore > highScore){
                    editor.apply{
                        putInt(CategoryConstants.TV_HIGH_SCORE, finalScore)
                        apply()
                    }
                }
                for(i in 0 until length){

                    val question = TextView(this)
                    question.textSize = 19f
                    question.setTextColor(Color.parseColor("#FFFFFF"))
                    question.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    question.text = "Q: ${questions[i].QuestionTxt}"
//                    layout.addView(question)
                    binding.linearLayoutBrah.addView(question)
                    Log.i("Q", "${questions[i].QuestionTxt}")

                    val answerOne = TextView(this)
                    answerOne.textSize = 17f
                    answerOne.setTextColor(Color.parseColor("#EE3A57"))
                    answerOne.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerOne.text = "Q: ${questions[i].OptionOne}"
                    binding.linearLayoutBrah.addView(answerOne)

                    val answerTwo = TextView(this)
                    answerTwo.textSize = 17f
                    answerTwo.setTextColor(Color.parseColor("#EE3A57"))
                    answerTwo.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerTwo.text = "Q: ${questions[i].OptionTwo}"
                    binding.linearLayoutBrah.addView(answerTwo)

                    val answerThree = TextView(this)
                    answerThree.textSize = 17f
                    answerThree.setTextColor(Color.parseColor("#64CB40"))
                    answerThree.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerThree.text = "Q: ${questions[i].OptionThree}"
                    binding.linearLayoutBrah.addView(answerThree)

                    val answerFour = TextView(this)
                    answerFour.textSize = 17f
                    answerFour.setTextColor(Color.parseColor("#EE3A57"))
                    answerFour.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerFour.text = "Q: ${questions[i].OptionFour}"

                    binding.linearLayoutBrah.addView(answerFour)


                }
                binding.textView4.text = "High Score: $highScore / $length"
            }
            "Celebrities" -> {
                val questions = getAllCelebQuestions()
                val length = getAllCelebQuestions().count()
                Log.i("${category} score...", "$finalScore/$length" )
                binding.textView3.text = "$userName Score: $finalScore/$length"
                val lastScore = Preference.getInt(CategoryConstants.Celeb_LAST_SCORE,0)
                val highScore = Preference.getInt(CategoryConstants.CELEB_HIGH_SCORE, 0)
                if(highScore == 0){
                    editor.apply{
                        putInt(CategoryConstants.CELEB_HIGH_SCORE, finalScore)
                        apply()
                    }
                } else if( finalScore > highScore){
                    editor.apply{
                        putInt(CategoryConstants.CELEB_HIGH_SCORE, finalScore)
                        apply()
                    }
                }
                for(i in 0 until length){

                    val question = TextView(this)
                    question.textSize = 19f
                    question.setTextColor(Color.parseColor("#FFFFFF"))
                    question.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    question.text = "Q: ${questions[i].QuestionTxt}"
//                    layout.addView(question)
                    binding.linearLayoutBrah.addView(question)
                    Log.i("Q", "${questions[i].QuestionTxt}")

                    val answerOne = TextView(this)
                    answerOne.textSize = 17f
                    answerOne.setTextColor(Color.parseColor("#EE3A57"))
                    answerOne.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerOne.text = "Q: ${questions[i].OptionOne}"
                    binding.linearLayoutBrah.addView(answerOne)

                    val answerTwo = TextView(this)
                    answerTwo.textSize = 17f
                    answerTwo.setTextColor(Color.parseColor("#EE3A57"))
                    answerTwo.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerTwo.text = "Q: ${questions[i].OptionTwo}"
                    binding.linearLayoutBrah.addView(answerTwo)

                    val answerThree = TextView(this)
                    answerThree.textSize = 17f
                    answerThree.setTextColor(Color.parseColor("#EE3A57"))
                    answerThree.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerThree.text = "Q: ${questions[i].OptionThree}"
                    binding.linearLayoutBrah.addView(answerThree)

                    val answerFour = TextView(this)
                    answerFour.textSize = 17f
                    answerFour.setTextColor(Color.parseColor("#64CB40"))
                    answerFour.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerFour.text = "Q: ${questions[i].OptionFour}"

                    binding.linearLayoutBrah.addView(answerFour)


                }
                binding.textView4.text = "High Score: $highScore / $length"
            }
            "Logos" -> {
                val length = LogoQuestions().count()
                val questions = LogoQuestions()
                Log.i("${category} score...", "$finalScore/$length" )
                binding.textView3.text = "$userName Score: $finalScore/$length"
                val lastScore = Preference.getInt(CategoryConstants.LOGO_LAST_SCORE,0)
                val highScore = Preference.getInt(CategoryConstants.LOGO_HIGH_SCORE, 0)
                if(highScore == 0){
                    editor.apply{
                        putInt(CategoryConstants.LOGO_HIGH_SCORE, finalScore)
                        apply()
                        binding.textView4.text = "High Score: $finalScore / $length"
                    }
                } else if( finalScore > highScore){
                    editor.apply{
                        putInt(CategoryConstants.LOGO_HIGH_SCORE, finalScore)
                        apply()
                        binding.textView4.text = "High Score: $finalScore / $length"
                    }
                }
                for(i in 0 until length){

                    val question = TextView(this)
                    question.textSize = 19f
                    question.setTextColor(Color.parseColor("#FFFFFF"))
                    question.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    question.text = "Q: ${questions[i].QuestionTxt}"
//                    layout.addView(question)
                    binding.linearLayoutBrah.addView(question)
                    Log.i("Q", "${questions[i].QuestionTxt}")

                    val answerOne = TextView(this)
                    answerOne.textSize = 17f
                    answerOne.setTextColor(Color.parseColor("#EE3A57"))
                    answerOne.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerOne.text = "Q: ${questions[i].OptionOne}"
                    binding.linearLayoutBrah.addView(answerOne)

                    val answerTwo = TextView(this)
                    answerTwo.textSize = 17f
                    answerTwo.setTextColor(Color.parseColor("#64CB40"))
                    answerTwo.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerTwo.text = "Q: ${questions[i].OptionTwo}"
                    binding.linearLayoutBrah.addView(answerTwo)

                    val answerThree = TextView(this)
                    answerThree.textSize = 17f
                    answerThree.setTextColor(Color.parseColor("#EE3A57"))
                    answerThree.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerThree.text = "Q: ${questions[i].OptionThree}"
                    binding.linearLayoutBrah.addView(answerThree)

                    val answerFour = TextView(this)
                    answerFour.textSize = 17f
                    answerFour.setTextColor(Color.parseColor("#EE3A57"))
                    answerFour.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_START
                    answerFour.text = "Q: ${questions[i].OptionFour}"

                    binding.linearLayoutBrah.addView(answerFour)


                }
                binding.textView4.text = "High Score: $highScore / $length"
            }
        }

        binding.goHome.setOnClickListener{
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}