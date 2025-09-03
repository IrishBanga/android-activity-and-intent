package com.ib.a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThankYouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thank_you)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvMessage : TextView = findViewById(R.id.tvMessage)
        val firstNameReceived :String? = intent.getStringExtra("firstName")
        tvMessage.text = getString(R.string.thank_you_message, firstNameReceived)

        val btnGoToHomepage : Button = findViewById(R.id.btnGoToHomepageFromThankYouActivity)

        btnGoToHomepage.setOnClickListener {
            val openRegistrationActivityIntent =
                Intent(applicationContext, RegistrationActivity::class.java)
            startActivity(openRegistrationActivityIntent)
        }
    }
}