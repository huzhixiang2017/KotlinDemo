package com.example.kotlin

import android.util.Log
import com.example.base.BaseApplication

/**
 *
 * 多Module下的Application引用方式
 *  https://blog.csdn.net/weixin_34259232/article/details/86263777
 */
class MainApplication:BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        Log.i("MainApplication"," onCreate() -- ")
        
    }
}