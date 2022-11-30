package com.example.webservices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doRequest() {
        val client = OkHttpClient()

        val request: Request = Request.Builder().url("https://jsonplaceholder.typicode.com/posts").build()

        client.newCall(request).execute().use { response ->
            val arrayStr = response.body?.string()
            if(arrayStr != null) {
                var listOfPosts = Post.importFromArray(arrayStr)
            }
        }
    }
}