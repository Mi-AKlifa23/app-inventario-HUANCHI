package com.example.app_inventario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {

            val intentNextActivity = Intent(this, InicioActivity::class.java)
            startActivity(intentNextActivity)
        }


        button = findViewById(R.id.button)

        button.setOnClickListener {

            val intentNextActivity = Intent(this, IniciosActivity::class.java)
            startActivity(intentNextActivity)
        }
    }
}