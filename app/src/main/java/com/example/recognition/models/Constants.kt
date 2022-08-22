package com.example.recognition.models

import com.example.recognition.R

object Constants {

    fun getMemeQuestions(): ArrayList<Question>{
        val MemeQuestions = ArrayList<Question>()

        val QuestionOne = Question(
            1,
            "What is this meme generally associated with hm?",
            R.drawable.download,
            "Being an intellectual",
            "Hillbillies",
            "WiTh BeInG StuPid",
            "Spongebob, obviously",
            "WiTh BeInG StuPid"
        )

        val QuestionTwo = Question(
            2,
            "What does this meme stand for?",
            R.drawable.guylookingback,
            "an Interest in another aspect",
            "This guy is whistling",
            "Looking for ticks.",
            "Meaningless",
            "an Interest in another aspect"
        )

        val QuestionThree = Question(
            3,
            "What caption does this meme usually have?",
            R.drawable.frymeme,
            "Take my money!",
            "can't tell if...",
            "It might not be...",
            "Not sure if...",
            "Not sure if..."
        )

        val QuestionFour = Question(
            4,
            "Who is this monke?",
            R.drawable.harambemonkey,
            "Harembae",
            "Harambe",
            "MonkeyMan",
            "This is just a Gorilla.",
            "Harambe"
        )

        val QuestionFive = Question(
            5,
            "Who needs to wake up?",
            R.drawable.chrissywakeup,
            "Chrissy",
            "Eleven",
            "John Cena",
            "Chistopher",
            "Chrissy"
        )

        val QuestionSix = Question(
            5,
            "What is her catchPhrase?",
            R.drawable.cashmeoutside,
            "Gucci Flip drops",
            "Dr. Phil can go away",
            "I hate my mom",
            "Catch me outside how 'bout dat?",
            "Catch me outside how 'bout dat?"
        )
        MemeQuestions.add(QuestionOne)
        MemeQuestions.add(QuestionTwo)
        MemeQuestions.add(QuestionThree)
        MemeQuestions.add(QuestionFour)
        MemeQuestions.add(QuestionFive)
        MemeQuestions.add(QuestionSix)

        return MemeQuestions
    }

    //Category two

    fun getMusicQuestions():ArrayList <Question>{
        val MusicQuestions = ArrayList <Question>()

        val QuestionOne = Question(
            1,
            "What is this Rappers birth name?",
            R.drawable.snoop,
            "Calvin Cordozar Broadus Jr.",
            "Cameron Jibril Thomaz",
            "Willard Carroll",
            "Dwayne Michael Carter, Jr.",
            "Calvin Cordozar Broadus Jr."
        )

        val QuestionTwo = Question(
            2,
            "How old was Britney Spears when her hit song ‘Baby One More Time’ came out in 1998? ",
            R.drawable.britney,
            "30",
            "18",
            "24",
            "17",
            "17"
        )

        val QuestionThree = Question(
            3,
            "Which tool-themed MC won best rap video and best dance video at the 1990 MTV Video Music Awards?",
            R.drawable.mchammer,
            "MC Hammer",
            "Eminem.",
            "Tupac",
            "Biggie Smalls",
            "MC Hammer"
        )

        val QuestionFour = Question(
            4,
            "Justin Timberlake wrote what 2002 hit after breaking up with Britney Spears? ",
            R.drawable.justint,
            "Take it from here",
            "Like I love you",
            "Cry me a river",
            "Still on my Brain",
            "Cry me a river"
        )

        val QuestionFive = Question(
            5,
            "I kissed a girl came out in what year?",
            R.drawable.ikissedagirl,
            "2004",
            "2007",
            "2008",
            "2005",
            "2008"
        )

        val QuestionSix = Question(
            6,
            "Eminem's 8 Mile is named after a road in which city?",
            R.drawable.eminem,
            "Detroit",
            "Michigan",
            "Cleveland",
            "Columbus",
            "Detroit"
        )

        val QuestionSeven = Question(
            7,
            "Who sang the Spongebob Squarepants theme song for the movie?",
            R.drawable.spongebok,
            "Avril Lavigne",
            "Britney Spears",
            "Alicia Keys",
            "Katy Perry",
            "Avril Lavigne"
        )
        MusicQuestions.add(QuestionOne)
        MusicQuestions.add(QuestionTwo)
        MusicQuestions.add(QuestionThree)
        MusicQuestions.add(QuestionFour)
        MusicQuestions.add(QuestionFive)
        MusicQuestions.add(QuestionSix)
        MusicQuestions.add(QuestionSeven)

        return MusicQuestions
    }

    //category three

