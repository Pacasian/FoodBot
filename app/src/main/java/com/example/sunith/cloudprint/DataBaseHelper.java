package com.example.sunith.cloudprint;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sunith on 15-01-2018.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "Student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME ";
    public static final String COL_3 = "ROLL";
    public static final String COL_4 = "BRANCH";
    public static final String COL_5 = "SEC";
    public static final String COL_6 = "YEAR";
    public static final String COL_7 = "SEM";
    public static final String COL_8 = "CONTACT";
    public static final String COL_9 = "EMAIL";
    public static final String COL_10 = "PASSWORD";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ,NAME TEXT,ROLL INTEGER,BRANCH TEXT, SEC TEXT, YEAR INTEGER,SEM INTEGER,CONTACT INTEGER,EMAIL TEXT,PASSWORD TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    public boolean insertData(String name, String roll, String branch, String sec, String year, String sem, String contact, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, roll);
        contentValues.put(COL_4, branch);
        contentValues.put(COL_5, sec);
        contentValues.put(COL_6, year);
        contentValues.put(COL_7, sem);
        contentValues.put(COL_8, contact);
        contentValues.put(COL_9, email);
        contentValues.put(COL_10, password);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " +TABLE_NAME, null);
        return res;

    }
    public Integer deleteData(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        int i= db.delete(TABLE_NAME,"ID =?",new String[]{id});
        return i;
    }
}

