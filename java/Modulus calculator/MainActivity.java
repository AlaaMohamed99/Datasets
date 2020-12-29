package com.gradproject.moduluscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mod;
    EditText number1, number2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mod = findViewById(R.id.button1);
        number1 = findViewById(R.id.Entry1);
        number2 = findViewById(R.id.Entry2);
        result = findViewById(R.id.textView3);
    }
    public void modButton(View view){
        int myNumber1 = Integer.parseInt(number1.getText().toString());
            int myNumber2 = Integer.parseInt(number2.getText().toString());
            result.setText(""+(myNumber1 % myNumber2));


    }
}
