package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val registButton = findViewById<Button>(R.id.registButton)
        val masukButton = findViewById<Button>(R.id.masukButton)


        registButton.setOnClickListener{
            Intent(this, FormRegistActivity::class.java). also{
                startActivity(it)
            }
        }

        masukButton.setOnClickListener{
            Intent(this, HomeScreenActivity::class.java). also{
                startActivity(it)
            }
        }


    }
}