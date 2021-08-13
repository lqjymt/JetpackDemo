package com.ymt.jetpackdemo.http

import com.ymt.jetpackdemo.bean.PurchaseBean
import retrofit2.http.Body
import retrofit2.http.POST
import java.util.Objects

/**
 * Copyright (C), 2015-2021, 华苗木云有限公司
 * @author : lqj
 * Date : 2021/8/4 09:47
 */
interface SupplyService {
   @POST("inviteBids/InviteBidEsQueryRpc/selectPurchasePage")
   suspend fun getSupplyList(@Body map: HashMap<String,Any>):BaseResult<List<PurchaseBean>>
}