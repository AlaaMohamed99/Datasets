package com.badawy4.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener({

            val Entry11: Int = Entry1.text.toString().toInt()
            val Entry22: Int = Entry2.text.toString().toInt()

            val Result: Int =  Entry11 % Entry22

                textView3.text = " "+Result


        })



        }
}