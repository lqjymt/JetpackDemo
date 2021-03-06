package com.ymt.jetpackdemo.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.ymt.jetpackdemo.R
import com.ymt.jetpackdemo.databinding.ActivityBaseBinding
import java.lang.reflect.ParameterizedType

/**
* Copyright (C), 2015-2020, 华苗木云有限公司
* @author : lqj
* Date : 2021/7/23 :16:12
*/
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

  lateinit var binding:VB
  @Suppress("UNCHECKED_CAST")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    //利用反射，调用指定ViewBinding中的inflate方法填充视图
    val type = javaClass.genericSuperclass
    if (type is ParameterizedType) {
      val clazz = type.actualTypeArguments[0] as Class<VB>
      val method = clazz.getMethod("inflate", LayoutInflater::class.java)
      binding = method.invoke(null, layoutInflater) as VB
      setContentView(binding.root)
    }
    initView()
  }

   abstract fun initView()
}