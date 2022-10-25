package com.example.teste

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var email : String? = null
    var password : String? = null

    val emailEditText : EditText = findViewById(R.id.login_email_ph_et)
    val passwordEditText : EditText = findViewById(R.id.login_password_ph_et)

    val email : String = emailEditText.text.toString()
    val password : String = passwordEditText.text.toString()


    fun start()
    {
        val intent = Intent(this@MainActivity, EcraRegisto::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1)
        {
            if (resultCode == Activity.RESULT_OK)
            {
                email = data?.getStringExtra("email")
                password = data?.getStringExtra("password")
            }
        }
    }

    fun loginClick(v: View) {
        val bemvindoActivity : Intent = Intent(this, BemVindo::class.java)
        startActivity(bemvindoActivity)
    }

    fun registerClick(v: View) {
        start()
        //val registerActivity : Intent = Intent(this, EcraRegisto::class.java)
        //startActivity(registerActivity)
    }
}