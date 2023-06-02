package com.bcarranza.conoceu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.R
import com.bcarranza.conoceu.Place

class RecyclerPlace(private var context: Context, private var placeList:List<Place>):RecyclerView.Adapter<RecyclerPlace.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var labelPlaceName: TextView
        var imagePlace: ImageView

        init {
            labelPlaceName = itemView.findViewById(R.id.textSchool)
            imagePlace = itemView.findViewById(R.id.imageSchool)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.place_button, parent, false)
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var school = placeList[position]
        holder.labelPlaceName.text = context.getString(school.name)
        holder.imagePlace.setImageResource(school.imageId)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
}