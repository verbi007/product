package com.example.example

import com.google.gson.annotations.SerializedName


data class Cashback (

  @SerializedName("value" ) var value : Int? = null,
  @SerializedName("type"  ) var type  : Int? = null

)