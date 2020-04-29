package com.example.recycler.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.recycler.R

@Route(path = "/view/RecyclerActivity")
class RecyclerActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        Log.i("RecyclerActivity","onCreate --2- ")
    }
}