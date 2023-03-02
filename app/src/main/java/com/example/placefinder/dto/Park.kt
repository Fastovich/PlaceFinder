package com.example.placefinder.dto

import com.google.gson.annotations.SerializedName

/**
 * A data class representing a Park
 *
 * @property parkCode The code of the park
 * @property parkName The name of the park
 */
data class Park (@SerializedName("parkCode") var parkCode: String, @SerializedName("parkName") var parkName: String) {

    /**
     * Override toString
     *
     * @return parkName, parkCode
     */
    override fun toString(): String {
        return "$parkName $parkCode"
    }

}