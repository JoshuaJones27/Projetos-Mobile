package com.example.pdmm

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapterRecViewHolder (inflater: LayoutInflater, val parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.activity_layout_item, parent, false)){

        private var tv: TextView? = itemView.findViewById(R.id.layout_item_name_tv)
        private var iv: ImageView? = itemView.findViewById(R.id.layout_item_photo_iv)

        fun bindData(text: String, colorResource: Int) {
            tv?.text = text
            iv?.setBackgroundResource(colorResource)

            itemView.setOnClickListener {
                Toast.makeText(parent.context,text, Toast.LENGTH_SHORT).show()
            }
        }
}