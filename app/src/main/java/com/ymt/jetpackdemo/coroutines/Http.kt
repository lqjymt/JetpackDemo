package com.ymt.jetpackdemo.coroutines

import com.ymt.jetpackdemo.util.Lg
import com.ymt.jetpackdemo.util.lg
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext
import kotlin.coroutines.suspendCoroutine

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/24 16:37
 */
object Http {
  fun go() {
//    runBlocking {  }
//    GlobalScope.launch {  }
    CoroutineScope(Dispatchers.Default).launch {
      withContext(Dispatchers.IO){
        lg("currentThread name${Thread.currentThread().name}")
      }

     val ha=  launch {

      }
      ha.join()
      MainScope().launch {

      }
      val http  =async {
        delay(2000)
        getUser()
      }
      val getName  =async {
        delay(2000)
        getUser()
      }
//      val h =
      val res = http.await()
      lg("ready go res=${res}")
    }
  }

  private fun getUser():String{
    return  "i am back"
  }
}