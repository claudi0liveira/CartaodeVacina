package com.cristiano.cartaodevacina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button

class SobreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        var btlink = findViewById<Button>(R.id.btLink)
        btlink.setOnClickListener {

            openIntent()
        }
    }

    private fun openIntent() {
        val uri: Uri?
        val intent: Intent?

        uri = Uri.parse("https://wa.me/5581997115826")
        intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)


    }
}
