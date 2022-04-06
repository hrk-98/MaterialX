package com.example.hkapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class HrkAdapter extends BaseAdapter {

Activity activity;
String[] list;
    public HrkAdapter(ViewsActivity1 viewsActivity1, String[] list) {

        activity=viewsActivity1;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view= LayoutInflater.from(activity).inflate(R.layout.activity_spin1,parent,false);
        TextView textView= view.findViewById(R.id.k1);
        textView.setText(list[position]);

        return view;
    }
}
