package com.example.sunith.cloudprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ODconform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odconform);
        WebView webView1 =(WebView)findViewById(R.id.targetod);
        webView1.setInitialScale(1);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setLoadWithOverviewMode(true);
        webView1.getSettings().setUseWideViewPort(true);
        webView1.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView1.setScrollbarFadingEnabled(false);

        webView1.loadUrl("https://www.theguardian.com/lifeandstyle/women");

    }
}
