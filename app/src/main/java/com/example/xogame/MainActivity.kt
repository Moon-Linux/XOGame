package com.example.xogame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

@SuppressLint("WrongViewCast")
class MainActivity : AppCompatActivity() {
    textNovbat = findViewById<TextView>(R.id.text_novbat)
    textX = findViewById<TextView>(R.id.text_x)
    textO = findViewById<TextView>(R.id.text_o)
    lateinit var textTeng = 
    lateinit var button11 =
    lateinit var button12 =
    lateinit var button13 =
    lateinit var button21 =
    lateinit var button22 =
    lateinit var button23 =
    lateinit var button31 =
    lateinit var button32 =
    lateinit var button33 =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textNovbat = findViewById<TextView>(R.id.text_novbat)
        textX = findViewById<TextView>(R.id.text_x)
        textO = findViewById<TextView>(R.id.text_o)
        textTeng = findViewById<TextView>(R.id.text_teng)
        button11 = findViewById<AppCompatButton>(R.id.btn_1_1)
        button12 = findViewById<AppCompatButton>(R.id.btn_1_2)
        button13 = findViewById<AppCompatButton>(R.id.btn_1_3)
        button21 = findViewById<AppCompatButton>(R.id.btn_2_1)
        button22 = findViewById<AppCompatButton>(R.id.btn_2_2)
        button23 = findViewById<AppCompatButton>(R.id.btn_2_3)
        button31 = findViewById<AppCompatButton>(R.id.btn_3_1)
        button32 = findViewById<AppCompatButton>(R.id.btn_3_2)
        button33 = findViewById<AppCompatButton>(R.id.btn_3_3)

        lateinit var

    }



}