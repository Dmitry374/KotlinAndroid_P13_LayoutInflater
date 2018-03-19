package com.example.kotlinandroid_p13_layoutinflater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = layoutInflater.inflate(R.layout.my_layout, null)

        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        layout.addView(view)
    }
}
