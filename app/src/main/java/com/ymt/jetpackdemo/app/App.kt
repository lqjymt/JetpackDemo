package com.ymt.jetpackdemo.app

import android.app.Application
import android.content.Context
import kotlin.properties.Delegates

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/23 16:15
 */
 open class App : Application() {

  companion object{
   var instance by Delegates.notNull<App>()
  }
  override fun attachBaseContext(base: Context?) {
    super.attachBaseContext(base)
  }
  override fun onCreate() {
    instance =  this
    super.onCreate()
  }
}