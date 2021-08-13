package com.ymt.jetpackdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.ymt.jetpackdemo.base.BaseAdapter
import com.ymt.jetpackdemo.bean.PurchaseBean
import com.ymt.jetpackdemo.databinding.ItemHomeBuyBinding

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/13 11:51
 */
class PurchaseAdapter : BaseAdapter<PurchaseBean>() {
  override fun onCreateViewBinding(viewType: Int): (LayoutInflater, ViewGroup, Boolean) -> ViewBinding {
    return ItemHomeBuyBinding::inflate
  }

  override fun onItemView(holder: ViewBindHolder, position: Int, item: PurchaseBean) {
    val binding = holder.binding as ItemHomeBuyBinding
    binding.tvTitle.text = item.purchaseTitle
  }
}