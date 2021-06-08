package com.example.day9_dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_signup , login_btn;
    EditText lmail , lpass;

    public static final String email_key = "emailkey";
    public static final String pass_key = "passkey";
    public static final String main_key = "my_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lmail = findViewById(R.id.lmail);
        lpass = findViewById(R.id.lpass);
        btn_signup = findViewById(R.id.btn_signup);
        login_btn = findViewById(R.id.login_btn);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userPass = lpass.getText().toString();
                String userEmail = lmail.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);

                String userEmail1 = preferences.getString(email_key,"");
                String userpass2 = preferences.getString(pass_key,"");

                if(userEmail.equals(userEmail1) && userPass.equals(userpass2)){

                    Intent intent = new Intent(LoginActivity.this,Display_Activity.class);
                    startActivity(intent);
                }  else{

                    Toast.makeText(LoginActivity.this,"Invalid Login details", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}