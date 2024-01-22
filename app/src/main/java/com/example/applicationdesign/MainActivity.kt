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
    fun onClick(view: View) {
        // Créer une intention pour naviguer vers la nouvelle mise en page (PeperomiaActivity)
        val intent = Intent(this, PeperomiaActivity::class.java)
        startActivity(intent)
    }

}

