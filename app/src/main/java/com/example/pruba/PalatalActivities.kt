package com.example.pruba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PalatalActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_actividades)
        val boton_read: Button? = findViewById(R.id.imageButtonRead)
        val boton_videochat: Button? = findViewById(R.id.imageButtonVideoChat)
        val boton_images: Button? = findViewById(R.id.imageButtonImages)
        val boton_audio: Button? = findViewById(R.id.imageButtonAudio)
        val boton_video: Button? = findViewById(R.id.imageButtonVideo)
        val boton_chat: Button? = findViewById(R.id.imageButtonChat)



        boton_read?.setOnClickListener {
            startActivity(Intent(this,lernish_read::class.java))
        }

        boton_videochat?.setOnClickListener {
            startActivity(Intent(this,lernish_videochat::class.java))
        }

        boton_images?.setOnClickListener {
            startActivity(Intent(this,lernish_image::class.java))
        }

        boton_audio?.setOnClickListener {
            startActivity(Intent(this,lernish_audio::class.java))
        }

        boton_video?.setOnClickListener {
            startActivity(Intent(this,lernish_videochat::class.java))
        }

        boton_chat?.setOnClickListener {
            startActivity(Intent(this,lernish_chat::class.java))
        }
    }
}