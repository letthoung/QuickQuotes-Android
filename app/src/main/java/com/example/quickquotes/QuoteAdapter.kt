package com.example.quickquotes

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuoteAdapter : RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {
    class QuoteViewHolder(v: View): RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}