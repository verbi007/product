package com.example.example

import com.google.gson.annotations.SerializedName


data class Check (

  @SerializedName("cash_id"          ) var cashId         : Int?    = null,
  @SerializedName("check_number"     ) var checkNumber    : Int?    = null,
  @SerializedName("check_uid"        ) var checkUid       : String? = null,
  @SerializedName("manufacturer_id"  ) var manufacturerId : Int?    = null,
  @SerializedName("date_check"       ) var dateCheck      : String? = null,
  @SerializedName("can_leave_rating" ) var canLeaveRating : Int?    = null

)