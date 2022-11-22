package com.example.pruba

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val botonRegistrar: Button? = findViewById(R.id.buttonRegistrar)

        botonRegistrar?.setOnClickListener{
            Log.i("mensaje","Hola Mundo")
            startActivity(Intent(this,PalatalActivities::class.java))
        }
    }
}