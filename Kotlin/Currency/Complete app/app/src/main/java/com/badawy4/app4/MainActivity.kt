package com.badawy4.app4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener({

            var USD:Double = USD1.text.toString().toDouble()
            val TOTAL = USD*15.7

            textView.text = " "+USD+" USD equal " + TOTAL + " EGP"

        }
        )

    }
}