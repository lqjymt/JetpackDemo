package com.ymt.jetpackdemo.vpn

import android.content.Intent
import android.net.VpnService

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/9/9 14:21
 */
 class TestVpnService : VpnService() {
  override fun onCreate() {
    super.onCreate()
  }

  override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    return super.onStartCommand(intent, flags, startId)
  }
}