package com.example.recognition.models

object Constants {

    fun getMemeQuestions(): ArrayList<Question>{
        val MemeQuestions = ArrayList<Question>()

        val QuestionOne = Question(
            1,
            "What is this meme generally associated with?",
            "Being an intellectual",
            "Hillbillies",
            "WiTh BeInG sTuPiD",
            "Spongebob, obviously"
        )

        val QuestionTwo = Question(
            2,
            "What does this meme stand for?",
            "an Interest in another aspect",
            "This guy is whistling",
            "Looking for ticks.",
            "Meaningless"
        )

        MemeQuestions.add(QuestionOne)
        MemeQuestions.add(QuestionTwo)

        return MemeQuestions
    }

}