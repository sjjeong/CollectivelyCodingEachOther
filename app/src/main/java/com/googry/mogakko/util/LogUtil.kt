package com.googry.mogakko.util

import android.util.Log
import com.googry.mogakko.BuildConfig

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
const val TAG = "Googry"

fun LogE(msg: String) {
    if (BuildConfig.DEBUG) {
        Log.e(TAG, msg)
    }
}