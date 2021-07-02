package com.karn.guessmynumber

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var number : Int = 5

    lateinit var questionTextView: TextView
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text_view)
        resultTextView = findViewById(R.id.result_text_view)
        printTheQuestion()
    }

    fun clickDownwardArrow(view: View){

        when (number) {
            5 -> {
                guessTheNumber(3)
            }
            3 -> {
                guessTheNumber(2)
            }
            2 -> {
                guessTheNumber(1)
            }
            8 -> {
                guessTheNumber(7)
            }
            7 -> {
                guessTheNumber(6)
            }
        }

    }
    fun clickSuccess(view: View){
        questionTextView.visibility = View.INVISIBLE
        resultTextView.visibility = View.VISIBLE
        resultTextView.text =String.format(resources.getString(R.string.str_success), number)

    }
    fun clickUpwardArrow(view: View){

        when (number) {
            3 -> {
                guessTheNumber(4)
            }
            5 -> {
                guessTheNumber(8)
            }
            8 -> {
                guessTheNumber(9)
            }
            9 -> {
                guessTheNumber(10)
            }
        }

    }
    fun clickResetButton(view: View){

        resultTextView.visibility = View.INVISIBLE
        questionTextView.visibility = View.VISIBLE
        number = 5
        printTheQuestion()
    }
    private fun printTheQuestion(){
        questionTextView.text =String.format(resources.getString(R.string.str_question), number)
    }
    private fun guessTheNumber(myNumber: Int){
        number = myNumber
        printTheQuestion()
    }

}