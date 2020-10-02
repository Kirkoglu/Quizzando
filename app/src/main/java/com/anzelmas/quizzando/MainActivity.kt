package com.anzelmas.quizzando

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        start_game_button.setOnClickListener {
            if(name_textView.text.toString().isEmpty()) {
                Toast.makeText(this, "Please insert your name", Toast.LENGTH_SHORT).show()
            } else {
                //With help of the intent redirect from one activity to another
                intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, name_textView.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}