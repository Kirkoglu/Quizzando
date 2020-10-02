package com.anzelmas.quizzando

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {


    private var currentPosition: Int = 1
    private var questionList: ArrayList<Question>? = null
    private var selectedOption: Int = 0
    private var correctAnswersNumber: Int = 0
    private var userName: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        userName = intent.getStringExtra(Constants.USER_NAME)

        questionList = Constants.getQuestions()
//        Log.i("Question size", "${questionList!!.size}")

        putQuestion()

        optionOne_TextView.setOnClickListener(this)
        optionTwo_textView.setOnClickListener(this)
        optionThree_TextView.setOnClickListener(this)
        optionFour_TextView.setOnClickListener(this)
        submit_Button.setOnClickListener(this)
    }

    private fun putQuestion() {
        val question = questionList!![currentPosition - 1]

        defaultOptions()
        submit_Button.text = "SUBMIT"

        progressBar.progress = currentPosition
        progressBar_textView.text = "$currentPosition" + "/" + progressBar.max


        question_TextView.text = question.question
        question_image_imageView.setImageResource(question.image)
        optionOne_TextView.text = question.optionOne
        optionTwo_textView.text = question.optionTwo
        optionThree_TextView.text = question.optionThree
        optionFour_TextView.text = question.optionFour
    }

    private fun defaultOptions() {
        val options = ArrayList<TextView>()
        options.add(0, optionOne_TextView)
        options.add(1, optionTwo_textView)
        options.add(2, optionThree_TextView)
        options.add(3, optionFour_TextView)

        for (option in options) {
            option.setTextColor(Color.parseColor("#313030"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(textView: TextView, selectedOptionNumber: Int) {
        defaultOptions()

        selectedOption = selectedOptionNumber

        textView.setTextColor(Color.parseColor("#313030"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.optionOne_TextView -> selectedOptionView(optionOne_TextView, 1)
            R.id.optionTwo_textView -> selectedOptionView(optionTwo_textView, 2)
            R.id.optionThree_TextView -> selectedOptionView(optionThree_TextView, 3)
            R.id.optionFour_TextView -> selectedOptionView(optionFour_TextView, 4)
            R.id.submit_Button -> {
                if (selectedOption == 0) {
                    currentPosition++
                    when {
                        currentPosition <= questionList!!.size -> {
                            putQuestion()
                        }
                        else -> {
                           val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, userName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswersNumber)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, questionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = questionList?.get(currentPosition - 1)

                    if (question!!.correctOption != selectedOption) {
                        answerView(selectedOption, R.drawable.wrong_option_border_bg)
                    } else {
                        correctAnswersNumber++
                    }
                    answerView(question.correctOption, R.drawable.correct_option_border_bg)

                    if (currentPosition == questionList!!.size) {
                        submit_Button.text = "View Results"
                    } else {
                        submit_Button.text = "Next Question"
                    }
                }
                selectedOption = 0
            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> optionOne_TextView.background = ContextCompat.getDrawable(
                this,
                drawableView
            )
            2 -> optionTwo_textView.background = ContextCompat.getDrawable(
                this,
                drawableView
            )
            3 -> optionThree_TextView.background = ContextCompat.getDrawable(
                this,
                drawableView
            )
            4 -> optionFour_TextView.background = ContextCompat.getDrawable(
                this,
                drawableView
            )
        }
    }
}


//abstract class QuizQuestionActivity<T : ViewDataBinding> : AppCompatActivity(){
//    @LayoutRes
//    abstract fun activity_quiz_question(): Int
//
//    private lateinit var binding: T
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // Inflate layout XML file and return a binding object instance
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_quiz_question)
//
//        val questionsList = Constants.getQuestions()
//        Log.i("Question size", "${questionsList.size}")
//    }
//}