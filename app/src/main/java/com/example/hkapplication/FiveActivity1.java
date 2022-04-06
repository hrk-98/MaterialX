package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class FiveActivity1 extends AppCompatActivity {

    ImageView p1,p2;
    Button j1, j2, j3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five1);
        p1 = findViewById(R.id.i7);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        j1 = findViewById(R.id.s1);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FiveActivity1.this, "Simple toast", Toast.LENGTH_SHORT).show();
            }
        });
        j2 = findViewById(R.id.s2);
        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(FiveActivity1.this);
                View view1 = LayoutInflater.from(FiveActivity1.this).inflate(R.layout.activity_toast, null, false);
                toast.setView(view1);
                toast.show();

            }
        });

        j3 = findViewById(R.id.s3);
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(FiveActivity1.this);
                View view1 = LayoutInflater.from(FiveActivity1.this).inflate(R.layout.activity_toast1, null, false);
                toast.setView(view1);
                toast.show();

            }
        });

        p2=findViewById(R.id.b1);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(FiveActivity1.this,p2);
                menu.getMenuInflater().inflate(R.menu.menus, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                       switch (item.getItemId()){

                           case R.id.k1:
                               Toast.makeText(FiveActivity1.this, "Setting", Toast.LENGTH_SHORT).show();
                               break;
                       }
                        return false;
                    }
                });
                menu.show();
            }
        });
    }
}