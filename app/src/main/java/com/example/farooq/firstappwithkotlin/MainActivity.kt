package com.example.farooq.firstappwithkotlin

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        _recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val items = ArrayList<MyData>()

        //adding some dummy data to the list
        items.add(MyData("text 1", BitmapFactory.decodeResource(resources, R.drawable.icon1)))
        items.add(MyData("text 2", BitmapFactory.decodeResource(resources, R.drawable.icon2)))
        items.add(MyData("text 3", BitmapFactory.decodeResource(resources, R.drawable.icon3)))
        items.add(MyData("text 4", BitmapFactory.decodeResource(resources, R.drawable.icon4)))
        items.add(MyData("text 5", BitmapFactory.decodeResource(resources, R.drawable.icon5)))
        items.add(MyData("text 6", BitmapFactory.decodeResource(resources, R.drawable.icon1)))
        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.icon2)))
        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.icon3)))
        items.add(MyData("text 8", BitmapFactory.decodeResource(resources, R.drawable.icon4)))
        items.add(MyData("text 9", BitmapFactory.decodeResource(resources, R.drawable.icon5)))
        items.add(MyData("text 10", BitmapFactory.decodeResource(resources, R.drawable.icon1)))
        items.add(MyData("text 11", BitmapFactory.decodeResource(resources, R.drawable.icon2)))
        items.add(MyData("text 12", BitmapFactory.decodeResource(resources, R.drawable.icon2)))
        items.add(MyData("text 13", BitmapFactory.decodeResource(resources, R.drawable.icon3)))
        items.add(MyData("text 14", BitmapFactory.decodeResource(resources, R.drawable.icon4)))
        items.add(MyData("text 15", BitmapFactory.decodeResource(resources, R.drawable.icon5)))
        items.add(MyData("text 16", BitmapFactory.decodeResource(resources, R.drawable.icon1)))
        //creating our adapter
        val adapter = RecyclerViewAdapter(items)

        //now adding the adapter to recyclerview
        _recyclerView.adapter = adapter
    }


}
