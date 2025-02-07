package com.example.ae_2_android_avanzado

import com.example.ae_2_android_avanzado.model.SeriesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    suspend fun getAllSeries(@Url url : String): Response<SeriesResponse>


}