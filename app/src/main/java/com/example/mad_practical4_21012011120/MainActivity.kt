package com.example.mad_practical4_21012011120

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton = findViewById<Button>(R.id.Login)
        val signupbutton = findViewById<Button>(R.id.Signup)

        loginbutton.setOnClickListener(){
            Intent(this@MainActivity, LoginActivity::class.java).also { startActivity(it) }
        }

        signupbutton.setOnClickListener(){
            Intent(this@MainActivity, RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}