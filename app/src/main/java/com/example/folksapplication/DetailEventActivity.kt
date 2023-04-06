package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class DetailEventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_event)

        val backButton = findViewById<ImageView>(R.id.backToHome)
        val daftarVolnteer = findViewById<Button>(R.id.daftarVolunteerButton)

        backButton.setOnClickListener{
            finish()
        }


        daftarVolnteer.setOnClickListener{
            Intent(this, RegistVolunteerActivity::class.java). also{
                startActivity(it)
            }
        }

    }
}