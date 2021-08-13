package com.ymt.jetpackdemo.http

import com.ymt.jetpackdemo.util.Lg
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Logger
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/4 09:54
 */
object Api {
  private val retrofit by lazy {
   val build = OkHttpClient().newBuilder()
    val loggingInterceptor = HttpLoggingInterceptor { message -> Lg.e(msg=message) }
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    build.addInterceptor(loggingInterceptor)
    Retrofit.Builder()
      .baseUrl("http://192.168.2.239:8088/")
      .addConverterFactory(GsonConverterFactory.create())
      .client(build.build())
      .build()

  }
  fun getSupplyApi():SupplyService{
    return  retrofit.create(SupplyService::class.java)
  }
}