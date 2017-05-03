package com.example.robbyallen.gestures

import android.support.v4.view.GestureDetectorCompat
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private var message: TextView? = null
    private var gestureDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.textView) as TextView
        this.gestureDetector = GestureDetectorCompat(this, this)
        gestureDetector!!.setOnDoubleTapListener(this)
    }

    // Gestures
    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        message!!.text = "onSingleTapConfirmed"
        return false
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        message!!.text = "onDoubleTap"
        return false
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        message!!.text = "onDoubleTapEvent"
        return false
    }

    override fun onDown(e: MotionEvent): Boolean {
        message!!.text = "onDown"
        return false
    }

    override fun onShowPress(e: MotionEvent) {
        message!!.text = "onShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        message!!.text = "onSingleTapUp"
        return false
    }

    override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
        message!!.text = "onScroll"
        return false
    }

    override fun onLongPress(e: MotionEvent) {
        message!!.text = "onLongPress"
    }

    override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        message!!.text = "onFling"
        return false
    }
    // End Gestures


    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gestureDetector!!.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}
