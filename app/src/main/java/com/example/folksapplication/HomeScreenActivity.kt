package com.example.folksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val eventList1 = findViewById<LinearLayout>(R.id.eventList1)
        val myActivityButton = findViewById<ImageView>(R.id.myActivity)
        val accountButton = findViewById<ImageButton>(R.id.AccountButton)

        eventList1.setOnClickListener{
            Intent(this, DetailEventActivity::class.java). also{
                startActivity(it)
            }
        }

        myActivityButton.setOnClickListener{
            Intent(this, ActivityList::class.java). also{
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