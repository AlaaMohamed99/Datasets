package com.badawy3.app1

import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener({

            val yearofbirth: Int = EnterDOB.text.toString().toInt()
            val currentyear = Calendar.getInstance().get(Calendar.YEAR)
            val age = currentyear - yearofbirth
            textView.text = "your age is  " + age + " years"

        }
        )

    }
}