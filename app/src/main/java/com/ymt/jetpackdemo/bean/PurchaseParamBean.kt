package com.ymt.jetpackdemo.bean

import java.io.Serializable

/**
 * Copyright (C), 2015-2020, 华苗木云有限公司
 *
 * @author : lqj
 * Date : 2020/11/12 20:07
 */
class PurchaseParamBean : Serializable {
  var parameterValueType = 0
  var valueUnit: String? = null
  var valueRange1: String? = null
  var valueRange2: String? = null
  var purchaseDetailId = 0
  var purchaseDetailParameterId: String? = null
  var isRangeValue = 0
  var parameterTypeName: String? = null
  var seedlingParameterTypeId = 0
}