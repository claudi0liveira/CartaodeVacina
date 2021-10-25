package com.cristiano.cartaodevacina

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var btSobre: Button
    private lateinit var btlink: Button
    private lateinit var btCalendario: Button
    private lateinit var btVacinas: Button
    private lateinit var btTipoVacina: Button
    private lateinit var btAgenda: Button
    private lateinit var btLocaliza: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button = findViewById(R.id.button)
        btSobre = findViewById(R.id.btSobre)
        btlink = findViewById(R.id.button5)
        btCalendario = findViewById(R.id.button8)
        btVacinas = findViewById(R.id.button7)
        btTipoVacina = findViewById(R.id.button9)
        btAgenda = findViewById(R.id.button4)
        btLocaliza = findViewById(R.id.button6)

        button.setOnClickListener {
            val intent = Intent(this, VacinacaoActivity::class.java)
            startActivity(intent)
        }
        btCalendario.setOnClickListener {
            val intent = Intent(this, CalendarioActivity::class.java)
            startActivity(intent)
        }
        btVacinas.setOnClickListener {
            val intent = Intent(this, VacinasDisponiveisActivity::class.java)
            startActivity(intent)
        }
        btTipoVacina.setOnClickListener {
            val intent = Intent(this, VacinasActivity::class.java)
            startActivity(intent)
        }
        btAgenda.setOnClickListener {
            val intent = Intent(this, AgendamentoActivity::class.java)
            startActivity(intent)
        }
        btLocaliza.setOnClickListener {
            val intent = Intent(this, LocalizacaoActivity::class.java)
            startActivity(intent)
        }
        btSobre.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }

        btlink.setOnClickListener {

            openIntent()
            showBasicDialog( null)
        }

    }

    private fun showBasicDialog(View: View?) {
        val builder = AlertDialog.Builder(this)
        builder.run {
            setTitle("Atenção!!!")
            setMessage("Você será redirecionado ao site do Governo para ter acesso as campanhas!")
            btlink = findViewById(R.id.button5)
            show()
        }

    }

    private fun openIntent()  {
        val uri : Uri?
        val intent : Intent?


        uri = Uri.parse("https://www.gov.br/saude/pt-br/campanhas-da-saude")
        intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)


    }

}