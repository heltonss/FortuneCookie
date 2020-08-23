package com.example.fortunecookie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMessage()

        btOpenCookie0.setOnClickListener {
            showMessage()
        }
    }

    private fun showMessage() {
        val messages = resources.getStringArray(R.array.messages_of_lucky)
        val numberMessage = Random.nextInt(messages.size)
        val message = messages[numberMessage]

        tvMessageOfLucky.text = message
    }

}