package com.finance.application.util

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.finance.application.R

object SessionManager {

    private const val USER_TOKEN = "user_token"


    fun saveAuthToken(context: Context, token: String) {
        saveString(context, USER_TOKEN, token)
    }

    fun getToken(context: Context): String? {
        return getString(context, USER_TOKEN)
    }

    private fun saveString(context: Context, key: String, value: String) {
        val prefs: SharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)
        prefs.edit().putString(key, value).apply()
        Log.d("SessionManager", "Saved string: $key = $value")
    }

    private fun getString(context: Context, key: String): String? {
        val prefs: SharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)
        val value = prefs.getString(key, null)
        Log.d("SessionManager", "Got string: $key = $value")
        return value
    }

    fun clearData(context: Context) {
        val editor = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE).edit()
        editor.clear().apply()
        Log.d("SessionManager", "Cleared all data")
    }
}