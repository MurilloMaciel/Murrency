package com.maciel.murillo.murrency.viewmodel.currencies

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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

    val currencies = MutableLiveData<List<String>>()
//    val currencies: LiveData<List<String>> = _currencies

    fun getCurrencies() {
        viewModelScope.launch {
            val currenciesMap = repository.getCurrencies()
            val currenciesList = mapCurrencies(currenciesMap.currencyMap)
            currencies.postValue(currenciesList)
        }
    }

    private fun mapCurrencies(map: Map<String, String>): List<String> {
        val list = mutableListOf<String>()
        for (entry in map.entries) {
            list.add( "${entry.key} : ${entry.value}" )
        }
        return list
    }
}

