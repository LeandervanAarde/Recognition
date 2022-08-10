package com.example.recognition

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.recognition.databinding.ActivityHomeScreenBinding
import com.example.recognition.models.Category
import com.example.recognition.models.CategoryConstants.getAllCategories
import com.example.recognition.models.Constants.getMemeQuestions

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
        val memeQs = getMemeQuestions()
        val categoryOne = categories[0]
        setCategories(categoryOne)

        binding.cdCategoryOne.setOnClickListener{
            val intent = Intent(this, EnterName::class.java )
            startActivity(intent)
        }


        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }

    fun setCategories(CategoryName: Category){
        val questionLength = getMemeQuestions()
        binding.categoryOneName.text = CategoryName.CategoryText
        binding.highScore.text = CategoryName.HighScore.toString()
        binding.questions.text = questionLength.count().toString()
    }
}

