package com.example.calculater;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

   EditText e1,e2;
   Button button,button2,button3,button4;
   TextView Result;
   TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        t1 = findViewById(R.id.t1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(e1.getText().toString());
                s = Integer.parseInt(e2.getText().toString());
                a = f + s;
                t1.setText("Result=" + a);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(e1.getText().toString());
                s = Integer.parseInt(e2.getText().toString());
                a = f - s;
                t1.setText("Result=" + a);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(e1.getText().toString());
                s = Integer.parseInt(e2.getText().toString());
                a = f * s;
                t1.setText("Result=" + a);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(e1.getText().toString());
                s = Integer.parseInt(e2.getText().toString());
                a = f / s;
                t1.setText("Result=" + a);
            }
        });


    }



}
