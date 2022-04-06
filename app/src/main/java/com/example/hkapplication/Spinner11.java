package com.example.hkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.SpinsAdapter;

public class Spinner11 extends AppCompatActivity {

    Spinner spinner;
    String gender[]={"male","female","other"};
    Spinner spin;
    String age[]={"< 18","18-30","30-45","45<"};
    Spinner spinner1;
    String lists[]={"C","C++","java","kotlin","Android","Studio","Fluter"};
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner11);

        spin=findViewById(R.id.k2);
        ArrayAdapter adapter1 =new ArrayAdapter(Spinner11.this, android.R.layout.simple_spinner_dropdown_item,age);
        spin.setAdapter(adapter1);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {
                Toast.makeText(Spinner11.this, ""+age[position1], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner=findViewById(R.id.k1);
        ArrayAdapter adapter=new ArrayAdapter(Spinner11.this, android.R.layout.simple_spinner_dropdown_item,gender);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Spinner11.this, ""+gender[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1=findViewById(R.id.k1);
        SpinsAdapter adapter2 = new SpinsAdapter(Spinner11.this,lists);
        spinner1.setAdapter(adapter2);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spinner11.this, ViewsActivity1.class);
                startActivity(intent);
            }
        });


    }
}