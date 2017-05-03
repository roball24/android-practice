package com.example.robbyallen.eventlisteners

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.button) as Button

        btn.setOnClickListener {
            val text = findViewById(R.id.textView) as TextView
            text.text = "Button Clicked!"
        }

        btn.setOnLongClickListener {
            val text = findViewById(R.id.textView) as TextView
            text.text = "LongClick"
            true
        }
    }
}
