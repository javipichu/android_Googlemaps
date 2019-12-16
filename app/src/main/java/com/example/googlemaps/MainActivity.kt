package com.example.googlemaps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maps.setOnClickListener {

            // Creamos la Uri desde un String. Usamos el resultado para crear un intent
            val gmmIntentUri = Uri.parse("geo:42.2154941,-8.8120584");

            // Creamos el intent desde gmmIntentUri. Hacemos el set de la accion como  ACTION_VIEW
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)

            // Hacemos el instento explicito con la aplicacion de maps
            mapIntent.setPackage("com.google.android.apps.maps")

            // Comenzamos la axtividad con la variable de tipo intent mapIntent
            startActivity(mapIntent)

        }
    }
}
