package com.ymt.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val sum = sum(9,9)
    lg(sum.toString())
    val items = listOf("apple","banner","kiwifruit")
    items.filter { it.startsWith("a") }
        .forEach { lg(it) }
//    for (item in items){
//      when(item){
//        "apple"->lg("苹果")
//        "banner"->lg("香蕉")
//      }
//    }
//    for (x in 1..10 step 2){
//      lg(x.toString())
//    }
//    for (y in 9 downTo 0 step 3){
//      lg(y.toString())
//    }
  }
  fun lg(msg:String){
    Log.d("kotlin", msg)
  }
  private fun sum(a:Int,b:Int):Int{
    return a+b
  }
}