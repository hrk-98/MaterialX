package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SevenActivity8 extends AppCompatActivity {

    CardView h1;

    ImageView hk1,hk2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven8);

        hk1=findViewById(R.id.i6);
        hk2=findViewById(R.id.i7);
        h1=findViewById(R.id.d1);
        h1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(SevenActivity8.this, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
                dialog.setContentView(R.layout.dialog);
                dialog.setCancelable(false);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
                CardView c1= dialog.findViewById(R.id.c1);
                c1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        hk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        hk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(SevenActivity8.this,hk2);
                menu.getMenuInflater().inflate(R.menu.option,menu.getMenu());


                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){

                            case R.id.h1:
                                Toast.makeText(SevenActivity8.this, "About", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.h2:
                                Toast.makeText(SevenActivity8.this, "Setting", Toast.LENGTH_SHORT).show();
                                break;


                            case R.id.h3:
                                Toast.makeText(SevenActivity8.this, "More", Toast.LENGTH_SHORT).show();
                                break;


                            case R.id.h4:
                                Toast.makeText(SevenActivity8.this, "Logout", Toast.LENGTH_SHORT).show();
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