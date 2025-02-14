package com.example.expmdmfebrero.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero4.R
import com.example.expmdmfebrero4.data.Setas

class SetaAdapter(private val setas: List<Setas>) : RecyclerView.Adapter<SetaAdapter.SetaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_setas, parent, false)
        return SetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: SetaViewHolder, position: Int) {
        holder.bind(setas[position])
    }

    override fun getItemCount(): Int = setas.size

    inner class SetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.sticker_image)
        private val nameTextView: TextView = itemView.findViewById(R.id.sticker_name)

        fun bind(seta: Setas) {
            nameTextView.text = seta.name
        }
    }
}