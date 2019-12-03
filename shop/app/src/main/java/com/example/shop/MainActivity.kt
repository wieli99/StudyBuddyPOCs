package com.example.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //backbutton in actionbar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)

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
        btn.text = "purchased"
    }



}
