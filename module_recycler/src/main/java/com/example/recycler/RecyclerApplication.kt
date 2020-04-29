package com.example.recycler

import android.util.Log
import com.example.base.BaseApplication

class RecyclerApplication:BaseApplication() {
    val TAG = "RecyclerApplication"

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"onCreate() -- ");
    }
}