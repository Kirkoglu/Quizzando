package com.anzelmas.quizzando

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val questionsOne = Question(
            1,
            "2011-2012 season was shorter because of a lockout. How many games teams played?",
            R.drawable.ic_question_one,
            "48",
            "54",
            "60",
            "66",
            4
        )
        questionList.add(questionsOne)

        val questionsTwo = Question(
            2,
            "How many times Michael Jordan won Dunk Contest?",
            R.drawable.ic_question_two,
            "One",
            "Two",
            "Three",
            "Four",
            2
        )
        questionList.add(questionsTwo)

        val questionThree = Question(
            3,
            "First pick of 2000 NBA draft?",
            R.drawable.ic_question_three,
            "Jamal Crawford",
            "Darius Miles",
            "Hedo Turkoglu",
            "Kenyon Martin",
            4
        )
        questionList.add(questionThree)

        val questionFour = Question(
            4,
            "Tallest player in NBA history?",
            R.drawable.ic_question_four,
            "Bol Bol",
            "Manute Bol",
            "Tacko Fall",
            "George Muresan",
            2
        )
        questionList.add(questionFour)

        val questionFive = Question(
            5,
            "How many three-pointers Shaquille O'Neal made during his career?",
            R.drawable.ic_question_five,
            "1",
            "3",
            "10",
            "22",
            1
        )
        questionList.add(questionFive)

        val questionSix = Question(
            6,
            "Who drafted Domantas Sabonis?",
            R.drawable.ic_question_six,
            "Oklahoma Thunder",
            "Minnesota Timberwolves",
            "Indiana Pacers",
            "Orlando Magic",
            4
        )
        questionList.add(questionSix)

        val questionSeven = Question(
            7,
            "Who became Most Valuable Player (MVP) in 2008?",
            R.drawable.ic_question_seven,
            "Kobe Bryant",
            "LeBron James",
            "Kevin Garnett",
            "Kevin Durant",
            1
        )
        questionList.add(questionSeven)

        val questionEight = Question(
            8,
            "NBA's top scorer of all time?",
            R.drawable.ic_question_eight,
            "Michael Jordan",
            "LeBron James",
            "Kareem Abdul-Jabbar",
            "Karl Malone",
            3
        )
        questionList.add(questionEight)

        val questionNine = Question(
            9,
            "CJ McCollum height is 191 cm. What was it in ninth grade?",
            R.drawable.ic_question_nine,
            "153 cm",
            "159 cm",
            "165 cm",
            "171 cm",
            2
        )
        questionList.add(questionNine)

        val questionTen = Question(
            10,
            "Which team has won the most NBA Championships?",
            R.drawable.ic_question_ten,
            "Los Angeles Lakers",
            "Golden State Warriors",
            "Boston Celtics",
            "New York Knicks",
            3
        )
        questionList.add(questionTen)

        return questionList
    }
}