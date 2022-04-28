package com.maciel.murillo.murrency.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maciel.murillo.murrency.R
import com.maciel.murillo.murrency.model.MurrencyApi
import com.maciel.murillo.murrency.model.RepositoryImpl
import com.maciel.murillo.murrency.viewmodel.currencies.CurrenciesViewModel
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val viewModel by viewModels<CurrenciesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val viewmodel = CurrenciesViewModel()
//        viewmodel.getCurrencies()

        val teste: CurrenciesViewModel = viewModel()

    }
}