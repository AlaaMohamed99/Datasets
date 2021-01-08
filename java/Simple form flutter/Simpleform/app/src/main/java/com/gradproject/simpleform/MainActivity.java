package com.gradproject.simpleform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alertdialogbutton;
    private AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertdialogbutton = findViewById(R.id.mysum);
        alertdialogbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Well Done");
                alertDialog.setMessage("You've entered data successfully!");
                AlertDialog dialog = alertDialog.create();
                dialog.show();
            }
        });
    }
}