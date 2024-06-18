package com.example.example

import com.google.gson.annotations.SerializedName


data class Button (

  @SerializedName("id"                ) var id              : Int?    = null,
  @SerializedName("color_button"      ) var colorButton     : String? = null,
  @SerializedName("text"              ) var text            : String? = null,
  @SerializedName("color_text"        ) var colorText       : String? = null,
  @SerializedName("color_text_dark"   ) var colorTextDark   : String? = null,
  @SerializedName("icon_url"          ) var iconUrl         : String? = null,
  @SerializedName("color_button_dark" ) var colorButtonDark : String? = null,
  @SerializedName("url_by_tap"        ) var urlByTap        : String? = null,
  @SerializedName("type_button"       ) var typeButton      : String? = null,
  @SerializedName("meta"              ) var meta            : String? = null

)