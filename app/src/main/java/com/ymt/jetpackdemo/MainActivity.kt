package com.ymt.jetpackdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ymt.jetpackdemo.base.BaseActivity
import com.ymt.jetpackdemo.databinding.ActivityMainBinding
import com.ymt.jetpackdemo.life.MyObserve
import com.ymt.jetpackdemo.mode.NameViewModel
import com.ymt.jetpackdemo.ui.SupplyActivity
import kotlin.math.log

class MainActivity : BaseActivity<ActivityMainBinding>() {
  private val model:NameViewModel by viewModels()
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    R.layout.activity_main
//    binding = ActivityMainBinding.inflate(layoutInflater)
//    setContentView(binding.root)


//    val sum = sum(9,9)
//    lg(sum.toString())
    val items = listOf("apple","banner","kiwifruit")
//    items.filter { it.startsWith("a") }
//        .forEach { lg(it) }
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
    Log.d("hmmy", msg)
  }
  private fun sum(a:Int,b:Int):Int{
    return a+b
  }

  override fun setViewBinding(): LayoutInflater {
    return  layoutInflater
  }

  override fun initView() {
    Handler(Looper.myLooper()!!).postDelayed(Runnable {
      startActivity(Intent(this,SupplyActivity::class.java))
    },500)
    lifecycle.addObserver(MyObserve())
    binding.show.text = "i am test view binding"
    val nameObserve = Observer<String>{newName->
      binding.show.text = newName
    }
    model.currentName.observe(this,nameObserve)
    binding.btn.setOnClickListener {
//      model.currentName.postValue("i")
      startActivity(Intent(this,SupplyActivity::class.java))
    }

    val person = Person(18, "andy")
    lg("name:${person.name},age:${person.age}")

  }
}