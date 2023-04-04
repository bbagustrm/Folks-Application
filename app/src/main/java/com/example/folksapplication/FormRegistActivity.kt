package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormRegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_regist)

        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener{
            Intent(this, FormLoginActivity::class.java). also{
                startActivity(it)
            }
        }

    }
}