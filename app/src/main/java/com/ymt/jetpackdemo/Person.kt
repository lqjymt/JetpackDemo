package com.ymt.jetpackdemo

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/7/21 14:27
 */
class Person(_age:Int,_name:String) {
  lateinit var equ :String
  val config by lazy { loadConfig() }

  private fun loadConfig() :String {
      return  ""
  }

  var age = _age
  var name =_name
  constructor(age:Int) : this(18,""){

  }
  init {

  }
}