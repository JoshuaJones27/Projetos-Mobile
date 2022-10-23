package com.example.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class EcraRegisto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_registo)
    }

    fun registerClick(v: View) {

        val emailEditText : EditText = findViewById(R.id.register_email_ph_et)
        val passwordEditText : EditText = findViewById(R.id.register_password_ph_et)
        val confPasswordEditText : EditText = findViewById(R.id.register_confirm_password_ph_et)

        val email : String = emailEditText.text.toString()
        val password : String = passwordEditText.text.toString()
        val confPassword : String = confPasswordEditText.text.toString()

        val emailRegExp = Regex("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}\$")
        val passwordRegExp = Regex("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}\$")

        if(email.isBlank() || !emailRegExp.matches(email)) {
            val error = Toast.makeText(this, "Invalid email.", Toast.LENGTH_LONG)
            error.show()
            return
        }

        if (password.isBlank() || !passwordRegExp.matches(password)) {
            val error = Toast.makeText(this, "Invalid password.", Toast.LENGTH_LONG)
            error.show()
            return
        }

        if(password != confPassword) {
            val error = Toast.makeText(this, "Passwords are different.", Toast.LENGTH_LONG)
            error.show()
            return
        }

        val mainActivity : Intent = Intent(this, MainActivity::class.java)
        startActivity(mainActivity)
    }


}