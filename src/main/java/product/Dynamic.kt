package com.example.example

import com.google.gson.annotations.SerializedName


data class Dynamic (

  @SerializedName("style"      ) var style      : String? = null,
  @SerializedName("title"      ) var title      : String? = null,
  @SerializedName("subtitle"   ) var subtitle   : String? = null,
  @SerializedName("image"      ) var image      : String? = null,
  @SerializedName("link"       ) var link       : String? = null,
  @SerializedName("properties" ) var properties : String? = null,
  @SerializedName("content"    ) var content    : String? = null

)