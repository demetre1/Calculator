package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    lateinit var firstNum: EditText
    lateinit var secondNum: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var multipay: Button
    lateinit var div: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstNum = findViewById(R.id.FirstNum)
        secondNum = findViewById(R.id.SecondNum)
        add = findViewById(R.id.buttonAdd)
        sub = findViewById(R.id.buttonSubstract)
        multipay = findViewById(R.id.buttonMultiplay)
        div = findViewById(R.id.buttonDivide)


        add.setOnClickListener{
            add()

        }

        sub.setOnClickListener{

            Substract()

        }

        multipay.setOnClickListener{
            multiplay()

        }
        div.setOnClickListener{
            divide()

        }

    }

    private fun add(){
        val first = firstNum.text.toString().toInt()
        val second = secondNum.text.toString().toInt()
        val Add = (first + second).toString()

        val intent = Intent(this,MainActivity2::class.java).also {
            it.putExtra("Add",Add)
            startActivity(it)
        }
    }

    private fun Substract(){
        val first = firstNum.text.toString().toInt()
        val second = secondNum.text.toString().toInt()
        val substract = (first - second).toString()

        val intent = Intent(this,MainActivity2::class.java).also {
            it.putExtra("substract",substract)
            startActivity(it)
        }
    }
    private fun multiplay(){
        val first = firstNum.text.toString().toInt()
        val second = secondNum.text.toString().toInt()
        val multipay = (first * second).toString()
        val intent = Intent(this,MainActivity2::class.java).also {
            it.putExtra("multipay",multipay)
            startActivity(it)
        }
    }

    private fun divide(){
        val first = firstNum.text.toString().toInt()
        val second = secondNum.text.toString().toInt()
        val divide = (first / second).toString()
        val intent = Intent(this,MainActivity2::class.java).also {
            it.putExtra("divide",divide)
            startActivity(it)
        }
    }



}
