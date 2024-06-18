package com.example.example

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("type"   ) var type   : String?           = null,
  @SerializedName("images" ) var images : ArrayList<Images> = arrayListOf()

)