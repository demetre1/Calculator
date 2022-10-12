package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val add = intent.getStringExtra("Add")
        val sub = intent.getStringExtra("substract")
        val mult = intent.getStringExtra("multipay")
        val divide = intent.getStringExtra("divide")

        val addition = findViewById<TextView>(R.id.Sum).apply {
           text = add
        }
        val subs = findViewById<TextView>(R.id.substract).apply {
            text = sub

        }
        val multy = findViewById<TextView>(R.id.Multiplay).apply {
            text = mult
        }
        val div = findViewById<TextView>(R.id.Divide).apply {
            text = divide
        }
    }
}