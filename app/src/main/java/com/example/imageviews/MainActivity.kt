package com.example.imageviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView)
        val  button1 = findViewById<Button>(R.id.firstButton)
        val  button2 = findViewById<Button>(R.id.secondButton)

        button1.setOnClickListener {
            image.setImageResource(R.drawable.first)

        }
        button2.setOnClickListener {
            image.setImageResource(R.drawable.second)
        }

    }
}