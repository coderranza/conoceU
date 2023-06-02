package com.bcarranza.conoceu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class CampusHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campus_home)

        supportActionBar?.hide()

        // Get the value from the intent
        val name = intent.getStringExtra("name")

        val textViewName: TextView = findViewById<TextView>(R.id.tvCampusTitle)
        val btnSchool: Button = findViewById<Button>(R.id.btnSchool)

        // Assign value
        textViewName.text = name

        btnSchool?.setOnClickListener()
        {
            val intent = Intent(this, OptionsMenu::class.java)

            // Send values as parameter
            intent.putExtra("title", "Facultad")

            startActivity(intent)
        }
    }
}