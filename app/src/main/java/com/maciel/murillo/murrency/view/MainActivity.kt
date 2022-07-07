package com.maciel.murillo.murrency.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.maciel.murillo.murrency.R
import com.maciel.murillo.murrency.viewmodel.currencies.CurrenciesViewModel
import com.maciel.murillo.murrency.viewmodel.latestcotation.LatestCotationViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val currenciesViewModel: CurrenciesViewModel by viewModels()
    private val latestCotationViewModel: LatestCotationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        currenciesViewModel.getCurrencies()
//        latestCotationViewModel.getLatestCotation("BRL")
    }
}