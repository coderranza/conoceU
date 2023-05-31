package com.bcarranza.conoceu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CampusHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campus_home)

        supportActionBar?.hide()

        // Get the value from the intent
        val name = intent.getStringExtra("name")

        val textViewName: TextView = findViewById(R.id.tvCampusTitle)

        // Assign value
        textViewName.text = name
    }
}