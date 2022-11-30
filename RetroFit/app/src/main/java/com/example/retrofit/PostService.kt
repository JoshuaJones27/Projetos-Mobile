package com.example.retrofit

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PostService {
    @GET("/posts")
    fun getAllPosts(): Call<List<RetroPost>>

    @GET("posts")
    fun getPost(@Query("id") id: String) : Call<List<RetroPost>>
}