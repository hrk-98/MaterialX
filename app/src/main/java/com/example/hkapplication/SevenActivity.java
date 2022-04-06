package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SevenActivity extends AppCompatActivity {

    CardView k1,h1,h2,h3,h4,h5,h6,h7,h8,h9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        k1=findViewById(R.id.c21);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        h1=findViewById(R.id.t1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SevenActivity.this,SevenActivity1.class);
                startActivity(intent);

            }
        });

        h2=findViewById(R.id.t2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SevenActivity.this,SevenActivity2.class);
                startActivity(intent);

            }
        });

        h3=findViewById(R.id.t3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SevenActivity.this,SevenActivity3.class);
                startActivity(intent);

            }
        });

        h4=findViewById(R.id.t4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SevenActivity.this,SevenActivity4.class);
                startActivity(intent);

            }
        });

        h5=findViewById(R.id.t5);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SevenActivity.this,SevenActivity5.class);
                startActivity(intent);

            }
        });

        h6=findViewById(R.id.t6);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SevenActivity.this,SevenActivity6.class);
                startActivity(intent);

            }
        });

        h7=findViewById(R.id.t7);
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SevenActivity.this,SevenActivity7.class);
                startActivity(intent);

            }
        });

        h8=findViewById(R.id.t8);
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SevenActivity.this,SevenActivity8.class);
                startActivity(intent);
            }
        });

        h9=findViewById(R.id.t9);
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SevenActivity.this,SevenActivity9.class);
                startActivity(intent);

            }
        });
    }
}