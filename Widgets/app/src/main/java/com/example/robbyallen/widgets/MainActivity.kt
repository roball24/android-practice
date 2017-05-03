package com.example.robbyallen.widgets

import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Layout
        val rl = RelativeLayout(this)
        rl.setBackgroundColor(Color.GREEN)

        // Button
        val redButton = Button(this)
        redButton.text = "Click me"
        redButton.setBackgroundColor(Color.RED)
        redButton.id = 1

        // Username Input
        val username = EditText(this)
        username.id = 2

        // layouts
        val buttonLayout = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        )

        val usernameLayout = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        )

        // layout rules
        buttonLayout.addRule(RelativeLayout.CENTER_HORIZONTAL)
        buttonLayout.addRule(RelativeLayout.CENTER_VERTICAL)

        usernameLayout.addRule(RelativeLayout.ABOVE, redButton.id)
        usernameLayout.addRule(RelativeLayout.CENTER_HORIZONTAL)
        usernameLayout.setMargins(0, 0, 0, 50)

        val r = resources
        val px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200f,
                r.displayMetrics).toInt()
        username.width = px

        // adding views
        rl.addView(redButton, buttonLayout)
        rl.addView(username, usernameLayout)
        setContentView(rl)
    }
}
