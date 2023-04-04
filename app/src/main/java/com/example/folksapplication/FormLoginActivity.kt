package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val registerForm = findViewById<Button>(R.id.registButton)

        registerForm.setOnClickListener{
            Intent(this, FormRegistActivity::class.java). also{
                startActivity(it)
            }
        }


    }
}