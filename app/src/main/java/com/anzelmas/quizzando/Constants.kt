package com.anzelmas.quizzando

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val questionsOne = Question(
            1,
            "What questions is this?",
            R.drawable.ic_question_one,
            "Australia",
            "Argentina",
            "Austria",
            "Albania",
            1
        )
        questionList.add(questionsOne)

        val questionsTwo = Question(
            2,
            "What questions is this?",
            R.drawable.ic_question_two,
            "Australia",
            "Argentina",
            "Austria",
            "Albania",
            3
        )
        questionList.add(questionsTwo)

        val questionsThree = Question(
            3,
            "What questions is this?",
            R.drawable.ic_question_three,
            "Australia",
            "Argentina",
            "Austria",
            "Albania",
            4
        )
        questionList.add(questionsThree)

        val questionsFour = Question(
            4,
            "What questions is this?",
            R.drawable.ic_question_four,
            "Australia",
            "Argentina",
            "Austria",
            "Albania",
            2
        )
        questionList.add(questionsFour)

        val questionsFive = Question(
            5,
            "What questions is this?",
            R.drawable.ic_question_five,
            "Australia",
            "Argentina",
            "Austria",
            "Albania",
            3
        )
        questionList.add(questionsFive)

        return questionList
    }
}