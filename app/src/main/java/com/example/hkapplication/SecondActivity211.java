package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity211 extends AppCompatActivity {

    TextView a1,a2,a3;
    ImageView h1,h2,h3,k5,h4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second211);
        a1=findViewById(R.id.t1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        a2=findViewById(R.id.t2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        h1=findViewById(R.id.i1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        h2=findViewById(R.id.i2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        h3=findViewById(R.id.i2);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        a3=findViewById(R.id.k1);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity211.this, "LISTEN NOW", Toast.LENGTH_SHORT).show();
            }
        });
        k5=findViewById(R.id.i5);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        h4=findViewById(R.id.b1);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(SecondActivity211.this,h4);
                menu.getMenuInflater().inflate(R.menu.menus, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){

                            case R.id.k1:
                                Toast.makeText(SecondActivity211.this, "Setting", Toast.LENGTH_SHORT).show();
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