package com.example.placefinder.dao

import com.example.placefinder.dto.Park
import retrofit2.Call
import retrofit2.http.GET

interface IParkDAO {
    @GET("JSON/park")
    fun getAllParks() : Call<ArrayList<Park>>

}