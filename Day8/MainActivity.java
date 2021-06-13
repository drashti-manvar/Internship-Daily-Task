package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    ListView lv1;
    int[] image={R.drawable.burger,R.drawable.chess,R.drawable.p,R.drawable.noodle};
    String[] name = {"This is Image 1","This is Image 2","This is Image 3","This is Image 4"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv1);

        Myadapter myadapter = new Myadapter(image,name,MainActivity.this);
        lv1.setAdapter(myadapter);

            }

            }






