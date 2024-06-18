package com.example.example

import com.google.gson.annotations.SerializedName


data class DynamicHistory (

  @SerializedName("date"   ) var date   : String? = null,
  @SerializedName("rating" ) var rating : String? = null

)