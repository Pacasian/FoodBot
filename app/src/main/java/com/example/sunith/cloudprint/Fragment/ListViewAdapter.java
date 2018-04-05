/**package com.example.sunith.cloudprint.Fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sunith.cloudprint.R;

/**
 * Created by sunith on 15-10-2017.
 */

/**public class ListViewAdapter extends BaseAdapter {
    Context context;
    String[] ver;
    LayoutInflater inflater;
    public ListViewAdapter(Context context,String[] mobile)
    {
        this.context=context;
        this.ver=mobile;
    }
    @Override
    public int getCount() {
        return ver.length;
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
        TextView textView = null;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.myfile_listview,parent,false);
        textView.setText(ver[position]);
        return itemView;
    }
}*/
