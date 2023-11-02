package com.tucucha.primerapp.data

import android.content.Context
import android.content.SharedPreferences

class SharedReferenceManager(private var context:Context){
    private val name_database="MY_DATA_BASE"

    private val sharedPreferences:SharedPreferences by lazy {
        context.getSharedPreferences(name_database, Context.MODE_PRIVATE)
    }


    fun saveUser (user:String){
        val editor=sharedPreferences.edit()
        editor.putString("keyUserPref", user)
        editor.apply()

    }
    fun getUser ():String{
        return sharedPreferences.getString("keyUserPref","Empty").toString()
    }
}