package com.ymt.jetpackdemo

import android.content.Context
import android.content.Intent
import androidx.databinding.ObservableField

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/5/19 13:40
 */
class LoginModel constructor(name: String,pwd:String,context: Context){
    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)
    var context:Context = context
    fun onNameChange(s:CharSequence){
        n.set(s.toString())
    }
    fun onPwdChange(s:CharSequence,start:Int,before:Int,count:Int){
        p.set(s.toString())
    }
    fun login(){
        val it = Intent(context,MainActivity::class.java)
        context.startActivity(it)
    }
}