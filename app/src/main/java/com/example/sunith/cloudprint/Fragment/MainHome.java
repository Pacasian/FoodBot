package com.example.sunith.cloudprint.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.sunith.cloudprint.R;

/**
 * Created by sunith on 08-01-2018.
 */

public class MainHome extends android.support.v4.app.Fragment {
    public MainHome()
    {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.mainhome, container, false);
                return rootView;
    }


}


