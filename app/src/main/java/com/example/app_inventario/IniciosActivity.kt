package com.example.app_inventario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IniciosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicios)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val regresoCrear = findViewById<Button>(R.id.regresoCrear)
        val forgotPasswordTextView = findViewById<TextView>(R.id.forgotPasswordTextView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.inici)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        forgotPasswordTextView.setOnClickListener {
            val intentNextActivity = Intent(this, ContraActivity::class.java)
            startActivity(intentNextActivity)
        }

        regresoCrear.setOnClickListener {
            val intentNextActivity = Intent(this, InicioActivity::class.java)
            startActivity(intentNextActivity)
        }

        loginButton.setOnClickListener {
            if (emailEditText.text.toString().trim() == "admin" && passwordEditText.text.toString().trim() == "123456")
            {
                val intentNextActivity =Intent(this, MenuActivity::class.java)
                startActivity(intentNextActivity)
            }
            else{
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show()
            }

        }

    }
}