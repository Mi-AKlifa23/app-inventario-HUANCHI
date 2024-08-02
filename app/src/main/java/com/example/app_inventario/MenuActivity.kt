package com.example.app_inventario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {

    private lateinit var btnInventario: Button
    private lateinit var btnGestion: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnInventario = findViewById(R.id.btnInventario)

        btnInventario.setOnClickListener {
            val intentNextActivity = Intent(this, InventarioActivity::class.java)
            startActivity(intentNextActivity)
        }

        btnGestion = findViewById(R.id.btnGestion)

        btnGestion.setOnClickListener {
            val intentNextActivity = Intent(this, GestionActivity::class.java)
            startActivity(intentNextActivity)
        }
    }
}