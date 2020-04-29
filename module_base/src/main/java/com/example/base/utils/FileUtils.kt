package com.example.common.utils

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class FileUtils {

    /**
     * 复制Assets目录下的文件到/data/data目录
     * @param context
     * @param assetsName
     */
//    fun copyAssetsfile(context: Context, assetsName: String) {
//        try {
//            if (!File(getPath(context) + "/" + assetsName).exists()) {
//                val `is` = context.resources.assets.open(assetsName)
//                val fos =
//                    FileOutputStream(getPath(context) + "/" + assetsName)
//                val buffer = ByteArray(7168)
//                var count = 0
//                while (`is`.read(buffer).also { count = it } > 0) {
//                    fos.write(buffer, 0, count)
//                }
//                fos.close()
//                `is`.close()
//            }
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//    }

    /**
     * 获取APP当前目录路径
     *
     * Context.getFilesDir()                           :/data/data/com.example/files
     * Context.getCacheDir()                           :/data/data/com.example/cache
     * Context.getExternalCacheDir()                   :/storage/emulated/0/Android/data/com.example/cache
     * Context.getExternalFilesDir()                   :/storage/emulated/0/Android/data/com.example/files
     * Environment.getExternalStorageDirectory()       :/storage/emulated/0
     * Environment.getExternalStoragePublicDirectory() :/storage/emulated/0/
     *
     * @param context
     * @return
     */
    fun getPath(context: Context): String {
        val fileDire = context.applicationContext.filesDir //获取../data/应用的包名/files/ 目录
        val cacheDire = context.applicationContext.cacheDir //获取../data/应用的包名/files/ 目录
        val filePath = fileDire.toString()
        val cachePath = cacheDire.toString() //  /data/user/0/com.example.serial/cache
        val rootpath = filePath.substring(0, filePath.lastIndexOf("/")) //截取掉files   获取../data/应用的包名/
        Log.i("Utils", "filePath = $filePath  \r\n cacheDire = $cachePath\r\n rootpath = $rootpath")
        return cachePath
    }

}