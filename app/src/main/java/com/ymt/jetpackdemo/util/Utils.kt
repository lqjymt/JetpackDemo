package com.ymt.jetpackdemo.util

import android.util.Log
import android.widget.Toast
import com.ymt.jetpackdemo.app.App

/**
 * 描述：
 *
 * @author CoderPig on 2018/04/12 12:14.
 */
fun shortToast(msg: String) = Toast.makeText(App.instance, msg, Toast.LENGTH_SHORT).show()

fun longToast(msg: String) = Toast.makeText(App.instance, msg, Toast.LENGTH_LONG).show()

fun lg(msg: String) = Log.d("kotlin", msg)