package com.maciel.murillo.murrency.view.currencies

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maciel.murillo.murrency.R

class CurrenciesViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun bind(text: String) {
        view.findViewById<TextView>(R.id.tv_currency).text = text
    }
}