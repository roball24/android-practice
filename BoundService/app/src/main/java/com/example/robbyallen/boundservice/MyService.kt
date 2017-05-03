package com.example.robbyallen.boundservice

import android.app.Service
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Binder
import android.os.IBinder

import java.util.Date
import java.util.Locale

class MyService : Service() {
    private val timeBinder = MyLocalBinder()

    override fun onBind(intent: Intent): IBinder? {
        return timeBinder
    }

    val currentTime: String
        get() {
            val df = SimpleDateFormat("HH:mm:ss", Locale.US)
            return df.format(Date())
        }

    inner class MyLocalBinder : Binder() {

        internal val service: MyService
            get() = this@MyService
    }
}
