package com.cristiano.cartaodevacina

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AgendaActivity : AppCompatActivity() {

    lateinit var textMensage: TextView
    lateinit var textMensage2: TextView
    lateinit var textMensage3: TextView
    lateinit var textMensage4: TextView
    lateinit var textMensage5: TextView
    lateinit var textMensage6: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        textMensage = findViewById(R.id.textMensage)
        val valor =
            getIntent().getStringExtra("nome")
        textMensage.text = valor
        textMensage2 = findViewById(R.id.textMensage2)
        val cpf = getIntent().getStringExtra("cpf")
        textMensage2.text = cpf
        textMensage3 = findViewById(R.id.textMensage3)
        val sus = getIntent().getStringExtra("sus")
        textMensage3.text = sus
        textMensage4 = findViewById(R.id.textMensage4)
        val posto = getIntent().getStringExtra("posto")
        textMensage4.text = posto
        textMensage5 = findViewById(R.id.textMensage5)
        val data = getIntent().getStringExtra("data")
        textMensage5.text = data
        textMensage6 = findViewById(R.id.textMensage6)
        val hora = getIntent().getStringExtra("hora")
        textMensage3.text = hora

    }
}