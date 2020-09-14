package com.id6130201483.lab07

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val item: List<Student>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent,false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID.text = "ID : "+item[position].id
        holder.tvName.text = "Name : "+item[position].name
        holder.tvAge.text = "Age : "+item[position].age.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}