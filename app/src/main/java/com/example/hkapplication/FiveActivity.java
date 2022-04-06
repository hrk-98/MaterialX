package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    CardView h1,h2,h3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        h1=findViewById(R.id.h21);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(FiveActivity.this,FiveActivity1.class);
                startActivity(intent);

            }
        });

        h2=findViewById(R.id.h22);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(FiveActivity.this,FiveActivity2.class);
                startActivity(intent);
            }
        });
        h3=findViewById(R.id.h23);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FiveActivity.this,FiveActivity3.class);
                startActivity(intent);
            }
        });
    }
}