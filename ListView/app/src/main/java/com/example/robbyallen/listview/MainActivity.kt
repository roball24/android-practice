package com.example.robbyallen.listview

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foods = arrayOf("bacon", "ham", "tuna", "candy", "meatball", "potato")
        val myAdapter = CustomAdapter(this, foods)
        val myListView = findViewById(R.id.myListView) as ListView
        myListView.adapter = myAdapter

        myListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val food = parent.getItemAtPosition(position).toString()
            Toast.makeText(this@MainActivity, food, Toast.LENGTH_LONG).show()
        }
    }
}
