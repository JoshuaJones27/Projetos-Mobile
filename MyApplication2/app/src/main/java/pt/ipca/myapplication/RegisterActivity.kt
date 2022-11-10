package pt.ipca.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    val name: EditText by lazy {
        findViewById<EditText>(R.id.main_et_email)
    }

    val email: EditText by lazy {
        findViewById<EditText>(R.id.main_et_email)
    }

    val password: EditText by lazy {
        findViewById<EditText>(R.id.main_et_email)
    }

    val confirmPassword: EditText by lazy {
        findViewById<EditText>(R.id.main_et_email)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun doRegister(view: View) {
        val intent = Intent()
        intent.putExtra("email", email.text.toString())
        intent.putExtra("password", password.text.toString())
        intent.putExtra("name", name.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}