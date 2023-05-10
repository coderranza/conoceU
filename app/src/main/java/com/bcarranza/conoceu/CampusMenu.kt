package com.bcarranza.conoceu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.adapter.RecyclerCampus
import com.bcarranza.conoceu.databinding.ActivityMainBinding

class CampusMenu : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var listCampus:MutableList<Campus> = mutableListOf()
    private lateinit var recycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_campus_menu)

        setupAdapter()

    }

    private fun setupAdapter()
    {
        val recycler = findViewById<RecyclerView>(R.id.recyclerCampus)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecyclerCampus(this, listCampus)

    }
}