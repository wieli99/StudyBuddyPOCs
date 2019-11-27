package com.example.characterpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var evolutionState = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studyBuddy = findViewById<ImageView>(R.id.StudyBuddy)
        studyBuddy.setOnClickListener{
            changeCharacter(studyBuddy)
        }
    }

    fun changeCharacter(studyBuddy: ImageView){
        if (evolutionState == 0) {
            studyBuddy.setImageResource(R.drawable.studybuddy2)
            evolutionState = 1
        } else if (evolutionState == 1){
            studyBuddy.setImageResource(R.drawable.studybuddy1)
            evolutionState = 0
        }

    }
}
