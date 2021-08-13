package com.ymt.jetpackdemo.mode

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ymt.jetpackdemo.bean.PurchaseBean
import com.ymt.jetpackdemo.http.Api
import com.ymt.jetpackdemo.http.SupplyItemBean
import kotlinx.coroutines.launch

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/4 10:36
 */
class SupplyViewModel : ViewModel() {
  val mSupplyLiveData  = MutableLiveData<List<PurchaseBean>>()
  fun getList(){
    viewModelScope.launch {
      //{"record":{"pageNum":1,"pageSize":20,"param":{"engineeringProject":0}}}
      val  map = HashMap<String,Any>()
      val pageMap = HashMap<String, Any>()
      pageMap["pageNum"] = 1
      pageMap["pageSize"] = 20
      val param = HashMap<String, Any>()
      param["engineeringProject"] =  0
      pageMap["param"] = param
      map["record"] = pageMap
      val res = Api.getSupplyApi().getSupplyList(map)
      mSupplyLiveData.postValue(res.data)
    }
  }
}