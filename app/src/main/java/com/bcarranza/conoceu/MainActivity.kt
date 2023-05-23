package com.bcarranza.conoceu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartMainMenu = findViewById<Button>(R.id.startButton)

        btnStartMainMenu?.setOnClickListener()
        {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}