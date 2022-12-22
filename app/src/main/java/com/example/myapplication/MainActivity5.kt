package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var tv_answer = findViewById<TextView>(R.id.tv_answer)
        var answer = intent.getStringExtra("num")
        tv_answer.text = answer

        val btn_home =findViewById<ImageButton>(R.id.imageButton3)
        btn_home.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
