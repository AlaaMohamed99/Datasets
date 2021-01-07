package com.gradproject.mycalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum;
    EditText number1, number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.mysum);
        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        result = findViewById(R.id.myresult);

    }
    public void sumButton(View view){
        if(TextUtils.isDigitsOnly(number1.getText().toString()) &&
                TextUtils.isDigitsOnly(number1.getText().toString()) &&
                !TextUtils.isEmpty(number1.getText().toString()) &&
                !TextUtils.isEmpty(number2.getText().toString())){
            double myNumber1 = Double.parseDouble(number1.getText().toString());
            double myNumber2 = Double.parseDouble(number2.getText().toString());
            result.setText("Answer is "+(myNumber1+myNumber2));
        }
        else {
            result.setText("please put numbers");
        }

    }
}