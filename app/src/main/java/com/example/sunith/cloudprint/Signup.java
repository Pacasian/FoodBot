package com.example.sunith.cloudprint;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.FileNotFoundException;

/**
 * Created by sunith on 09-10-2017.
 */

public class Signup extends AppCompatActivity  {
    DataBaseHelper myDb;
    Button btnsavep;
    EditText ename;
    EditText erollnumber;
    EditText ebranch;
    EditText esection;
    EditText eyear;
    EditText eseme;
    EditText econtactno;
    EditText eemail;
    EditText epassword;
    Spinner sp1;
    Spinner sp2;
    String name,roll,branch,sec,year,sem,contact,email,password;
    ImageView targetimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        myDb=new DataBaseHelper(this);
        sp1=(Spinner)findViewById(R.id.spin1);
        String [] day={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        sp2=(Spinner)findViewById(R.id.spin2);
        String [] month={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,day);
        sp1.setAdapter(adapter1);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,month);
        sp2.setAdapter(adapter2);
        ename=(EditText)findViewById(R.id.proname);
                erollnumber=(EditText)findViewById(R.id.proroll);
        ebranch=(EditText)findViewById(R.id.probranch);
                esection=(EditText)findViewById(R.id.prosection);
        eyear=(EditText)findViewById(R.id.proyear);
                eseme=(EditText)findViewById(R.id.proseme);
        econtactno=(EditText)findViewById(R.id.procontact);
                eemail=(EditText)findViewById(R.id.proemail);
        epassword=(EditText)findViewById(R.id.propassword);
        btnsavep=(Button)findViewById(R.id.btnsaveinfo);
        btnsavep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ClickME();
            }
        });
        targetimage = (ImageView)findViewById(R.id.targetprofile);

        }
        private void ClickME(){
            name=ename.getText().toString();
            roll=erollnumber.getText().toString();
            branch=ebranch.getText().toString();
            sec=esection.getText().toString();
            year=eyear.getText().toString();
            sem=eseme.getText().toString();
            contact=econtactno.getText().toString();
            email=eemail.getText().toString();
            password=epassword.getText().toString();
            Boolean result=myDb.insertData(name,roll,branch,sec,year,sem,contact,email,password);
            if (result==true )
            {
                Toast.makeText(this, "Information of the user is saved", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "Process Failed", Toast.LENGTH_LONG).show();
            }
        }
       public void targetpic(View v){
           Intent intent = new Intent(Intent.ACTION_PICK,
                   android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
           startActivityForResult(intent, 0);
       }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            Uri targetUri = data.getData();

            Bitmap bitmap;
            try {
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
                targetimage.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
        