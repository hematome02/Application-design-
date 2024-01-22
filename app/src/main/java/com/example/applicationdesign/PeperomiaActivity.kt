package com.example.applicationdesign

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PeperomiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.peperomia_houseplant)
    }

    fun onReverse(view: View) {
        // Créer une intention pour naviguer vers la nouvelle mise en page (PeperomiaActivity)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}