    fun getTvQuestions(): ArrayList <Question>{
        val tvQuestions = ArrayList <Question>()

        val QuestionOne = Question(
            1,
            "What does Michael Scott eat for lunch on The Office that makes him fall asleep?",
            R.drawable.michaelscott,
            "An entire Casserole",
            "4 pizzas",
            "An entire chicken pot Pie",
            "12 hotdogs and a Coca-Cola",
            "An entire chicken pot Pie"
        )

        val QuestionTwo = Question(
            2,
            "South Park takes place in which state?",
            R.drawable.southpark,
            "Wisconsin",
            "Colorado",
            "Minnesota",
            "Vermont",
            "Colorado"
        )

        val QuestionThree = Question(
            3,
            "Who was Bart Simpson's teacher?",
            R.drawable.bartsimpson,
            "Ned Flanders",
            "Principal Skinner",
            "Mrs. Krabappel",
            "Miss Hoover",
            "Mrs. Krabappel"
        )

        val QuestionFour = Question(
            4,
            "Which of the core male from That '70s Show characters is the only one who never dated Jackie Burkhart?",
            R.drawable.jackie,
            "Hyde",
            "Fes",
            "Michael",
            "Eric",
        "Eric"
        )

        val QuestionFive = Question(
            5,
            "How did Charlie Sheen's character Charlie Harper die in Two And A Half Men?",
            R.drawable.charlieharper,
            "Overdose",
            "Sickness",
            "Pushed infront of a train",
            "Car crash",
        "Pushed infront of a train"
        )

        val QuestionSix = Question(
            6,
            "On The Big Bang Theory, Penny is a waitress at which restaurant?",
            R.drawable.penny,
            "McDonalds",
            "Cheesecake Factory",
            "Olive garden",
            "Hooters",
        "Cheesecake Factory"
        )

        val QuestionSeven = Question(
            7,
            "What was the name of Ron Burgundy's channel in Anchorman?",
            R.drawable.ronburgundy,
            "Channel 4",
            "Channel 5",
            "Channel 9",
            "Channel 2",
            "Channel 4"
        )

        val QuestionEight = Question(
            8,
            "What is the name of Winston's cat in New Girl?",
            R.drawable.fergusoncat,
            "Spotty",
            "Ferguson",
            "Ferry",
            "He had no name",
            "Ferguson"
        )

        tvQuestions.add(QuestionOne)
        tvQuestions.add(QuestionTwo)
        tvQuestions.add(QuestionThree)
        tvQuestions.add(QuestionFour)
        tvQuestions.add(QuestionFive)
        tvQuestions.add(QuestionSix)
        tvQuestions.add(QuestionSeven)
        tvQuestions.add(QuestionEight)
        return tvQuestions
    }

    fun getAllCelebQuestions(): ArrayList <Question>{
        val CelebrityQuestions = ArrayList <Question>()

        val QuestionOne = Question(
            1,
            "What was Justin Bieber arrested for in 2013?",
            R.drawable.justint,
            "Speeding",
            "Fighting",
            "He was not arrested in 2013",
            "Driving under the influence",
            "Driving under the influence"
        )

        val QuestionTwo = Question(
            2,
            "Michael Jordan starred in what movie?",
            R.drawable.michaelj,
            "Space Jam",
            "Semi pro",
            "Love & basketball",
            "Coach Carter",
            "Space Jam"
        )

        val QuestionThree = Question(
            3,
            "Daniel Radcliffe was the lead of what movie?",
            R.drawable.danielleradc,
            "Harry Potter",
            "Lord of the rings",
            "Split",
            "Fantastic beasts and where to find them",
            "Harry Potter"

        )

        val QuestionFour = Question(
            4,
            "How did Eminem come up with the name Slim Shady?",
            R.drawable.slimshady,
            "it was always a nickname",
            "While he was at a bar",
            "It came to him when he was on the toilet",
            "While reading a comic book",
            "It came to him when he was on the toilet"
        )

        val QuestionFive = Question(
            5,
            "How many movies has Will Ferrel been in?",
            R.drawable.willf,
            "12",
            "125",
            "50",
            "Atleast 63",
            "Atleast 63"
        )

        val QuestionSix = Question(
            6,
            "What is the alternative name for Mickey Mouse?",
            R.drawable.mickeym,
            "Mortimer Mouse",
            "There are none",
            "Mick mouse",
            "Mortimer Mouse",
            "Michael Mouse"
        )

        CelebrityQuestions.add(QuestionOne)
        CelebrityQuestions.add(QuestionTwo)
        CelebrityQuestions.add(QuestionThree)
        CelebrityQuestions.add(QuestionFour)
        CelebrityQuestions.add(QuestionFive)
        CelebrityQuestions.add(QuestionSix)

        return CelebrityQuestions
    }

    fun LogoQuestions(): ArrayList <Question> {
        val logoQuestion = ArrayList<Question>()
        val QuestionOne = Question(
            1,
            "What company does this Logo Belong to?",
            R.drawable.mcdonalds,
            "KFC",
            "McDonalds",
            "Taco Bell",
            "Burger King",
        "McDonalds"
        )

        val QuestionTwo = Question(
            2,
            "What company does this Logo Belong to?",
            R.drawable.jeep,
            "Jeep",
            "John Deere",
            "Old Khaki",
            "Safari and Outdoor",
            "Jeep"
        )

        val QuestionThree = Question(
            3,
            "What company does this Logo Belong to?",
            R.drawable.dreamworks,
            "20th Century Fox",
            "Pixar",
            "DreamWorks",
            "Warner Bros",
            "DreamWorks"
        )

        val QuestionFour = Question(
            4,
            "What company does this Logo Belong to?",
            R.drawable.apple,
            "Beats",
            "Apple",
            "Nike",
            "Adidas",
            "Apple"
        )

        val QuestionFive = Question(
            5,
            "What company does this Logo Belong to?",
            R.drawable.twitter,
            "Facebook",
            "Fake Logo",
            "Instagram",
            "Twitter",
            "Twitter"
        )
        logoQuestion.add(QuestionOne)
        logoQuestion.add(QuestionTwo)
        logoQuestion.add(QuestionThree)
        logoQuestion.add(QuestionFour)
        logoQuestion.add(QuestionFive)
        return logoQuestion
    }
}