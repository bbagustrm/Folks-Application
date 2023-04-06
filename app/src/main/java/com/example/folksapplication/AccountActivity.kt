package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val myActivityButton = findViewById<ImageView>(R.id.myActivity)
        val homeScreenButton = findViewById<ImageView>(R.id.homeScreenButton)


        myActivityButton.setOnClickListener {
            Intent(this, ActivityList::class.java).also {
                startActivity(it)
            }
        }


        homeScreenButton.setOnClickListener{
            Intent(this, HomeScreenActivity::class.java). also{
                startActivity(it)
            }
        }

    }
}