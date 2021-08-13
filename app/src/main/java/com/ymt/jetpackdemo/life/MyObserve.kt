package com.ymt.jetpackdemo.life

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.ymt.jetpackdemo.util.Lg

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/5/21 15:29
 */
public class MyObserve : LifecycleObserver {
  @OnLifecycleEvent(Lifecycle.Event.ON_START)
  fun connectListener(): Unit {
      Lg.d("connectListener")
  }
  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  fun connectListenerWhenCreate(): Unit {
    Lg.d("connectListenerWhenCreate")
  }
  @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  fun disConnectListener(): Unit {
    Lg.d("disConnectListener")
  }
}