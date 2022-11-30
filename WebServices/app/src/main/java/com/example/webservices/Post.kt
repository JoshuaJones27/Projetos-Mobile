package com.example.webservices

import org.json.JSONArray
import org.json.JSONObject

class Post (userId: String, id: String, title: String, body: String) {

    companion object {
        fun importFromJSON(jsonObject: JSONObject) : Post {
            val userId = jsonObject.getString("userId")
            val id = jsonObject.getString("id")
            val title = jsonObject.getString("title")
            val body = jsonObject.getString("body")

            val post = Post(userId, id, title, body)

            return post
        }

        fun importFromArray(jsonArray: String) : List<Post> {
            val array = JSONArray(jsonArray)
            var list = mutableListOf<Post>()
            for(i in 0 until array.length()) {
                val json = array.getJSONObject(i)
                val post = Post.importFromJSON(json)
                list.add(post)
            }
        }

    }

}