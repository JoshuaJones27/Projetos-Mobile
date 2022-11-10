package pt.ipca.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val code = 1001

    val email: EditText by lazy {
        findViewById<EditText>(R.id.main_et_email)
    }

    val password: EditText by lazy {
        findViewById<EditText>(R.id.main_et_password)
    }
    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun doLogin(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }

    fun doRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivityForResult(intent, code)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == code && resultCode == RESULT_OK) {
            val emailStr = data?.getStringExtra("email")
            val nameStr = data?.getStringExtra("name")

            email.setText(emailStr)
            name = nameStr ?: "User"
        }

    }
}