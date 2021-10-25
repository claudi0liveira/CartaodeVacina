package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

    private lateinit var btCrianca : Button
    private lateinit var btAdolescente : Button
    private lateinit var btAdulto : Button
    private lateinit var btGestante: Button

class CalendarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)

        btCrianca = findViewById(R.id.button2)
        btAdolescente = findViewById(R.id.button3)
        btAdulto = findViewById(R.id.button12)
        btGestante = findViewById(R.id.button13)

        btCrianca.setOnClickListener {
            val intent = Intent(this, CriancaActivity::class.java)
            startActivity(intent)
        }
        btAdolescente.setOnClickListener {
            val intent = Intent(this, AdolescenteActivity::class.java)
            startActivity(intent)
        }
        btAdulto.setOnClickListener {
            val intent = Intent(this, AdultoActivity::class.java)
            startActivity(intent)
        }
        btGestante.setOnClickListener {
            val intent = Intent(this, GestanteActivity::class.java)
            startActivity(intent)
        }
    }
}