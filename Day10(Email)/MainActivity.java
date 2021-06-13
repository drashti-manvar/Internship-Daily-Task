package com.example.day_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etTo,etsubject,etMsg;
    Button btnEmail;

    public static final String main_key="my_pref";
    public static final String name_key="nameKey";
    public static final String email_key="emailKey";
    public static final String password_key="passwordKey";
    public static final String contact_key="contactKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTo=findViewById(R.id.etTo);
        etsubject=findViewById(R.id.etSubject);
        etMsg=findViewById(R.id.etMsg);
        btnEmail=findViewById(R.id.btnEmail);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to=etTo.getText().toString();
                String subject=etsubject.getText().toString();
                String msg=etMsg.getText().toString();

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,msg);
                intent.setType("message/rfc822");
                startActivity(intent.createChooser(intent,"Send email :"));



            }
        });

    }
}
