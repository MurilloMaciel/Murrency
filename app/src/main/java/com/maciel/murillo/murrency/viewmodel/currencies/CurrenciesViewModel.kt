package com.maciel.murillo.murrency.viewmodel.currencies

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maciel.murillo.murrency.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrenciesViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun getCurrencies() {
        viewModelScope.launch {
            val value = repository.getCurrencies()
            Log.d("Murillo", "$value")
        }
    }
}

