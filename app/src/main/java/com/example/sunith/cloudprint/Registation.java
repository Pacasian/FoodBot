package com.example.sunith.cloudprint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sunith on 07-10-2017.
 */

public class Registation extends AppCompatActivity implements View.OnClickListener {

    Button btnlogin;
    EditText edmail;
    EditText edpass;
    Button signin;
    EditText txinvalid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registation);
        btnlogin=(Button)findViewById(R.id.login);
        edmail=(EditText)findViewById(R.id.email);
        edpass=(EditText)findViewById(R.id.password);
        signin=(Button) findViewById(R.id.lick);
        btnlogin.setOnClickListener(this);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnew =new Intent(Registation.this,Signup.class);
                startActivity(intentnew);
            }
        });
    }

    @Override
    public void onClick(View v) {int i=0;
        if((edmail.getText().toString()).equals("16113086"))
        {
            i++;
        }
        if ((edpass.getText().toString()).equals("kuttanyo"))
        {
            i++;
        }
        int j=0;
        if(i==2)
        {
            Intent n=new Intent(this,Home.class);
            startActivity(n);
        }
        else{
            edpass.setHint("Invalid password....");
            edpass.setError("invalid");
            edmail.setHint("Invalid Email.....");
            edmail.setError("invalid");
            Intent intent5 =new Intent(this,Home.class);
            startActivity(intent5);
        }


    }

}
