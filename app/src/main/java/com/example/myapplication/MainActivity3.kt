package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import kotlin.math.roundToInt

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn_send = findViewById<Button>(R.id.button2)

        btn_send.setOnClickListener {
            val ed_height = findViewById<EditText>(R.id.editTextTextPersonName).text.toString().toFloat()
            val ed_weight = findViewById<EditText>(R.id.editTextTextPersonName2).text.toString().toFloat()
            val bmi: Int = (((ed_weight/(ed_height*ed_height))*10000)*100).roundToInt()/100
            Log.d("bmi", bmi.toString() )

            val intent = Intent(this, MainActivity3_1::class.java)
            intent.putExtra("height", ed_height.toString())
            intent.putExtra("weight", ed_weight.toString())
            intent.putExtra("bmi", bmi)
            startActivity(intent)
        }
    }
}
