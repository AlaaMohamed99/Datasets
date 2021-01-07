package com.gradproject.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public void convertToEGP(View view){
        EditText editText = (EditText) findViewById(R.id.USD1);
        TextView txt = findViewById(R.id.textView);
        double dollars = Double.parseDouble(editText.getText().toString());
        double egp = 15.7;

        double result = dollars * egp ;

        txt.setText(dollars+" USD equal "+result+" EGP");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}