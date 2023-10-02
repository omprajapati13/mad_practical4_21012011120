package com.example.mad_practical4_21012011120

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val loginTxt:TextView= findViewById(R.id.loginText)
        val registerBtn:Button = findViewById(R.id.registerButton)

        loginTxt.setOnClickListener {
            Intent(this@RegistrationActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
        registerBtn.setOnClickListener {

            Toast.makeText(this@RegistrationActivity, "Registered Successfully",Toast.LENGTH_LONG).show()

            Intent(this@RegistrationActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }



    }
}