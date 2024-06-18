package com.example.example

import com.google.gson.annotations.SerializedName


data class Rating (

  @SerializedName("all"             ) var all            : String?                   = null,
  @SerializedName("rating_type"     ) var ratingType     : Int?                      = null,
  @SerializedName("dynamic"         ) var dynamic        : String?                   = null,
  @SerializedName("dynamic_history" ) var dynamicHistory : ArrayList<DynamicHistory> = arrayListOf(),
  @SerializedName("stars_count"     ) var starsCount     : StarsCount?               = StarsCount(),
  @SerializedName("manufacturers"   ) var manufacturers  : ArrayList<Manufacturers>  = arrayListOf()

)