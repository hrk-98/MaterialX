package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ThirdActivity1 extends AppCompatActivity {
    ImageView k1,a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);
        k1=findViewById(R.id.i1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        a1=findViewById(R.id.b1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu=new PopupMenu(ThirdActivity1.this,a1);
                menu.getMenuInflater().inflate(R.menu.menus, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.k1:
                                Toast.makeText(ThirdActivity1.this, "Setting", Toast.LENGTH_SHORT).show();
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