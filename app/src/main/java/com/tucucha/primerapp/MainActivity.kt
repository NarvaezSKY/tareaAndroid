package com.tucucha.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import com.tucucha.primerapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(binding.root)


        initUI()


    }
    //functions

    private fun initUI(){
        buttonConfig2()

    }


    private fun buttonConfig2() {
        binding.button.setOnClickListener {
            val username = binding.username.text.toString()
            val intent = Intent(this, HomePage::class.java)
            intent.putExtra("clave_valor", username)
            startActivity(intent)
        }
    }


    }




