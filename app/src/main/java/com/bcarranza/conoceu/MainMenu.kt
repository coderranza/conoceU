package com.bcarranza.conoceu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        supportActionBar?.hide()

        val btnFindPlace = findViewById<Button>(R.id.findButton)

        btnFindPlace.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btnFindPlace.setBackgroundResource(R.color.primary_color)
                }
                MotionEvent.ACTION_UP -> {
                    btnFindPlace.setBackgroundResource(R.color.accent_color)
                }
            }
            false
        }

        btnFindPlace?.setOnClickListener()
        {
            val intent = Intent(this, CampusMenu::class.java)
            startActivity(intent)
        }
    }
}