package com.example.views.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.views.Model.Category
import com.example.views.R
import com.example.views.Utilities.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //adatper is the middle man of listViews and data

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
                    android.R.layout.simple_list_item_1,
                    DataServices.categories)

        categoryListView.adapter = adapter
    }
}
