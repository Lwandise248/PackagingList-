package com.example.packaginglist_

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DisplayPackaging : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displaypackaging)

        val lvItems = findViewById<ListView>(R.id.lvItems)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val packingList = intent.getStringArrayListExtra("packingList") ?: arrayListOf()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, packingList)
        lvItems.adapter = adapter

        btnBack.setOnClickListener {
            finish()
        }
    }
}