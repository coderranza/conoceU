package com.bcarranza.conoceu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.R
import com.bcarranza.conoceu.School

class RecyclerSchool(private var context: Context, private var schoolList:MutableList<School>):RecyclerView.Adapter<RecyclerSchool.MyHolder>() {

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var labelSchoolName: TextView
        var imageSchool: ImageView

        init {
            labelSchoolName = itemView.findViewById(R.id.textSchool)
            imageSchool = itemView.findViewById(R.id.imageSchool)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.place_button, parent, false)
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var school = schoolList[position]
        holder.labelSchoolName.text = context.getString(school.name)
        holder.imageSchool.setImageResource(school.imageId)
    }

    override fun getItemCount(): Int {
        return schoolList.size
    }
}