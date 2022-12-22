package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val btn_sub = findViewById<Button>(R.id.btn_submit)
        val boy = findViewById<RadioButton>(R.id.rbtn_male)
        val girl = findViewById<RadioButton>(R.id.rbtn_female)

        btn_sub.setOnClickListener {
            val ed_age = findViewById<EditText>(R.id.ed_age).text.toString().toFloat()
            val ed_height = findViewById<EditText>(R.id.ed_height).text.toString().toFloat()
            val ed_weight = findViewById<EditText>(R.id.ed_weight).text.toString().toFloat()
            Log.e("age", ed_age.toString())
            Log.e("height", ed_height.toString())
            Log.e("weight", ed_weight.toString())
        if (boy.isChecked) {
            var BMR_boy = ((66.5 + (13.75 * ed_weight) + (5.003 * ed_height) - (6.755 * ed_age)).toInt())
            findViewById<TextView>(R.id.tv_bmr).text = "您的BMR: ${BMR_boy} Kcal"
        }
            if (girl.isChecked) {
                var BMR_girl = ((655 + (9.563 * ed_weight) + (1.85 * ed_height) - (4.676 * ed_age)).toInt())
                findViewById<TextView>(R.id.tv_bmr).text = "您的BMR: ${BMR_girl} Kcal"
            }
        }
    }
}


