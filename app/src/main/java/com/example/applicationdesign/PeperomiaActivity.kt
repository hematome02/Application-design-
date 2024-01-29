package com.example.applicationdesign

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class PeperomiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.peperomia_houseplant)

        // création d'une variable qui récupere le bouton
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            showAddToGardenDialog()
        }

    }
    private fun showAddToGardenDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(R.layout.popupadd, null)

        dialogBuilder.setView(dialogView)
        dialogBuilder.setTitle("Plant added to the garden")
        dialogBuilder.setMessage("Your plant has been successfully added to the garden!")

        dialogBuilder.setPositiveButton("OK") { dialog, which -> dialog.dismiss()
        }

        val alertDialog = dialogBuilder.create()
        alertDialog.show()
    }

    //fonction pour retourner à la page d'accueil
    fun onReverse(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}