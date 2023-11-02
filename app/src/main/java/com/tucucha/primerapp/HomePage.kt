package com.tucucha.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView

import com.tucucha.primerapp.databinding.ActivityMainBinding

class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val valor = intent.getStringExtra("clave_valor")


        val textView=findViewById<TextView>(R.id.user)
        textView.text = "Bienvenido, $valor"
    }
}