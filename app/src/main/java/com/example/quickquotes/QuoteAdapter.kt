package com.example.quickquotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class QuoteAdapter(val quotes: ArrayList<String>) : RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {
    class QuoteViewHolder(v: View): RecyclerView.ViewHolder(v) {
        var view: View = v;
        var quote: String = "";
        fun bindQuote(quote: String){
            this.quote = quote;
            view.textView.text = quote;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        return QuoteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row,parent,false));
    }

    override fun getItemCount(): Int {
        return quotes.count();
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        var quote = quotes[position];
        holder.bindQuote(quote);
    }
}