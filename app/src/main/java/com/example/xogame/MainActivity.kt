package com.example.xogame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {
    lateinit var textNovbat: TextView
    lateinit var textX: TextView
    lateinit var textO: TextView
    lateinit var textTeng: TextView
    lateinit var button11: Button
    lateinit var button12: Button
    lateinit var button13: Button
    lateinit var button21: Button
    lateinit var button22: Button
    lateinit var button23: Button
    lateinit var button31: Button
    lateinit var button32: Button
    lateinit var button33: Button
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textNovbat = findViewById<TextView>(R.id.text_novbat)
        textX = findViewById<TextView>(R.id.text_x)
        textO = findViewById<TextView>(R.id.text_o)
        textTeng = findViewById<TextView>(R.id.text_teng)
        button11 = findViewById<Button>(R.id.btn_1_1)
        button12 = findViewById<Button>(R.id.btn_1_2)
        button13 = findViewById<Button>(R.id.btn_1_3)
        button21 = findViewById<Button>(R.id.btn_2_1)
        button22 = findViewById<Button>(R.id.btn_2_2)
        button23 = findViewById<Button>(R.id.btn_2_3)
        button31 = findViewById<Button>(R.id.btn_3_1)
        button32 = findViewById<Button>(R.id.btn_3_2)
        button33 = findViewById<Button>(R.id.btn_3_3)
    }



}