package pt.ipca.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    val welcomeName: TextView by lazy {
        findViewById<TextView>(R.id.home_tv_welcome_name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val name = intent.getStringExtra("name")
        welcomeName.text = name

    }
}