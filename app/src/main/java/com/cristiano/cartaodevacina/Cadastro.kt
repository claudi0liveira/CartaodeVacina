package com.cristiano.cartaodevacina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

                var btCadastrar = findViewById<Button>(R.id.registrar)
        btCadastrar.setOnClickListener {
                    val nomeCom = findViewById<EditText>(R.id.nomeCom)
                    val imagemUsuario = findViewById<EditText>(R.id.imagemUsuario)
                    val endcompleto = findViewById<EditText>(R.id.endcompleto)
                    val numero = findViewById<EditText>(R.id.numero)
                    val cpf = findViewById<EditText>(R.id.cpf)
                    val senha = findViewById<EditText>(R.id.senha)

                    if (nomeCom.text.toString().isEmpty()){
                        Toast.makeText(this, "Verifique se você adicionou um nome", Toast.LENGTH_SHORT).show();
                    }
                    else if (endcompleto.text.toString().isEmpty()){
                        Toast.makeText(this, "Verifique se você adicionou um endereço", Toast.LENGTH_SHORT).show();
                    }
                    else if (numero.text.toString().isEmpty()){
                        Toast.makeText(this, "Verifique se você adicionou um numero", Toast.LENGTH_SHORT).show();
                    }
                    else if (imagemUsuario.text.toString().isEmpty()){
                        Toast.makeText(this, "Verifique se você adicionou uma foto", Toast.LENGTH_SHORT).show();
                    }
                    else if (cpf.text.toString().isEmpty()) {
                        Toast.makeText(this, "Verifique se você adicionou um cpf", Toast.LENGTH_SHORT).show();
                    }
                    else if (senha.text.toString().isEmpty()) {
                        Toast.makeText(this, "Verifique se você adicionou uma senha", Toast.LENGTH_SHORT).show();
                    }
                    else if (senha.text.toString().isNotEmpty()){

                        val mensagem = "Cadastro realizado com sucesso, agora você pode logar em nosso APP e continuar seu cadastro...."
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(applicationContext, mensagem, duration)
                        toast.show()
                    } else {
                        val mensagem = "Por favor, preencha o formulário!"
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(applicationContext, mensagem, duration)
                        toast.show()
                    }

                }

            }

        }