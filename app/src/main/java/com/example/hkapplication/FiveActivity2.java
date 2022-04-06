package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class FiveActivity2 extends AppCompatActivity {

    TextView h1,h2,h3,h4,h5,h6;
    CardView j3;
    ImageView h7,h8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five2);
        h2=findViewById(R.id.k2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = new Toast(FiveActivity2.this);
                View view1 = LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast2, null, false);
                toast.setView(view1);
                toast.show();

            }
        });

        h3=findViewById(R.id.k3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast =new Toast(FiveActivity2.this);
                View view1 =LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast6,null,false);
                toast.setView(view1);
                toast.show();


            }
        });

        h4=findViewById(R.id.k4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast =new Toast(FiveActivity2.this);
                View view1 =LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast5,null,false);
                toast.setView(view1);
                toast.show();

            }
        });

        h5=findViewById(R.id.k5);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast =new Toast(FiveActivity2.this);
                View view1 = LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast4,null,false);
                toast.setView(view1);
                toast.show();

            }
        });

        h6=findViewById(R.id.k6);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(FiveActivity2.this);
                View view1 = LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast3, null, false);
                toast.setView(view1);
                toast.show();
            }
        });
        h7=findViewById(R.id.i1);
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        h1=findViewById(R.id.k1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast toast =new Toast(FiveActivity2.this);
                View view1 =LayoutInflater.from(FiveActivity2.this).inflate(R.layout.activity_toast1,null,false);
                toast.setView(view1);
                toast.show();

            }
        });
        h8=findViewById(R.id.b1);
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu =new PopupMenu(FiveActivity2.this,h8);
                menu.getMenuInflater().inflate(R.menu.menus, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.k1:
                                Toast.makeText(FiveActivity2.this, "Setting", Toast.LENGTH_SHORT).show();
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