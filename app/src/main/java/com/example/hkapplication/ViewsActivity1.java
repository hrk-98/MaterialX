package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class ViewsActivity1 extends AppCompatActivity {

    String list[]={"C","C++","java","kotlin","Android","Studio","Fluter","Adobe","Animation","#C","IOS","Figma","html","Motivation","Communication","Leadership","Trust","Goal","Collaboration","Guide"};
    GridView lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views1);
        lists=findViewById(R.id.l1);
       HrkAdapter adapter=new HrkAdapter(ViewsActivity1.this,list);
        lists.setAdapter(adapter);

        lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ViewsActivity1.this, ""+list[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}