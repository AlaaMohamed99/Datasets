package com.badawy5.app6_ionicconverted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            val alertDialogBuilder = AlertDialog.Builder(this).setTitle("localhost:8101 says").setMessage("Button Clicked!").setNegativeButton("Ok") { dialogInterface, which ->
                Toast.makeText(applicationContext, "clicked ok", Toast.LENGTH_LONG).show()

            }.show()
        }
        )
    }
}