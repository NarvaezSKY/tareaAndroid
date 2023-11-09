package com.tucucha.primerapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import com.tucucha.primerapp.data.SharedReferenceManager
import com.tucucha.primerapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref: SharedReferenceManager
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(binding.root)
        sharedPref=SharedReferenceManager(this)
        val userSaved=sharedPref.getUser()
        Toast.makeText(this,userSaved,Toast.LENGTH_LONG).show()

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
            sharedPref.saveUser(username)
            sharedPref.saveBoolean()
            startActivity(intent)
        }
    }


    }




