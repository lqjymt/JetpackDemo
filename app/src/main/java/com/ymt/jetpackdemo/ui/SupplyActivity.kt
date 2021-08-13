package com.ymt.jetpackdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.ymt.jetpackdemo.R
import com.ymt.jetpackdemo.adapter.PurchaseAdapter
import com.ymt.jetpackdemo.adapter.SupplyAdapter
import com.ymt.jetpackdemo.base.BaseActivity
import com.ymt.jetpackdemo.bean.PurchaseBean
import com.ymt.jetpackdemo.databinding.ActivitySupplyBinding
import com.ymt.jetpackdemo.mode.SupplyViewModel
import com.ymt.jetpackdemo.util.Lg
/**
* Copyright (C), 2015-2020, 华苗木云有限公司
* @author : lqj
* Date : 2021/8/4 :10:15
*/
class SupplyActivity : BaseActivity<ActivitySupplyBinding>() {
  private val model:SupplyViewModel by viewModels()
  override fun setViewBinding(): LayoutInflater {
   return layoutInflater
  }
  private  var adapter: PurchaseAdapter? = null
  override fun initView() {
    model.getList()
    model.mSupplyLiveData.observe(this, Observer { data ->
      adapter?.addData(data) ?:let{
        adapter = PurchaseAdapter()
        binding.rv.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        binding.rv.adapter = adapter
        adapter!!.addData(data)
      }


    })
    Lg.d("supply activity create");
  }
}