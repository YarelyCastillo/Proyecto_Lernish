package com.example.pruba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class PalatalInitio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)

        val buton4: Button? = findViewById(R.id.button4)
        buton4?.setOnClickListener {
            Log.i("cosa","listo")
            startActivity((Intent(this,PalatalActivities::class.java)))
        }
    }
}