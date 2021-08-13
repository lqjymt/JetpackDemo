package com.ymt.jetpackdemo.http

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/4 09:39
 */
data class BaseResult<T>(
  var resultCode:Int = 0,
  var resultMsg:String = "",
  var data:T?=null
)
