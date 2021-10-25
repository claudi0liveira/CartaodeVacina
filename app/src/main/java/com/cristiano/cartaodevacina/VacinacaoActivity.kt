package com.cristiano.cartaodevacina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

    @SuppressLint("StaticFieldLeak")
    private lateinit var btpfizer : Button
    private lateinit var bth1n1 : Button
class VacinacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacinacao)

        btpfizer = findViewById(R.id.btpfizer)
        bth1n1 = findViewById(R.id.bth1n1)

        btpfizer.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("COMIRNATY - PFIZER")
            builder.setMessage("Data: 29/05/2021 Fabricante: PFIZER Dose: 1ª DOSE lote: EW0199 Cód do Imunizador: 122389425900005 Estabelecimento de Saúde: 7775504 - US 139\n" +
                    "DISTRITO SANITARIO\n" +
                    "VII RECIFE")
            builder.setPositiveButton("OK") { dialog, which ->
                Toast.makeText(this, "Obrigado por consultar", Toast.LENGTH_SHORT).show()
            }
            
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bth1n1.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("INFLUEZA GRIPE - H1N1")
            builder.setMessage("Data: 10/06/2021 Fabricante: Fiocruz Dose: Dose única lote: EW0012 Cód do Imunizador: 122389425900005 Estabelecimento de Saúde: 7775504 - US 135\n" +
                    "DISTRITO SANITARIO\n" +
                    "V RECIFE"
            )
            builder.setPositiveButton("OK") { dialog, which ->
                Toast.makeText(this, "Obrigado por consultar", Toast.LENGTH_SHORT).show()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }

}