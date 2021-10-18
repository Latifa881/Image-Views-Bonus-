package com.example.imageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    lateinit var btImage1:Button
    lateinit var btImage2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)
        btImage1=findViewById(R.id.btImage1)
        btImage2=findViewById(R.id.btImage2)

        btImage1.setOnClickListener {
            imageView.setImageDrawable(resources.getDrawable(R.drawable.butterfly1))
        }

        btImage2.setOnClickListener {
            imageView.setImageDrawable(resources.getDrawable(R.drawable.butterfly2))
        }
    }
}