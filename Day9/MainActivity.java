package com.example.introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ename , email , epass , ephone;
    Button sing_btn;

    public static final String main_key = "my_pref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String pass_key = "passKey";
    public static final String contact_key = "contactKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ename= findViewById(R.id.ename);
        email = findViewById(R.id.email);
        epass= findViewById(R.id.epass);
        ephone = findViewById(R.id.ephone);
        sing_btn = findViewById(R.id.sign_btn);


        sing_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                String userName = ename.getText().toString();
                String userPass = epass.getText().toString();
                String userEmail = email.getText().toString();
                String userMobile = ephone.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(name_key, userName);
                editor.putString(email_key, userEmail);
                editor.putString(pass_key, userPass);
                editor.putString(contact_key, userMobile);

                editor.commit();

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });




    }
}