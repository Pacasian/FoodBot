package com.example.sunith.cloudprint.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sunith.cloudprint.R;

/**
 Created by sumith on 09-10-2017.
 */

public class AboutME extends android.support.v4.app.Fragment {
    public AboutME()
    {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.aboutme, container, false);

    }


}
