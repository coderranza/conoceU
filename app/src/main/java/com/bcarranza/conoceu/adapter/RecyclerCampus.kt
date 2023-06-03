package com.bcarranza.conoceu.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bcarranza.conoceu.Campus
import com.bcarranza.conoceu.CampusHome
import com.bcarranza.conoceu.CampusProvider.Companion.campusList
import com.bcarranza.conoceu.R

class RecyclerCampus(private var context: Context, private var campusList:List<Campus>):RecyclerView.Adapter<RecyclerCampus.MyHolder>(){

    inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var labelCampusName: TextView
        var labelCampusAddress: TextView
        var cardCampus: CardView

        init
        {
            labelCampusName = itemView.findViewById(R.id.nameCampus)
            labelCampusAddress = itemView.findViewById(R.id.addressCampus)
            cardCampus = itemView.findViewById(R.id.campusCard)

            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val campus = campusList[position]

                    if(campus.isActive)
                    {
                        // Create intent to new activity
                        val intent = Intent(context, CampusHome::class.java)

                        // Send values as parameter
                        intent.putExtra("name", context.getString(campus.name))

                        // Start new activity
                        context.startActivity(intent)

                    }
                    else
                    {
                        Toast.makeText(context,"Campus aun no disponible", Toast.LENGTH_SHORT).show()
                    }
                }
            }
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

        if(campus.isActive) {
            holder.cardCampus.isEnabled = true
            holder.cardCampus.setCardBackgroundColor(ContextCompat.getColor(context, R.color.primary_color))
        }
        else {
            // holder.cardCampus.isEnabled = false
            holder.cardCampus.setCardBackgroundColor(ContextCompat.getColor(context, R.color.divider_color))
        }
    }

    override fun getItemCount(): Int {
        return campusList.size
    }

}