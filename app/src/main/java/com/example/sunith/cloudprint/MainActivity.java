package com.example.sunith.cloudprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView phone;
    ImageView earth;
    ImageView serch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splashThread= new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int wait=0;
                    while(wait<1000)
                    {
                        sleep(100);
                        wait+=100;
                    }
                } catch (InterruptedException e) {

                }finally {
                    finish();
                    Intent n=new Intent(MainActivity.this,Registation.class);
                    startActivity(n);
                }
            }
        };
        splashThread.start();
    }

    }

