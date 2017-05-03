package com.example.robbyallen.kotlinfragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), InputFragment.InputFragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun submitInput(value: String) {
        Log.d("RobLog", value)
    }
}
