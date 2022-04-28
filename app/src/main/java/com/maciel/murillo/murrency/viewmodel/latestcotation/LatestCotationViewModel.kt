package com.maciel.murillo.murrency.viewmodel.latestcotation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maciel.murillo.murrency.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LatestCotationViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun getLatestCotation(baseCurrency: String) {
        viewModelScope.launch {
            val value = repository.getLatestCotation(baseCurrency)
            Log.d("Murillo", "$value")
        }
    }
}