package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myList);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("drashti");
        myFamily.add("yatri");
        myFamily.add("rushita");
        myFamily.add("riya");
        myFamily.add("jyoti");
        myFamily.add("disha");
        myFamily.add("pragya");
        myFamily.add("binda");
        myFamily.add("rutvi");
        myFamily.add("garima");
        myFamily.add("pragya");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Log.i("person tapped:", myFamily.get(position));
            }


        });
    }
}