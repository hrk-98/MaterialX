package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    EditText a1,a2,a3,a4,a5,a6;
    Button s1;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        a1=findViewById(R.id.name);
        a2=findViewById(R.id.age);
        a3=findViewById(R.id.id);
        a4=findViewById(R.id.address);
        a5=findViewById(R.id.phoneno);
        a6=findViewById(R.id.hobby);
        s1=findViewById(R.id.submit);

        preferences=getSharedPreferences("data",0);
        editor=preferences.edit();

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,DataActivity.class);

                intent.putExtra("name1",a1.getText().toString());
                intent.putExtra("age1",a2.getText().toString());
                intent.putExtra("id1",a3.getText().toString());
                intent.putExtra("address1",a4.getText().toString());
                intent.putExtra("phoneno1",a5.getText().toString());
                intent.putExtra("hobby1",a6.getText().toString());


                startActivity(intent);

            }
        });



    }
}