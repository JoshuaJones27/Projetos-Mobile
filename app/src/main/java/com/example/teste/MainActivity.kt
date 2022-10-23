package com.example.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginClick(v: View) {
        val bemvindoActivity : Intent = Intent(this, BemVindo::class.java)
        startActivity(bemvindoActivity)
    }

    fun registerClick(v: View) {
        val registerActivity : Intent = Intent(this, EcraRegisto::class.java)
        startActivity(registerActivity)
    }
}