package com.example.listviews_e_adapters

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val values = mutableListOf<String>("Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS",
            "Ubuntu", "Windows7", "Mac OS X", "Linux", "OS/2", "WindowsMobile", "Blackberry", "WebOS",
            "Ubuntu", "Windows7", "Mac OS X", "Linux", "Android", "iPhone", "WindowsMobile")

        var adapter = MySimpleArrayAdapter(this, R.layout.layout_now, values)

        //var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,values)
        //listView.adapter = adapter
    }
}