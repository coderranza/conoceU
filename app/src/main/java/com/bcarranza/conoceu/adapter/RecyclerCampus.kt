package com.bcarranza.conoceu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.Campus
import com.bcarranza.conoceu.R

class RecyclerCampus(var context: Context, var campusList:MutableList<Campus>):RecyclerView.Adapter<RecyclerCampus.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        lateinit var labelCampusName: TextView
        lateinit var labelCampusAddress: TextView

        init
        {
            labelCampusName = itemView.findViewById(R.id.nameCampus)
            labelCampusAddress = itemView.findViewById(R.id.addressCampus)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.campus_button, parent, false)
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var campus = campusList[position]
        holder.labelCampusName.text = campus.name
        holder.labelCampusAddress.text = campus.address
    }

    override fun getItemCount(): Int {
        return campusList.size
    }
}