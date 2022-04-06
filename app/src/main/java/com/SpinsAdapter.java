package com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hkapplication.R;
import com.example.hkapplication.Spinner11;

public class SpinsAdapter extends BaseAdapter {

    Activity activity;
    String[] lists;

public SpinsAdapter(Spinner11 spinner11,String[] lists){
    activity=spinner11;
    this.lists=lists;
}
    @Override
    public int getCount() {
        return lists.length;
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
        TextView textView=view.findViewById(R.id.k1);
        textView.setText(lists[position]);
        return view;
    }
}
