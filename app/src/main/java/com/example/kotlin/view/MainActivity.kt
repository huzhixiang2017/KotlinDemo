package com.example.kotlin.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_main.action_but


class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate --1- ")

        action_but.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        //To change body of created functions use File | Settings | File Templates.
        when(view?.id){
            R.id.action_but ->
                ARouter.getInstance().build("/view/RecyclerActivity").navigation()
        }
    }
}
