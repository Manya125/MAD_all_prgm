package com.example.gridview_images;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int logs[];
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] logs) {
        this.context=applicationContext;
        this.logs=logs;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {

        return logs.length;
    }

    @Override
    public Object getItem(int i) {

        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_grid,null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(logs[i]);
        return view;
    }


}
