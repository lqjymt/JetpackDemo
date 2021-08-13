package com.ymt.jetpackdemo.util

import android.util.Log

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/5/21 15:30
 */
object  Lg {
  fun d(msg:String){
    Log.d("kotlin", msg)
  }
  fun e(tag :String="hmmy",msg:String){
    Log.e(tag, msg)
  }
}