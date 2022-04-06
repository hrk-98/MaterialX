package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {
    CardView h21,h22;
    ImageView k6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        h21 = findViewById(R.id.a21);
        h21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SecondActivity2.this,SecondActivity211.class);
                        startActivity(intent);
                    }
                });
        h22 = findViewById(R.id.a22);
        h22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity2.this,SecondActivity222.class);
                startActivity(intent);
            }
        });
        k6=findViewById(R.id.i6);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}