package com.ymt.jetpackdemo.mode

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/5/21 16:05
 */
class NameViewModel :ViewModel() {
  val text = "empty"
  val currentName:MutableLiveData<String> by lazy {
    MutableLiveData<String>()
  }
}