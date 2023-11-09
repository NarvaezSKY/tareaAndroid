package com.tucucha.primerapp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tucucha.primerapp.R
import com.tucucha.primerapp.data.SharedReferenceManager

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 800
    private lateinit var sharedPref:SharedReferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        sharedPref=SharedReferenceManager(this)

        initUI();
    }

    private fun initUI(){

        setupSharedPrefs2()
    }

    private fun setupSplash(){
        Handler().postDelayed({

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }
    private fun setupSharedPrefs(){
        val userLogged = sharedPref.getUserIsLogged()
        Toast.makeText(this, "$userLogged", Toast.LENGTH_SHORT).show()
        if (userLogged){
            Handler().postDelayed({

                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_TIME_OUT.toLong())
        }else{
            Handler().postDelayed({

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_TIME_OUT.toLong())
        }

    }


    private fun setupSharedPrefs2() {
        val userLogged = sharedPref.getUserIsLogged()
        Toast.makeText(this, "$userLogged", Toast.LENGTH_SHORT).show()
        if (userLogged) {
            setupValidation(HomePage::class.java)
        } else {
            setupValidation(MainActivity::class.java)
        }
    }

    private fun setupValidation(ui: Class<out Activity>) {
        Handler().postDelayed({
            val intent = Intent(this, ui)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

}
