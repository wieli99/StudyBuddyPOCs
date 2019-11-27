package com.example.chronometerpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button
import android.widget.Chronometer
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var reachedZero: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPause =  findViewById<Button>(R.id.PauseButton)
        val btnStart =  findViewById<Button>(R.id.StartButton)



        var lastPause: Long = SystemClock.elapsedRealtime()
        var isPaused: Boolean = false
        var timer = findViewById<Chronometer>(R.id.simpleChronometer)

        timer.setCountDown(true)

        btnStart.setOnClickListener{
            val timeMilliSeconds = findViewById<EditText>(R.id.TimeText).getText().toString().toLong() * 1000
            timer.setBase(SystemClock.elapsedRealtime() + timeMilliSeconds)
            timer.start()
            btnStart.setText("Restart")
        }

        btnPause.setOnClickListener{
            if (!isPaused) {
                lastPause = SystemClock.elapsedRealtime()
                timer.stop()
                isPaused = true
                btnPause.setText("Resume")
            } else if (!reachedZero) {
                timer.setBase(timer.getBase() + SystemClock.elapsedRealtime() - lastPause);
                isPaused = false
                timer.start();
                btnPause.setText("Pause")
            }
        }

        timer.setOnChronometerTickListener {testZero(timer, lastPause, btnStart)}
    }

    fun testZero(timer: Chronometer, lastPause: Long, btnStart: Button){
        Log.i("timeLeft", (timer.getBase() - SystemClock.elapsedRealtime()).toString())
        if (timer.getBase() - SystemClock.elapsedRealtime() <= 0){
            reachedZero = true
            timer.stop()
            btnStart.setText("Start")
        }
    }
}


