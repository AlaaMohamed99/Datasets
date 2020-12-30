package com.badawy4.app2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonred.setOnClickListener {
            Backgrd.setBackgroundColor(Color.RED)}


        buttonyellow.setOnClickListener {
            Backgrd.setBackgroundColor(Color.YELLOW)}

         buttonGreen.setOnClickListener {
             Backgrd.setBackgroundColor(Color.GREEN)}

         buttonBlack.setOnClickListener {
             Backgrd.setBackgroundColor(Color.BLACK)}
         }
        }
