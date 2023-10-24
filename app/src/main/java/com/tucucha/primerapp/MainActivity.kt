package com.tucucha.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button=findViewById(R.id.button)
        btn.setOnClickListener{
            val intent:Intent=Intent(this, HomePage::class.java)
            startActivity(intent)
            Toast.makeText(this, "Ingresaste uvu", 1000).show();
        }
    }
}