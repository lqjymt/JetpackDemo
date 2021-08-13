package com.ymt.jetpackdemo.bean

import com.chad.library.adapter.base.entity.MultiItemEntity
import java.util.LinkedHashMap

/**
 * Copyright (C), 2015-2019, 华苗木云有限公司
 *
 * @author : lqj
 * Date : 2019/6/17 17:27
 */
class PurchaseBean {

  val purchaseDetails: List<SimpleBreedBean>? = null

  /**工程单-苗木已报价个数 */
  val quoteSuccessCount: Int? = null

  /**工程单-苗木没有报价个数 */
  val quoteWaitCount: Int? = null

  //>0代表置顶
  var sortNumber = 0

  //是否对此求购单报价过  1代表是
  var myQuote = 0
  val purchaseDetailParameterDtos: List<PurchaseParamBean>? = null
  var purchaseDetailDtos: List<PurchaseDetailBean>? = null
  val paramMap: LinkedHashMap<String, String>? = null

  //isQuote     是否可以报价  0-不可以  1- 可以
  var isQuote = 0

  // 服务器当前时间
  var serverTime: String? = null
  var quoteId: String? = null

  //报价数量
  var purchaseQuoteCount = 0

  //需求数量
  var detailQuoteCount = 0
  var quoteCount = 0
  var chooseCount: Any? = null
  var purchaseCount = 0
  var useSeedlingPosition: String? = null
  var needRealNameAuth: Any? = null
  var needCompanyAuth: Any? = null
  var quoteStartTime: Any? = null
  var useSeedlingAddr: String? = null
  var useSeedlingTime: Any? = null
  var purchaseDetailId = 0
  var qualityGrade: Any? = null
  var batchCount: Any? = null
  var sndQuoteCount: Any? = null
  var needPhoto: Any? = null
  var quoteLvl = 0
  var quoteEndTime: String? = null
  var invoiceDemand: Any? = null
  var demandNote: String? = null
  var companyId: Any? = null
  var payType: Any? = null
  var memberId = 0
  var buyerName: String? = null
  var linkTel: String? = null
  var addrCode: String? = null
  var quoteStatus = 0
  var publishTime: String? = null
  var linkman: Any? = null
  var carLimit: Any? = null
  var breedName: String? = null
  var breedId = 0
  var unitName: String? = null
  var remark: String? = null
  var projectItemId: Any? = null
  var purchaseId = 0
  var purchaseTitle: String? = null
  var photoUrl: String? = null
  var purposeNote: Any? = null
  var purchaseType: Any? = null

  //状态:  1发布，3选标，4撤标，5定标，6完成 , -100逻辑删除  1才可以报价  1才可以报价
  var demandDetailStatus = 0
  var purchaseStatus = 0
  var projectItemName: Any? = null
  var breedAnotherNames: Any? = null
  var clickCount: Any? = null
  var averagePrice: Any? = null
  var detailParameterDtos: List<String>? = null
}