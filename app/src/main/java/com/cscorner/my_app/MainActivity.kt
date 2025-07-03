package com.cscorner.my_app

import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val switchWifi = findViewById<Switch>(R.id.wifi)

        switchWifi.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Wi-Fi is ON", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wi-Fi is OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

