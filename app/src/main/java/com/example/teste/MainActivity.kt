package com.example.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var login: Button
    private lateinit var Email : EditText
    private lateinit var register : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.button_login)
        Email = findViewById(R.id.main_email_ph_et)
        register = findViewById(R.id.button_registar)

        login.setOnClickListener{
            val email = Email.text.toString().trim()

            if (email.isEmpty()){
                Email.error = "Please introduce an email"
            } else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Email.error = "Email not valid"
            }
        }

        register.setOnClickListener{
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }
    }
}