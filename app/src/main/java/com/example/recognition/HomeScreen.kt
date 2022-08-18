package com.example.recognition

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityHomeScreenBinding
import com.example.recognition.models.Category
import com.example.recognition.models.CategoryConstants
import com.example.recognition.models.CategoryConstants.getAllCategories
import com.example.recognition.models.Constants.LogoQuestions
import com.example.recognition.models.Constants.getAllCelebQuestions
import com.example.recognition.models.Constants.getMemeQuestions
import com.example.recognition.models.Constants.getMusicQuestions
import com.example.recognition.models.Constants.getTvQuestions

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_home_screen)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val categories = getAllCategories()

        //these are the categories
        val categoryOne = categories[0]
        val categoryTwo = categories[1]
        val categoryThree = categories[2]
        val categoryFour = categories[3]
        val categoryFive = categories[4]
        setCategories(categoryOne, categoryTwo, categoryThree, categoryFour, categoryFive)

        binding.cdCategoryOne.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            intent.putExtra("Category", "Memes")
            startActivity(intent)
        }

        binding.cdCategoryTwo.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            intent.putExtra("Category", "Music")
            startActivity(intent)
        }
        binding.cdCategoryThree.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            intent.putExtra("Category", "Movies and Tv")
            startActivity(intent)
        }

        binding.cdCategoryFour.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            intent.putExtra("Category", "Celebrities")
            startActivity(intent)
        }

        binding.cdCategoryFive.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            intent.putExtra("Category", "Logos")
            startActivity(intent)
        }

        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }

    fun setCategories(CategoryName: Category, CategoryTwoName: Category, CategoryThreeName: Category, CategoryFourName: Category, CategoryFiveName: Category){
        val questionLength = getMemeQuestions()
        val categoryTwoLength = getMusicQuestions()
        val ctThreeLength = getTvQuestions()
        val ctFourLength = getAllCelebQuestions()
        val ctFiveLength = LogoQuestions()
        val Preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)
        val highScore = Preference.getInt(CategoryConstants.MEME_HIGH_SCORE, 0)
        val musicHighScore = Preference.getInt(CategoryConstants.MUSIC_HIGH_SCORE, 0)
        val tvHighScore = Preference.getInt(CategoryConstants.TV_HIGH_SCORE, 0)
        val celebHighScore = Preference.getInt(CategoryConstants.CELEB_HIGH_SCORE,0)
        val logoHighScore = Preference.getInt(CategoryConstants.LOGO_HIGH_SCORE,0)

        binding.categoryOneName.text = CategoryName.CategoryText
        binding.highScore.text = CategoryName.HighScore.toString()
        binding.questions.text = questionLength.count().toString()
        binding.imageone.setImageResource(CategoryName.img)

        binding.categoryTwoName.text = CategoryTwoName.CategoryText
        binding.highScoreTwo.text = CategoryTwoName.HighScore.toString()
        binding.questionsTwo.text = categoryTwoLength.count().toString()
        binding.imagetwo.setImageResource(CategoryTwoName.img)

        binding.categoryThreeName.text = CategoryThreeName.CategoryText
        binding.highScoreThree.text = CategoryThreeName.HighScore.toString()
        binding.questionsThree.text = ctThreeLength.count().toString()
        binding.imagethree.setImageResource(CategoryThreeName.img)

        binding.categoryFourName.text = CategoryFourName.CategoryText
        binding.highScoreFour.text = CategoryFourName.HighScore.toString()
        binding.questionsFour.text = ctFourLength.count().toString()
        binding.imagefour.setImageResource(CategoryFourName.img)

        binding.categoryFiveName.text = CategoryFiveName.CategoryText
        binding.highScoreFive.text = CategoryFiveName.HighScore.toString()
        binding.questionsFive.text = ctFiveLength.count().toString()
        binding.imagefive.setImageResource(CategoryFiveName.img)

        binding.highScore.text = "$highScore"
        binding.highScoreTwo.text="$musicHighScore"
        binding.highScoreThree.text = "$tvHighScore"
        binding.highScoreFour.text = "$celebHighScore"
        binding.highScoreFive.text = "$logoHighScore"
    }
}

