package com.londonappbrewery.magiceightball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ask_btn.setOnClickListener {
            val answer = makeDecision()
            eight_ball_iv.setImageResource(answer.id)
        }
    }
}
