package com.example.recognition.models

object CategoryConstants {
    fun getAllCategories (): ArrayList<Category>{
        var allCategories = ArrayList<Category>()
        val CategoryOne = Category(
            1,
            "Memes",
            0,
            5
        )

        val CategoryTwo = Category(
            2,
            "Music",
            0,
            5
        )

        val CategoryThree  =Category(
            3,
            "Movies and Tv",
            0,
            5
        )

        val CategoryFour = Category(
            4,
            "Celebrities",
            0,
            5
        )

        val CategoryFive = Category(
            5,
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