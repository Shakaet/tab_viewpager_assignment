package com.example.tab_viewpager_practice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listview_adapter extends BaseAdapter {

    private final Activity context;
    private final String [] title;
    private final String [] datee;
    private final String [] time;

    private final Integer [] images;

    public listview_adapter(Activity context, String[] title, String[] datee, String[] time, Integer[] images) {
        this.context = context;
        this.title = title;
        this.datee = datee;
        this.time = time;
        this.images = images;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();

        View rowview=inflater.inflate(R.layout.listview_custom_layout,null,true);

        TextView txt=rowview.findViewById(R.id.txt1);
        TextView date=rowview.findViewById(R.id.editTextDate);
        TextView time1=rowview.findViewById(R.id.editTextTime);
        ImageView img1=rowview.findViewById(R.id.image1);

        txt.setText(title[position]);
        date.setText(datee[position]);
        time1.setText(time[position]);
        img1.setImageResource(images[position]);

        return  rowview;
    }
}
