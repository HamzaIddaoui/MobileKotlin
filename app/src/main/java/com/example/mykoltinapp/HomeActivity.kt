package com.example.mykoltinapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// HomeActivity.kt
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val top10Button = findViewById<Button>(R.id.top10Button)

        top10Button.setOnClickListener {
            // Start the activity for top 10 tracks
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}
