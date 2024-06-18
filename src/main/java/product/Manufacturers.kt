package com.example.example

import com.google.gson.annotations.SerializedName


data class Manufacturers (

  @SerializedName("manufacturer_id"   ) var manufacturerId   : Int?    = null,
  @SerializedName("manufacturer_name" ) var manufacturerName : String? = null,
  @SerializedName("rating"            ) var rating           : String? = null,
  @SerializedName("rating_type"       ) var ratingType       : Int?    = null,
  @SerializedName("star1"             ) var star1            : Int?    = null,
  @SerializedName("star2"             ) var star2            : Int?    = null,
  @SerializedName("star3"             ) var star3            : Int?    = null,
  @SerializedName("star4"             ) var star4            : Int?    = null,
  @SerializedName("star5"             ) var star5            : Int?    = null

)