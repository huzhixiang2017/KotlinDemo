package com.example.base.utils

import android.content.Context
import android.content.pm.ApplicationInfo

/**
 *  对象声明（Object Declaration）
    伴生对象（Companion Object）
    对象表达式（Object Expression）
 */
object UIUtils {

    /**
     * 判断当前应用是否是debug状态
     */
     fun isApkInDebug(context: Context): Boolean {
        return try {
            val info: ApplicationInfo = context.getApplicationInfo()
            info.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
        } catch (e: Exception) {
            false
        }
    }


}