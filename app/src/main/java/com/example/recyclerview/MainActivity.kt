package com.example.recyclerview

//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        val productList = listOf(
//            Product("Laptop", 1000.0, R.drawable.laptop),
//            Product("Smartphone", 700.0, R.drawable.phone),
//            Product("Headphones", 200.0, R.drawable.headphones)
//        )
//
//        recyclerView.adapter = ProductAdapter(productList)
//    }
//}

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Dùng GridLayoutManager để hiển thị dạng lưới (2 cột)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val imageList = listOf(
            ImageItem("Laptop", R.drawable.laptop),
            ImageItem("Smartphone", R.drawable.phone),
            ImageItem("Camera", R.drawable.camera),
            ImageItem("Headphones", R.drawable.headphones),
            ImageItem("Smartwatch", R.drawable.smartwatch),
            ImageItem("Tablet", R.drawable.tablet),
            ImageItem("Laptop", R.drawable.laptop8),
            ImageItem("Smartphone", R.drawable.laptop2),
            ImageItem("Camera", R.drawable.laptop3),
            ImageItem("Headphones", R.drawable.laptop4),
            ImageItem("Smartwatch", R.drawable.laptop5),
            ImageItem("Tablet", R.drawable.laptop6),
            ImageItem("Laptop", R.drawable.laptop8),

        )

        recyclerView.adapter = ImageAdapter(imageList) { item ->
            Toast.makeText(this, "Bạn đã chọn: ${item.title}", Toast.LENGTH_SHORT).show()
        }

        recyclerView.layoutAnimation =
            android.view.animation.AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation)
        recyclerView.scheduleLayoutAnimation()

    }
}
