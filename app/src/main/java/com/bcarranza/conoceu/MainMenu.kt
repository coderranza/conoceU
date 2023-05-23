package com.bcarranza.conoceu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        supportActionBar?.hide()

        val btnFindPlace = findViewById<Button>(R.id.findButton)

        btnFindPlace?.setOnClickListener()
        {
            val intent = Intent(this, CampusMenu::class.java)
            startActivity(intent)
        }
    }
}