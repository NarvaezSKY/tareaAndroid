package com.tucucha.primerapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
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




        initUI()

    }
    private fun initUI() {
        setupExtras()

        setupClickListeners()
    }

    private fun setupExtras(){
        val valor = intent.getStringExtra("clave_valor")
        val textView=binding.usertal
        textView.text=valor
    }

    private fun setupClickListeners() {
        binding.logout.setOnClickListener {

            sharedPref.removeSharedPref("keyUserPref")
            sharedPref.removeSharedPref("myBoolean")

             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)

            finish()
        }
    }

}