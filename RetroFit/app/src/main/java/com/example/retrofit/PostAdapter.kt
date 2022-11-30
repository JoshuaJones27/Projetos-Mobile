package com.example.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class PostAdapter (context: Context, resource: Int, objects: MutableList<RetroPost>) :
    ArrayAdapter<RetroPost>(context, resource, objects) {

    var mContext: Context
    var mValues: MutableList<RetroPost>
    var mResource: Int

    init {
        mContext = context
        mValues = objects
        mResource = resource
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val vh: MyViewHolder
        val infalter = LayoutInflater.from(mContext)
        val rowView = inflater.inflate(mResource, parent, false)

    }

}