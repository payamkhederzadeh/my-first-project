package com.example.gitandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        android.widget.Toast.makeText(this, "salam", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show()
    }
}