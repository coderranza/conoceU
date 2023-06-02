package com.bcarranza.conoceu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.adapter.RecyclerPlace

class OptionsMenu : AppCompatActivity() {

    private var listPlace: MutableList<Place> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_menu)

        supportActionBar?.hide()

        // Get the value from the intent
        val title = intent.getStringExtra("title")

        val tvPlace = findViewById<TextView>(R.id.campusText)

        // Assign value
        tvPlace.text = title

        setupAdapter()
    }

    private fun setupAdapter() {
        val recycler = findViewById<RecyclerView>(R.id.recyclerCampus)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecyclerPlace(this, PlaceProvider.schoolList)
    }
}