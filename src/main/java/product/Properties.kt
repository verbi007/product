package com.example.example

import com.google.gson.annotations.SerializedName


data class Properties (

  @SerializedName("property_id"          ) var propertyId         : String? = null,
  @SerializedName("property_name"        ) var propertyName       : String? = null,
  @SerializedName("property_value"       ) var propertyValue      : String? = null,
  @SerializedName("property_expand"      ) var propertyExpand     : String? = null,
  @SerializedName("display_front"        ) var displayFront       : String? = null,
  @SerializedName("color_property_value" ) var colorPropertyValue : String? = null

)