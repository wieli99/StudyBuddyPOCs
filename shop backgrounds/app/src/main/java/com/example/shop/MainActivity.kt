package com.example.shop

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button.setOnClickListener{
            setButtonText(button)
        }

        button2.setOnClickListener{
            setButtonText(button2)
        }

        button3.setOnClickListener{
            setButtonText(button3)
        }

        button4.setOnClickListener{
            setButtonText(button4)
        }

        button5.setOnClickListener{
            setButtonText(button5)
        }

        button6.setOnClickListener{
            setButtonText(button6)
        }
    }

    fun setButtonText(btn: Button){
        btn.text = getString(R.string.bought)
    }



}
