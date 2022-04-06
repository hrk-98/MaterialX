package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,spinner,camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h1=findViewById(R.id.c1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });
        h2=findViewById(R.id.c2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });
        h3=findViewById(R.id.c3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        h4=findViewById(R.id.c4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,FourActivity.class);
                startActivity(intent);
            }
        });
        h5=findViewById(R.id.c5);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,FiveActivity.class);
                startActivity(intent);
            }
        });
        h6=findViewById(R.id.c6);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent intent = new Intent(MainActivity.this,SixActivity.class);
              startActivity(intent);
            }
        });
        h7=findViewById(R.id.c7);
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,SevenActivity.class);
                startActivity(intent);
            }
        });
        h8=findViewById(R.id.c8);
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,EightActivity.class);
                startActivity(intent);

            }
        });
        h9=findViewById(R.id.c9);
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Verification submit success", Toast.LENGTH_SHORT).show();
            }
        });
        h10=findViewById(R.id.c10);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Login submit success", Toast.LENGTH_SHORT).show();
            }
        });
        h11=findViewById(R.id.c11);
        h11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Dashboard submit success", Toast.LENGTH_SHORT).show();
            }
        });
        h12=findViewById(R.id.c12);
        h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Artical submit success", Toast.LENGTH_SHORT).show();
            }
        });
        h13=findViewById(R.id.c13);
        h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "About submit success", Toast.LENGTH_SHORT).show();
            }
        });
        h14=findViewById(R.id.c14);
        h14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Chat submit success", Toast.LENGTH_SHORT).show();
            }
        });
        spinner=findViewById(R.id.c15);
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Spinner11.class);
                startActivity(intent);
            }
        });

        camera=findViewById(R.id.c16);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });
    }
}