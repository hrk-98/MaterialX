package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    CardView g11;
    ImageView k4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        g11 = findViewById(R.id.c11);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Is successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ButtonActivity.this,SecondActivity1.class);
                startActivity(intent);
            }
        });
        k4=findViewById(R.id.i4);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}