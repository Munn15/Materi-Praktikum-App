package com.example.praktikum03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DuaActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        img = findViewById(R.id.img_scan)
        img.setOnClickListener {
            startActivity(Intent(this, semester1::class.java))
        }
    }
}