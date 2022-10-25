package com.example.pruba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1: Button? = findViewById(R.id.button6)
        val boton2: Button? = findViewById(R.id.button5)

        boton1?.setOnClickListener{
            Log.i("mensaje","Hola Mundo")
            startActivity(Intent(this,PalatalInitio::class.java))
        }

        boton2?.setOnClickListener {
            Log.i("listo","Holi")
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}