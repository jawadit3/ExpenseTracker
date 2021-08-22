package com.example.expensetracker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class MyDBOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="mydb.db";
    public static final int DATABASE_VERSION=1;

    public MyDBOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TransactionTable.SQL_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(TransactionTable.SQL_DELETE);
        onCreate(db);
    }
}
