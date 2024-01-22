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

        // Référence du bouton
        val button1 = findViewById<Button>(R.id.button1)

        // Ajouter un écouteur de clic au bouton
        button1.setOnClickListener {
            showAddToGardenDialog()
        }

    }
    private fun showAddToGardenDialog() {
        // Créer une boîte de dialogue
        val dialogBuilder = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(R.layout.popupadd, null)

        // Configurer le contenu de la boîte de dialogue
        dialogBuilder.setView(dialogView)
        dialogBuilder.setTitle("Plant added to the garden")
        dialogBuilder.setMessage("Your plant has been successfully added to the garden!")

        // Ajouter un bouton "OK" à la boîte de dialogue
        dialogBuilder.setPositiveButton("OK") { dialog, which ->
            // Vous pouvez ajouter des actions supplémentaires ici si nécessaire
            dialog.dismiss()
        }

        // Afficher la boîte de dialogue
        val alertDialog = dialogBuilder.create()
        alertDialog.show()
    }

    fun onReverse(view: View) {
        // Créer une intention pour naviguer vers la nouvelle mise en page (PeperomiaActivity)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}