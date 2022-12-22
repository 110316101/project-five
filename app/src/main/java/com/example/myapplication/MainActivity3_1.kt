package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3_1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_1)


        val suggest = findViewById<TextView>(R.id.suggest)
        val height = intent.getStringExtra("height")
        val weight = intent.getStringExtra("weight")
        val bmi=intent.getIntExtra("bmi",0)

        findViewById<TextView>(R.id.textView14).text =
            "您的身高: ${height}\n您的體重: ${weight}\n您的BMI: ${bmi}"
        if (bmi<18.5){
            suggest.text="您的體重過輕囉"
        }else if (bmi>=18.5&& bmi<24.9){
            suggest.text="您的體重適中"
        }else if (bmi >= 30){
            suggest.text="您的體重過重囉"
        }
        val btn_home =findViewById<ImageButton>(R.id.ib_home)
        btn_home.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
