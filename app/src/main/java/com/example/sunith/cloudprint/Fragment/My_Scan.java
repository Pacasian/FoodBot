package com.example.sunith.cloudprint.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sunith.cloudprint.R;
import com.example.sunith.cloudprint.printpage;

/**
 * Created by sunith on 08-10-2017.
 */

public class My_Scan extends  android.support.v4.app.Fragment implements View.OnClickListener {
    String[] ver={"Maths.pdf","Daa.pdf","Digital System.pdf","Java Assigment.pdf","algorithm.pdf","Sumith.pdf","Work_shop_sheet.pdf"};
    int [] imvg={R.drawable._pdf,R.drawable._pdf,R.drawable._pdf,R.drawable._pdf,R.drawable._pdf,R.drawable._pdf,R.drawable._pdf};
    ListView ls;
    /**ListViewAdapter adapter;*/
    public My_Scan() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.my_scan, container, false);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(getActivity().getApplication(),printpage.class);
        startActivity(intent);
    }
}




