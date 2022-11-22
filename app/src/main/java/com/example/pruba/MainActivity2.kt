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
        val butonRegistrar: Button? = findViewById(R.id.buttonRegistrar)

        butonRegistrar?.setOnClickListener {
            Log.i("prueba","funcionaa")
            startActivity(Intent(this,PalatalActivities::class.java))
        }
    }
}