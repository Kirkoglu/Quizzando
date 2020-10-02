package com.anzelmas.quizzando

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val questionsOne = Question(
            1,
            "Can you see thi question number one?",
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
            "Can you see this question two?",
            R.drawable.ic_question_two,
            "Belgium",
            "Brazil",
            "Belarus",
            "Bulgaria",
            3
        )
        questionList.add(questionsTwo)

        val questionsThree = Question(
            3,
            "This is questions three. Can you see it?",
            R.drawable.ic_question_three,
            "Cyprus",
            "Croatia",
            "China",
            "Columbia",
            4
        )
        questionList.add(questionsThree)

        val questionsFour = Question(
            4,
            "Question four I reckon. You still here?",
            R.drawable.ic_question_four,
            "Denmark",
            "Dominica",
            "Djibouti",
            "Dominican Republic",
            2
        )
        questionList.add(questionsFour)

        val questionsFive = Question(
            5,
            "Question five is on board. Can you see it?",
            R.drawable.ic_question_five,
            "Ethopia",
            "El Salvador",
            "Egypt",
            "Equador",
            3
        )
        questionList.add(questionsFive)

        return questionList
    }
}