package com.ib.a1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etFirstName : EditText = findViewById(R.id.etFirstName)
        val etLastName : EditText = findViewById(R.id.etLastName)
        val etEmail : EditText = findViewById(R.id.etEmail)
        val etConfirmEmail : EditText = findViewById(R.id.etConfirmEmail)
        val etPassword : EditText = findViewById(R.id.etPassword)
        val etConfirmPassword : EditText = findViewById(R.id.etConfirmPassword)

        val btnRegister : Button = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {

            val firstName : String = etFirstName.text.toString().trim()
            val email : String = etEmail.text.toString().trim()
            val email2 : String = etConfirmEmail.text.toString().trim()
            val password : String = etPassword.text.toString().trim()
            val password2 : String = etConfirmPassword.text.toString().trim()

            if (firstName.isNotEmpty() && email.isNotEmpty() && email2.isNotEmpty() &&
                password.isNotEmpty() && password.isNotEmpty()) {
                if(email == email2) {
                    if (password == password2){
                        val openThankYouActivityIntent =
                            Intent(applicationContext, ThankYouActivity::class.java)
                        openThankYouActivityIntent.putExtra("firstName",
                            etFirstName.text.toString().trim())
                        startActivity(openThankYouActivityIntent)
                    }
                    else {
                        Toast.makeText(applicationContext,"Passwords don't match!",
                            Toast.LENGTH_SHORT).show()
                    }
                }
                else {
                    Toast.makeText(applicationContext, "Emails don't match!",
                        Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(applicationContext, "Please fill in all required fields",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}