package com.ymt.jetpackdemo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.ymt.jetpackdemo.R
import com.ymt.jetpackdemo.bean.PurchaseBean
import com.ymt.jetpackdemo.http.SupplyItemBean

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/13 10:37
 */
class SupplyAdapter( data: MutableList<PurchaseBean>?) :
  BaseQuickAdapter<PurchaseBean, BaseViewHolder>(R.layout.item_home_buy, data) {

  override fun convert(holder: BaseViewHolder, item: PurchaseBean) {
      holder.setText(R.id.tv_title,item.purchaseTitle);
      holder.setText(R.id.tv_time,item.publishTime);
  }
}