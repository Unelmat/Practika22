package com.example.practika22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Base_Theme_Practika22)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}