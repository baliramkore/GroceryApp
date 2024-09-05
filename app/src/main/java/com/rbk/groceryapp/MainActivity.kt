package com.rbk.groceryapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 Adapterview RecyclerView
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2 Data source: List of ItemModel Objects
        var groceryItems:ArrayList<ItemModel> =ArrayList()
        val v1=ItemModel("Fruits","Fresh Fruits From Farmers",R.drawable.fruit)
        val v2=ItemModel("Vegetables","Delicious Vegetables",R.drawable.vegetable)
        val v3=ItemModel("Bakery","Bread, Wheat, and Beans",R.drawable.bread)
        val v4=ItemModel("Beverage","Fresh Fruits From Farmers",R.drawable.beverage)
        val v5=ItemModel("Milk","Milk, Shakes, and Yogurt",R.drawable.milk)
        val v6=ItemModel("Snacks","Pop Corn, Donut, and Drinks",R.drawable.popcorn)
        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)


        //3 adapter
        val adapter=MyAdapter(groceryItems)
        recyclerView.adapter=adapter



    }
}