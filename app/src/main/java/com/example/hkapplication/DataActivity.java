package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {



    TextView name,age,id,address,phone,hobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        name=findViewById(R.id.l1);
        age=findViewById(R.id.l2);
        id=findViewById(R.id.l3);
        address=findViewById(R.id.l4);
        phone=findViewById(R.id.l5);
        hobby=findViewById(R.id.l6);

        String n=getIntent().getStringExtra("name1");
        String a=getIntent().getStringExtra("age1");
        String i=getIntent().getStringExtra("id1");
        String ad=getIntent().getStringExtra("address1");
        String p=getIntent().getStringExtra("phoneno1");
        String h=getIntent().getStringExtra("hobby1");

        name.setText("Name:-"+n);
        age.setText("Age :-"+a);
        id.setText("ID :-"+i);
        address.setText("Address :-"+ad);
        phone.setText("Phone No :-"+p);
        hobby.setText("Hobby :-"+h);



    }
}