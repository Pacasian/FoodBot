package com.example.sunith.cloudprint;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sunith on 09-01-2018.
 */

public class Profile extends AppCompatActivity {
    DataBaseHelper myDb;
    Button btnverify;
    private Toolbar Toolbar1;
    Button btnDelete;
    EditText edelete;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        myDb=new DataBaseHelper(this);
        Toolbar1 =(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(Toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        btnverify=(Button)findViewById(R.id.btnpassshow);
        btnDelete=(Button)findViewById(R.id.bttndelete);
        edelete=(EditText)findViewById(R.id.numberdelete);
        txt =(TextView)findViewById(R.id.nameshow);
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("HitsApp");
        btnverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CLICKME();
            }
        });
    }
    @Override
    public void onBackPressed() {

        Intent moveback =
                new Intent(Profile.this, Home.class);
        startActivity(moveback);
        finish();

    }
    private void CLICKME(){
        Cursor res=myDb.getAllData();
        StringBuffer stringBuffer2=new StringBuffer();
        StringBuffer stringBuffer3=new StringBuffer();
        StringBuffer stringBuffer4=new StringBuffer();
        if (res!=null&&res.getCount()>0) {
            while (res.moveToNext()){
                stringBuffer4.append(res.getString(0)+"\n");
                stringBuffer2.append("Name          : "+res.getString(1)+"\n");
                stringBuffer2.append("Roll number   : "+res.getString(2)+"\n");
                stringBuffer2.append("Branch        : "+res.getString(3)+"\n");
                stringBuffer2.append("Section       : "+res.getString(4)+"\n");
                stringBuffer2.append("Year of Birth : "+res.getString(5)+"\n");
                stringBuffer2.append("Semester      : "+res.getString(6)+"\n");
                stringBuffer2.append("Contact No    : "+res.getString(7)+"\n");
                stringBuffer2.append("Email Address : "+res.getString(8)+"\n");
                stringBuffer3.append(res.getString(9)+"\n");

            }
            txt.setText(stringBuffer2.toString());
            Toast.makeText(this, " data", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this, "NO data", Toast.LENGTH_SHORT).show();
        }
    }
    public void btndelete(View v)
    {
        String id =edelete.getText().toString();
        int result =myDb.deleteData(id);
        Toast.makeText(this," Row has been deleted", Toast.LENGTH_SHORT).show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu1) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profilemenu, menu1);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item1){
        int id1= item1.getItemId();
        if (id1==R.id.complain)
        {
            Intent intentcomplaint=new Intent(this,ComplainBox.class);
            startActivity(intentcomplaint);
        } else if(id1==R.id.conatct){

        }else if(id1==R.id.exam){

        } else if(id1==R.id.od){
            Intent intentod=new Intent(this,ODconform.class);
            startActivity(intentod);
        }else if(id1==R.id.help){

        }
        return true;
    }

}
