package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class SecondActivity1 extends AppCompatActivity {

    ImageView k3,k1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        k3=findViewById(R.id.i3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        k1=findViewById(R.id.b1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(SecondActivity1.this,k1);
                menu.getMenuInflater().inflate(R.menu.menus, menu.getMenu());


                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){

                            case R.id.k1:
                                Toast.makeText(SecondActivity1.this, "Setting", Toast.LENGTH_SHORT).show();
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