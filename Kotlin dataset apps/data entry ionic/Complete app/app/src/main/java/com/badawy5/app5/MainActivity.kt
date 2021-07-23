package com.badawy5.app5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(
            {
                val Name: String = editTextTextPersonName.text.toString()

                textView2.text = "Welcome  " + Name


            }
        )
    }
}

