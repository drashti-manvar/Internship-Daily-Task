package com.example.registration;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar action = getSupportActionBar();
        action.setTitle("Second Action");

        Intent in = getIntent();
        String Name = in.getStringExtra("NAME :-");
        String hobbies = in.getStringExtra("HOBBIES :-");
        String Number = in.getStringExtra("NUMBER :-");
        String Email = in.getStringExtra("EMAIL :-");
        String Password = in.getStringExtra("PASSWORD :-");

        TextView tt = findViewById(R.id.textView);

        tt.setText("NAME: "+Name+"\nHOBBIES:  "+hobbies+ "\nNUMBER:  "+Number+"\nEMAIL:"+Email+"\nPASSWORD:  "+Password);






    }


}