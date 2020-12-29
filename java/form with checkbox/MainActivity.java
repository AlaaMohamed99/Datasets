package com.gradproject.formwithcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText getName;
    TextView setName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getName = findViewById(R.id.editTextTextPersonName);
        setName = findViewById(R.id.textView2);
    }
    public void confirm(View view){
        String name = getName.getText().toString();
        setName.setText("Welcome "+name);

    }
}
