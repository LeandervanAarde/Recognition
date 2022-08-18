package com.example.recognition.models

import com.example.recognition.R

object CategoryConstants {
    val MEME_HIGH_SCORE: String = "memehighscore"
    val MEME_LAST_SCORE: String = "memeLast"
    val MUSIC_HIGH_SCORE: String = "musichighscore"
    val MUSIC_LAST_SCORE: String = "musicLast"
    val TV_HIGH_SCORE: String = "tvhighscore"
    val TV_LAST_SCORE: String = "tvlast"
    val CELEB_HIGH_SCORE: String = "celebhighscore"
    val Celeb_LAST_SCORE: String = "celeblast"
    val LOGO_HIGH_SCORE: String = "logohighscore"
    val LOGO_LAST_SCORE: String = "logolast"

    fun getAllCategories (): ArrayList<Category>{
        var allCategories = ArrayList<Category>()
        val CategoryOne = Category(
            1,
            R.drawable.frymeme,
            "Memes",
            0,
            0
        )

        val CategoryTwo = Category(
            2,
            R.drawable.mchammer,
            "Music",
            0,
            5
        )

        val CategoryThree  =Category(
            3,
            R.drawable.ronburgundy,
            "Movies and Tv",
            0,
            5
        )

        val CategoryFour = Category(
            4,
            R.drawable.danielleradc,
            "Celebrities",
            0,
            5
        )

        val CategoryFive = Category(
            5,
            R.drawable.mcdonalds,
            "Logos",
            0,
            0
        )

        // Add all the categories
        allCategories.add(CategoryOne)
        allCategories.add(CategoryTwo)
        allCategories.add(CategoryThree)
        allCategories.add(CategoryFour)
        allCategories.add(CategoryFive)

        // Returns all of the data
        return allCategories
    }
}