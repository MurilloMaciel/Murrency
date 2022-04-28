package com.maciel.murillo.murrency.model

import com.maciel.murillo.murrency.model.entities.Currencies
import com.maciel.murillo.murrency.model.entities.LatestCurrencyResponse
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: MurrencyApi
) : Repository {

    override suspend fun getCurrencies(): Currencies {
        return Currencies(
            currencyMap = api.getCurrencies()
        )
    }

    override suspend fun getLatestCotation(baseCurrency: String): LatestCurrencyResponse {
        return api.getLatestCotation(baseCurrency = baseCurrency)
    }
}