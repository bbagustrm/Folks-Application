package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RegistVolunteerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist_volunteer)

        val backButton = findViewById<ImageView>(R.id.backToDetailVolunteer)
        val myActivityButton = findViewById<ImageView>(R.id.myActivity)


        backButton.setOnClickListener {
            finish()
        }

        myActivityButton.setOnClickListener {
            Intent(this, ActivityList::class.java).also {
                startActivity(it)
            }
        }

    }
}