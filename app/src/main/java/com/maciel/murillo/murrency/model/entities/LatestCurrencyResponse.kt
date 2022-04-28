package com.maciel.murillo.murrency.model.entities

import com.google.gson.annotations.SerializedName

data class LatestCurrencyResponse(
    val amount: Int,
    val date: String,
    val rates: Map<String, String>,
    @SerializedName("base") val baseCurrency: String,
)
