package com.ymt.jetpackdemo

import android.content.Context
import android.content.Intent

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/5/19 13:40
 */
class LoginModel constructor(name: String,pwd:String,context: Context){

    var context:Context = context
    fun onNameChange(s:CharSequence){

    }
    fun onPwdChange(s:CharSequence,start:Int,before:Int,count:Int){

    }
    fun login(){
        val it = Intent(context,MainActivity::class.java)
        context.startActivity(it)
    }
}