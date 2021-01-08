package com.badawy5.adderfromflutter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mysum.setOnClickListener({

            val num11: Int = num1.text.toString().toInt()
            val num22: Int = num2.text.toString().toInt()
            val sum = num11 + num22
            myresult.text = " " + sum + " "
        })
        }
}