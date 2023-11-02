package com.tucucha.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.Toast
import com.tucucha.primerapp.data.SharedReferenceManager
import com.tucucha.primerapp.databinding.ActivityHomePageBinding



class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    private lateinit var sharedPref:SharedReferenceManager
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityHomePageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        sharedPref= SharedReferenceManager(this)


        val valor = intent.getStringExtra("clave_valor")

        val textView=binding.usertal
        textView.text=valor

        //val textView=binding.user

        //textView.text = "Bienvenido, $valor"
    }

}