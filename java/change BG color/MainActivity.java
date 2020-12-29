package com.gradProject.changebgcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layOut;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.buttonBlack);
        button2 = findViewById(R.id.buttonred);
        button3 = findViewById(R.id.buttonGreen);
        button4 = findViewById(R.id.buttonyellow);
        layOut = findViewById(R.id.Backgrd);
    }

    public void redButton(View view){
        layOut.setBackgroundColor(Color.parseColor("#FF0000"));
    }
    public void yellowButton(View view){
        layOut.setBackgroundColor(Color.parseColor("#FFFF00"));
    }
    public void blackButton(View view){
        layOut.setBackgroundColor(Color.parseColor("#000000"));
    }
    public void greenButton(View view){
        layOut.setBackgroundColor(Color.parseColor("#00FF00"));
    }
}
