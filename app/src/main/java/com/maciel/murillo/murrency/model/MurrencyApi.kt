package com.maciel.murillo.murrency.model

import com.maciel.murillo.murrency.model.entities.LatestCurrencyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MurrencyApi {

    @GET("/currencies")
    suspend fun getCurrencies(): Map<String, String>

    @GET("/latest")
    suspend fun getLatestCotation(
        @Query("from") baseCurrency: String
    ): LatestCurrencyResponse
}