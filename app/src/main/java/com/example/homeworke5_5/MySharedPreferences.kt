package com.example.homeworke5_5

import android.content.SharedPreferences
import javax.inject.Inject

class MySharedPreferences @Inject constructor(private  val preferences: SharedPreferences) {


    fun isShow(): Boolean {
        return preferences.getBoolean(SHOWED_KEY, false)
    }


    fun onShowed() {
        preferences.edit().putBoolean(SHOWED_KEY, true).apply()
    }

    companion object {
        const val PREF_NAME = "pref.name"
        const val SHOWED_KEY = "showed.key"
    }
}
