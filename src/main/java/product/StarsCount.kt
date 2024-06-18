package com.example.example

import com.google.gson.annotations.SerializedName


data class StarsCount (

        @SerializedName("1") var one : Int? = null,
        @SerializedName("2") var two : Int? = null,
        @SerializedName("3") var three : Int? = null,
        @SerializedName("4") var four : Int? = null,
        @SerializedName("5") var five : Int? = null

)