package com.badawy5.formflutter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener({
            val alertDialogBuilder = AlertDialog.Builder(this).setTitle("localhost:8101 says")
                .setMessage("Button Clicked!").setNegativeButton("Ok") { dialogInterface, which ->
                Toast.makeText(applicationContext, "clicked ok", Toast.LENGTH_LONG).show()

            }.show()
        })

    }
}