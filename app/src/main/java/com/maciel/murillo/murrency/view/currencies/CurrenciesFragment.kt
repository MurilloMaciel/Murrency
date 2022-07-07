package com.maciel.murillo.murrency.view.currencies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maciel.murillo.murrency.R
import com.maciel.murillo.murrency.viewmodel.currencies.CurrenciesViewModel

class CurrenciesFragment : Fragment() {

    private val currenciesViewModel: CurrenciesViewModel by viewModels()
    private lateinit var rvCurrencies: RecyclerView
    private val adapter = CurrenciesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_currencies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvCurrencies = view.findViewById(R.id.rv_currencies)
        setUpRecyclerView()
        setUpObservers()
    }

    private fun setUpRecyclerView() {
        rvCurrencies.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rvCurrencies.adapter = adapter
    }

    private fun setUpObservers() {
        currenciesViewModel.currencies.observe(viewLifecycleOwner) { currencies ->
            adapter.updateList(currencies)
        }
    }
}