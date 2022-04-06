package com.example.hkapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class SixActivity1 extends AppCompatActivity {
    String name[]={"< 17 ", "17-25" , "26-40" , "40<"};
    String gender[]={"Male","Female","Other"};
    TextView j1,j2;
    ImageView m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six1);

        j1=findViewById(R.id.t1);
        j2=findViewById(R.id.t2);

        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog dialog =new AlertDialog.Builder(SixActivity1.this).setSingleChoiceItems(name, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        Toast.makeText(SixActivity1.this, ""+name[i], Toast.LENGTH_SHORT).show();
                        j1.setText(name[i]);
                    }
                }).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create();
                dialog.show();
            }
        });

        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(SixActivity1.this).setSingleChoiceItems(gender, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int c) {
                        Toast.makeText(SixActivity1.this, ""+gender[c], Toast.LENGTH_SHORT).show();
                        j2.setText(gender[c]);
                    }
                }).setPositiveButton("Apply", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create();
                dialog.show();

            }
        });

        m1=findViewById(R.id.b2);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        m2=findViewById(R.id.b1);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(SixActivity1.this,m2);
                menu.getMenuInflater().inflate(R.menu.menus,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.k1:
                                Toast.makeText(SixActivity1.this, "Setting", Toast.LENGTH_SHORT).show();
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