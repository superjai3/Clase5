package com.example.clase5

import android.media.tv.TvView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var tvNum: TvView
    private lateinit var btnSum: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNum = findViewById(R.id.textViewNumero)
        btnSum = findViewById(R.id.button)

    }
}