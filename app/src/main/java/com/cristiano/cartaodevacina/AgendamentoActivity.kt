package com.cristiano.cartaodevacina

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AgendamentoActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    private lateinit var editTextNome: EditText
    private lateinit var editTextCpf: EditText
    private lateinit var editTextSus: EditText
    private lateinit var editTextPosto: EditText
    private lateinit var editTextDate: EditText
    private lateinit var editTextHur: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendamento)

        btAgenda = findViewById(R.id.button14)
        editTextNome = findViewById(R.id.editTextNome)
        editTextCpf = findViewById(R.id.editTextCpf)
        editTextSus = findViewById(R.id.editTextSus)
        editTextPosto = findViewById(R.id.editTextPosto)
        editTextDate= findViewById(R.id.editTextDate)
        editTextHur = findViewById(R.id.editTextTextHur)


        btAgenda.setOnClickListener(View.OnClickListener (){
            val intent = Intent(this, AgendaActivity::class.java)
            intent.putExtra("nome", editTextNome.getText().toString())
            intent.putExtra("cpf", editTextCpf.getText().toString())
            intent.putExtra("sus", editTextSus.getText().toString())
            intent.putExtra("posto", editTextPosto.getText().toString())
            intent.putExtra("data", editTextDate.getText().toString())
            intent.putExtra("hora", editTextHur.getText().toString())
            startActivity(intent)
            finish()
        })

    }



}

