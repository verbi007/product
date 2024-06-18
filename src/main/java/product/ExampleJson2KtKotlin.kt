package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("id"                 ) var id                : Int?                  = null,
  @SerializedName("title"              ) var title             : String?               = null,
  @SerializedName("amount"             ) var amount            : Double?               = null,
  @SerializedName("amount_express"     ) var amountExpress     : Double?               = null,
  @SerializedName("amount_tomorrow"    ) var amountTomorrow    : Double?               = null,
  @SerializedName("adults_only"        ) var adultsOnly        : Boolean?              = null,
  @SerializedName("is_favorite"        ) var isFavorite        : Boolean?              = null,
  @SerializedName("unit"               ) var unit              : String?               = null,
  @SerializedName("weight_kg"          ) var weightKg          : String?               = null,
  @SerializedName("weight_step"        ) var weightStep        : String?               = null,
  @SerializedName("weight_type"        ) var weightType        : String?               = null,
  @SerializedName("weight_str"         ) var weightStr         : String?               = null,
  @SerializedName("price"              ) var price             : Price?                = Price(),
  @SerializedName("button"             ) var button            : Button?               = Button(),
  @SerializedName("images"             ) var images            : ArrayList<Images>     = arrayListOf(),
  @SerializedName("labels"             ) var labels            : ArrayList<String>     = arrayListOf(),
  @SerializedName("labels_loyalty"     ) var labelsLoyalty     : String?               = null,
  @SerializedName("rating"             ) var rating            : Rating?               = Rating(),
  @SerializedName("cashback"           ) var cashback          : Cashback?             = Cashback(),
  @SerializedName("backlight_color"    ) var backlightColor    : String?               = null,
  @SerializedName("express_toggle"     ) var expressToggle     : ExpressToggle?        = ExpressToggle(),
  @SerializedName("in_archive"         ) var inArchive         : Boolean?              = null,
  @SerializedName("check"              ) var check             : Check?                = Check(),
  @SerializedName("licenses"           ) var licenses          : String?               = null,
  @SerializedName("protocol_log"       ) var protocolLog       : String?               = null,
  @SerializedName("dynamic"            ) var dynamic           : Dynamic?              = Dynamic(),
  @SerializedName("analogs"            ) var analogs           : String?               = null,
  @SerializedName("properties"         ) var properties        : ArrayList<Properties> = arrayListOf(),
  @SerializedName("possible_prefer"    ) var possiblePrefer    : Boolean?              = null,
  @SerializedName("can_estimate"       ) var canEstimate       : Int?                  = null,
  @SerializedName("sets"               ) var sets              : String?               = null,
  @SerializedName("product_categories" ) var productCategories : ArrayList<Int>        = arrayListOf()

)