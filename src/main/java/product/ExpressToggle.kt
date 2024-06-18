package com.example.example

import com.google.gson.annotations.SerializedName


data class ExpressToggle (

  @SerializedName("expressView"   ) var expressView   : Boolean? = null,
  @SerializedName("expressChosen" ) var expressChosen : Boolean? = null

)