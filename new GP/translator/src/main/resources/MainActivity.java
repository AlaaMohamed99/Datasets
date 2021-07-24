package com.gradproject.agecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText dob;
    TextView result;
    Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dob = findViewById(R.id.EnterDOB);
        result = findViewById(R.id.textView);
        calc = findViewById(R.id.button1);
    }
    public void getAgeButton(View view){

        int myDOB = Integer.parseInt( dob.getText().toString());
        int currentYear = 2021;
        int age = currentYear - myDOB;
        result.setText("Your age is "+ age +" years");


    }
}