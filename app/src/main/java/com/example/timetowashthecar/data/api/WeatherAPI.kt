package com.example.timetowashthecar.data.api

import com.example.timetowashthecar.data.dto.WeatherPart
import com.example.timetowashthecar.data.dto.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {


    @GET("onecall")
    suspend fun getWeatherByCoord(@Query("lat") lat: Double, @Query("lon") lon: Double,
                                         @Query("exclude") exclude: WeatherPart
    ): WeatherResponse

}