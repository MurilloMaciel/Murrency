package com.maciel.murillo.murrency.model

import com.maciel.murillo.murrency.model.entities.Currencies
import com.maciel.murillo.murrency.model.entities.LatestCurrencyResponse

interface Repository {
    suspend fun getCurrencies(): Currencies
    suspend fun getLatestCotation(baseCurrency: String): LatestCurrencyResponse
}