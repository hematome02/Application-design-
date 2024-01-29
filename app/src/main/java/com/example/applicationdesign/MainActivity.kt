package com.example.applicationdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }
    // fonction pour aller vers la page d'une plante
    fun onClick(view: View) {
        val intent = Intent(this, PeperomiaActivity::class.java)
        startActivity(intent)
    }

}

