package com.example.listviews_e_adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MySimpleArrayAdapter(context: Context, resource: Int, objects: MutableList<String>):
    ArrayAdapter<String>(context, resource, objects) {

    var mContext: Context
    var mValues: MutableList<String>
    var mResource: Int

    init {
        mContext = context
        mValues = objects
        mResource = resource
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view : View
        val vh: MyViewHolder
        val inflater = LayoutInflater.from(mContext)
        val rowView = inflater.inflate(mResource, parent, false)

        val textView = rowView.findViewById<TextView>(R.id.layout_now_tv)

        val value = mValues[position]

        textView.text = value

        if(convertView != null)
        {
            return convertView
        }
        else   {
            view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent, false)
            view.tag = MyViewHolder(view)
        }

        vh = view.tag as MyViewHolder

        vh.tv?.text = getItem(position)
        vh.iv?.setBackgroundResource(color)

        return rowView
    }

    private class MyViewHolder(view: View?) {
        val iv = view?.findViewById<ImageView>(R.id.layout_item_photo_iv)
        val tv = view?.findViewById<TextView>(R.id.layout_item_name_tv)
    }
}