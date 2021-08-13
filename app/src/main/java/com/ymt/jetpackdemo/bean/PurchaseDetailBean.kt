package com.ymt.jetpackdemo.bean

import java.io.Serializable

/**
 * Copyright (C), 2015-2019, 华苗木云有限公司
 * @author : lqj
 * Date : 2019/7/16 15:55
 */
class PurchaseDetailBean : Serializable {
  // 1代表 编辑这条信息的时候需要封存和解封
  var passType = 0

  //1 代表已经报过价了
  val myQuote = 0

  //状态判断 待发布=0，报价中=1，已截止=-1；交易完成=5  6审核中
  var purchaseStatus = 0
  val quoteStatusNote: String? = null
  var quoteStatus: String? = null
  var purchaseDetailParameterDtos: List<PurchaseParamBean>? = null
  var unitName: String? = null
  var breedId = 0
  var breedName: String? = null

  var chooseCount = 0
  var quoteCount = 0
  var purchaseCount = 0
  var addrCode: String? = null
  var sndQuoteCount = 0
  var demandNote: String? = null
  var batchCount = 0
  var qualityGrade: Any? = null
  var remark: String? = null
  var useSeedlingPosition: String? = null
  var useSeedlingAddr: String? = null
  var useSeedlingTime: String? = null
  var demandDetailStatus = 0
  var purchaseDetailId = 0
  var breedAnotherNames: Any? = null
  var averagePrice = 0
  var purchaseId = 0
  var photoUrl: String? = null
  var purposeNote: Any? = null
  private val titlePreffix: String? = null
}