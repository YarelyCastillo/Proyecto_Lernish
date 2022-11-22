package com.example.pruba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PalatalActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_actividades)
        val botonCerrarSesion: Button?= findViewById(R.id.button3)
        val botonLeer :ImageButton?=findViewById(R.id.imageButtonRead)
        val botonVideo :ImageButton?=findViewById(R.id.imageButtonVideoChat)
        val botonImagen :ImageButton?=findViewById(R.id.imageButton)
        val botonAudio :ImageButton?=findViewById(R.id.imageButtonAudio)
        val botonChat :ImageButton?=findViewById(R.id.imageButtonChat)

        botonCerrarSesion?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        botonLeer?.setOnClickListener {
            startActivity(Intent(this,lernish_read::class.java))
        }
        botonVideo?.setOnClickListener {
            startActivity(Intent(this,lernish_videochat::class.java))
        }
        botonImagen?.setOnClickListener {
            startActivity(Intent(this,lernish_image::class.java))
        }
        botonAudio?.setOnClickListener {
            startActivity(Intent(this,lernish_audio::class.java))
        }
        botonChat?.setOnClickListener {
            startActivity(Intent(this,lernish_chat::class.java))
        }

    }
}