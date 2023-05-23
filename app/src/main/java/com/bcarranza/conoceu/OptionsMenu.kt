package com.bcarranza.conoceu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.adapter.RecyclerSchool
import com.bcarranza.conoceu.databinding.ActivityMainBinding

class OptionsMenu : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var listSchool:MutableList<School> = mutableListOf()
    private lateinit var recycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        setContentView(R.layout.activity_options_menu)

        setupAdapter()
    }

    private fun setupAdapter()
    {
        val recycler = findViewById<RecyclerView>(R.id.recyclerCampus)
        recycler.layoutManager = LinearLayoutManager(this)



        recycler.adapter = RecyclerSchool(this, listSchool)
    }
}