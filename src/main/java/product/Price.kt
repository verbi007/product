package com.example.example

import com.google.gson.annotations.SerializedName


data class Price (

  @SerializedName("id_priv"          ) var idPriv          : String?  = null,
  @SerializedName("priv_type"        ) var privType        : String?  = null,
  @SerializedName("price_type"       ) var priceType       : Int?     = null,
  @SerializedName("priv_used"        ) var privUsed        : Int?     = null,
  @SerializedName("priv_private"     ) var privPrivate     : Boolean? = null,
  @SerializedName("price"            ) var price           : Int?     = null,
  @SerializedName("discount_price"   ) var discountPrice   : Int?     = null,
  @SerializedName("discount_percent" ) var discountPercent : Int?     = null

)