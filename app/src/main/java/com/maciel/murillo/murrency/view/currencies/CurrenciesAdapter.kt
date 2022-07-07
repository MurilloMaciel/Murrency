package com.maciel.murillo.murrency.view.currencies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maciel.murillo.murrency.R

class CurrenciesAdapter : RecyclerView.Adapter<CurrenciesViewHolder>() {

    private val currencies: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrenciesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_currencies, parent, false)
        return CurrenciesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CurrenciesViewHolder, position: Int) {
        holder.bind(currencies[position])
    }

    override fun getItemCount(): Int {
        return currencies.size
    }

    fun updateList(currencies: List<String>) {
        this.currencies.clear()
        this.currencies.addAll(currencies)
        notifyDataSetChanged()
    }
}