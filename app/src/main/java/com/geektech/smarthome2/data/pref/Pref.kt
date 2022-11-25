package com.geektech.smarthome2.data.pref

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class Pref(context: Context) {
    private val pref:SharedPreferences = context.getSharedPreferences("pref", MODE_PRIVATE)

    fun saveShow(value : Boolean){
        pref.edit().putBoolean(PREF_ON_BOARDING, value).apply()
    }

    fun checkShow():Boolean{
        return pref.getBoolean(PREF_ON_BOARDING, false)
    }

    companion object {
        private const val PREF_ON_BOARDING = "show.on.boaring"
    }
}