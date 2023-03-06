package com.example.placefinder.dto

import com.google.gson.annotations.SerializedName

data class Park (@SerializedName("id") var parkCode: String, @SerializedName("name") var parkName: String) {

    override fun toString(): String {
        return "$parkName $parkCode"
    }
}