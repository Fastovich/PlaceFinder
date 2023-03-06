package com.example.placefinder.dao

import com.example.placefinder.dto.Park
import retrofit2.Call
import retrofit2.http.GET

interface IParkDAO {
    @GET("/api/views/7gdv-fq7n/rows.json")
    fun getAllParks() : Call<List<Park>>
}