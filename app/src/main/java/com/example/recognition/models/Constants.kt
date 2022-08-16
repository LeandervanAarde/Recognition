package com.example.recognition.models

object Constants {

    fun getMemeQuestions(): ArrayList<Question>{
        val MemeQuestions = ArrayList<Question>()

        val QuestionOne = Question(
            1,
            "What is this meme generally associated with hm?",
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

        val QuestionThree = Question(
            3,
            "What caption does this meme usually have?",
            "Not sure if...",
            "can't tell if...",
            "It might not be...",
            "Take my money!"
        )

        val QuestionFour = Question(
            4,
            "Who is this monke?",
            "Harambe",
            "Harembae",
            "MonkeyMan",
            "This is just a Gorilla."
        )

        val QuestionFive = Question(
            5,
            "Who needs to wake up?",
            "Chrissy",
            "Eleven",
            "John Cena",
            "Chistopher"
        )

        val QuestionSix = Question(
            5,
            "What is her catchPhrase?",
            "Catch me outside how 'bout dat?",
            "Dr. Phil can go away",
            "I hate my mom",
            "Gucci Flip drops"
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
            "Calvin Cordozar Broadus Jr.",
            "Cameron Jibril Thomaz",
            "Willard Carroll",
            "Dwayne Michael Carter, Jr."
        )

        val QuestionTwo = Question(
            2,
            "How old was Britney Spears when her hit song ‘Baby One More Time’ came out in 1998? ",
            "17",
            "18",
            "24",
            "22"
        )

        val QuestionThree = Question(
            3,
            "Which tool-themed MC won best rap video and best dance video at the 1990 MTV Video Music Awards?",
            "MC Hammer",
            "Eminem.",
            "Tupac",
            "Biggie Smalls"
        )

        val QuestionFour = Question(
            4,
            "Justin Timberlake wrote what 2002 hit after breaking up with Britney Spears? ",
            "Cry me a river",
            "Like I love you",
            "Take it from here",
            "Still on my Brain"
        )

        val QuestionFive = Question(
            5,
            "I kissed a girl came out in what year?",
            "2008",
            "2007",
            "2006",
            "2005"
        )

        val QuestionSix = Question(
            6,
            "Eminem's 8 Mile is named after a road in which city?",
            "Detroit",
            "Michigan",
            "Cleveland",
            "Columbus"
        )

        val QuestionSeven = Question(
            7,
            "Who sang the Spongebob Squarepants theme song for the movie?",
            "Avril Lavigne",
            "Britney Spears",
            "Alicia Keys",
            "Katy Perry"
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
            "An entire Casserole",
            "4 pizzas",
            "An entire chicken pot Pie",
            "12 hotdogs and a Coca-Cola"
        )

        val QuestionTwo = Question(
            2,
            "South Park takes place in which state?",
            "Wisconsin",
            "Minnesota",
            "Colorado",
            "Vermont"
        )

        val QuestionThree = Question(
            3,
            "Who was Bart Simpson's teacher?",
            "Ned Flanders",
            "Principal Skinner",
            "Mrs. Krabappel",
            "Miss Hoover"
        )

        val QuestionFour = Question(
            4,
            "Which of the core male That '70s Show characters is the only one who never dated Jackie Burkhart?",
            "Hyde",
            "Fes",
            "Eric",
            "Michael"
        )

        val QuestionFive = Question(
            5,
            "How did Charlie Sheen's character Charlie Harper die in Two And A Half Men?",
            "Overdose",
            "Sickness",
            "Pushed infront of a train",
            "Car crash"
        )

        val QuestionSix = Question(
            6,
            "On The Big Bang Theory, Penny is a waitress at which restaurant?",
            "McDonalds",
            "Olive garden",
            "Cheesecake Factory",
            "Hooters"
        )

        val QuestionSeven = Question(
            7,
            "What was the name of Ron Burgundy's channel in Anchorman?",
            "Channel 9",
            "Channel 5",
            "Channel 4",
            "Channel 2"
        )

        val QuestionEight = Question(
            8,
            "What is the name of Winston's cat in New Girl?",
            "Spotty",
            "Ferry",
            "Ferguson",
            "He had no name"
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
            "Speeding",
            "Fighting",
            "He was not arrested in 2013",
            "Driving under the influence"
        )

        val QuestionTwo = Question(
            2,
            "Michael Jordan starred in what movie?",
            "Coach Carter",
            "Semi pro",
            "Love & basketball",
            "Space Jam"
        )

        val QuestionThree = Question(
            3,
            "Daniel Radcliffe was the lead of what movie?",
            "Fantastic beasts and where to find them",
            "Lord of the rings",
            "Split",
            "Harry Potter"
        )

        val QuestionFour = Question(
            4,
            "How did Eminem come up with the name Slim Shady?",
            "it was always a nickname",
            "While he was at a bar",
            "While reading a comic book",
            "It came to him when he was on the toilet"
        )

        val QuestionFive = Question(
            5,
            "How many movies has Will Ferrel been in?",
            "12",
            "125",
            "50",
            "Atleast 63"
        )

        val QuestionSix = Question(
            6,
            "What is the alternative name for Mickey Mouse?",
            "Michael Mouse",
            "There are none",
            "Mick mouse",
            "Mortimer Mouse"
        )

        val QuestionSeven = Question(
            7,
            "What was the name of Ron Burgundy's channel in Anchorman?",
            "Channel 9",
            "Channel 5",
            "Channel 4",
            "Channel 2"
        )

        CelebrityQuestions.add(QuestionOne)
        CelebrityQuestions.add(QuestionTwo)
        CelebrityQuestions.add(QuestionThree)
        CelebrityQuestions.add(QuestionFour)
        CelebrityQuestions.add(QuestionFive)
        CelebrityQuestions.add(QuestionSix)
        CelebrityQuestions.add(QuestionSeven)

        return CelebrityQuestions
    }

    fun LogoQuestions(): ArrayList <Question> {
        val logoQuestion = ArrayList<Question>()
        val QuestionOne = Question(
            1,
            "What company does this Logo Belong to?",
            "KFC",
            "McDonalds",
            "Taco Bell",
            "Burger King"
        )

        val QuestionTwo = Question(
            2,
            "What company does this Logo Belong to?",
            "John Deere",
            "Safari and Outdoor",
            "Old Khaki",
            "Jeep"
        )

        val QuestionThree = Question(
            3,
            "What company does this Logo Belong to?",
            "20th Century Fox",
            "DreamWorks",
            "Pixar",
            "Warner Bros"
        )

        val QuestionFour = Question(
            4,
            "What company does this Logo Belong to?",
            "Beats",
            "Apple",
            "Nike",
            "Adidas"
        )

        val QuestionFive = Question(
            5,
            "What company does this Logo Belong to?",
            "Facebook",
            "Twitter",
            "Instagram",
            "Fake Logo"
        )

        logoQuestion.add(QuestionOne)
        logoQuestion.add(QuestionTwo)
        logoQuestion.add(QuestionThree)
        logoQuestion.add(QuestionFour)
        logoQuestion.add(QuestionFive)

        return logoQuestion
    }
}