package com.example.recognition.models

object Constants {

    fun getAllQuestions(): ArrayList<Question>{
        val AllQuestions = ArrayList<Question>()

        val QuestionOne = Question(
            1,
            "Memes",

            "What is this meme generally associated with?",
            "Being an intellectual",
            "Hillbillies",
            "WiTh BeInG sTuPiD",
            "Spongebob, obviously"
        )

        AllQuestions.add(QuestionOne)

        return AllQuestions
    }
}