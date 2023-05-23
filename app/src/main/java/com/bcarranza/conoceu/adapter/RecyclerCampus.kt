package com.bcarranza.conoceu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.Campus
import com.bcarranza.conoceu.R

class RecyclerCampus(private var context: Context, private var campusList:MutableList<Campus>):RecyclerView.Adapter<RecyclerCampus.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var labelCampusName: TextView
        var labelCampusAddress: TextView

        init
        {
            labelCampusName = itemView.findViewById(R.id.nameCampus)
            labelCampusAddress = itemView.findViewById(R.id.addressCampus)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.campus_button, parent, false)
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val campus = campusList[position]
        holder.labelCampusName.text = context.getString(campus.name)
        holder.labelCampusAddress.text = context.getString(campus.address)
    }

    override fun getItemCount(): Int {
        return campusList.size
    }
}