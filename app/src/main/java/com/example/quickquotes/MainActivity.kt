package com.example.quickquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var layoutManager: LinearLayoutManager;
    lateinit var adapter: QuoteAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutManager = LinearLayoutManager(this);
        recyclerView.layoutManager = layoutManager;

        adapter = QuoteAdapter();
        recyclerView.adapter = adapter;
    }
}