package com.example.robbyallen.boundservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.example.robbyallen.boundservice.MyService.MyLocalBinder

class MainActivity : AppCompatActivity() {

    internal lateinit var timeService: MyService
    internal var isBound: Boolean = false

    fun showTime(view: View) {
        val currentTime = timeService.currentTime
        val timeText = findViewById(R.id.timeText) as TextView
        timeText.text = currentTime
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i = Intent(this, MyService::class.java)
        bindService(i, timeConnection, Context.BIND_AUTO_CREATE)
    }

    private val timeConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            val binder = service as MyLocalBinder
            timeService = binder.service
            isBound = true
        }

        override fun onServiceDisconnected(name: ComponentName) {
            isBound = false
        }
    }
}
