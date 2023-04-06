package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ActivityList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val homeScreenButton = findViewById<ImageView>(R.id.homeScreenButton)
        val accountButton = findViewById<ImageView>(R.id.AccountButton)

        homeScreenButton.setOnClickListener{
            Intent(this, HomeScreenActivity::class.java). also{
                startActivity(it)
            }
        }

        accountButton.setOnClickListener{
            Intent(this, AccountActivity::class.java). also{
                startActivity(it)
            }
        }

    }
}