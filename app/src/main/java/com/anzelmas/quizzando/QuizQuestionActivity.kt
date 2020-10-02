package com.anzelmas.quizzando

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