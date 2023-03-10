package com.example.placefinder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    private var retrofit: Retrofit? = null
    private val PARK_API_URL = "https://developer.nps.gov/"
    private val PARK_API_KEY = "tnhVdXhQTib85jp4ey64DRKoe3r8jZN7RtFTYrjM"

    val retrofitInstance: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(PARK_API_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit
        }
}