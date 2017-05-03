package com.example.robbyallen.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by robbyallen on 5/2/17.
 */

class CustomAdapter internal constructor(context: Context, foods: Array<String>) : ArrayAdapter<String>(context, R.layout.custom_row, foods) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val myInflater = LayoutInflater.from(context)
        val customView = myInflater.inflate(R.layout.custom_row, parent, false)

        val singleFoodItem = getItem(position)!!.toString()
        val myText = customView.findViewById(R.id.rowText) as TextView
        val myImage = customView.findViewById(R.id.rowImage) as ImageView

        myText.text = singleFoodItem
        myImage.setImageResource(R.drawable.download)

        return customView
    }
}
