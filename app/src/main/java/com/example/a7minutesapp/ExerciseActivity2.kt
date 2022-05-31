package com.example.a7minutesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercise2.*

class ExerciseActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise2)

        setSupportActionBar(exercise_toolbar)
        val actionbar = supportActionBar
        if (actionbar != null){
            actionbar.setDisplayHomeAsUpEnabled(true)
        }
        exercise_toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}