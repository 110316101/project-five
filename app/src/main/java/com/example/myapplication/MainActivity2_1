package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_1)
        val answer = intent.getStringExtra("score")
        findViewById<TextView>(R.id.tv_result).text =
            "飲食行為剖析分數: ${answer}"

    }
}
