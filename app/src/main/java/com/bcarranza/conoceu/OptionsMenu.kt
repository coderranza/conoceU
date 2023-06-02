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
    private var isSchool: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_menu)

        supportActionBar?.hide()

        // Get the value from the intent
        val title: String? = intent.getStringExtra("title")
        isSchool = intent.getBooleanExtra("list", true)

        val tvPlace = findViewById<TextView>(R.id.campusText)

        // Assign value
        tvPlace.text = title

        setupAdapter()
    }

    private fun setupAdapter() {
        val recycler = findViewById<RecyclerView>(R.id.recyclerCampus)
        recycler.layoutManager = LinearLayoutManager(this)

        if(isSchool)
        {
            recycler.adapter = RecyclerPlace(this, PlaceProvider.schoolList)
        }
        else
        {
            recycler.adapter = RecyclerPlace(this, PlaceProvider.placeList)
        }
    }
}