package com.example.tmlab;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLdatabase extends SQLiteOpenHelper {

    private Context context ;
    private static final String DATABASE_NAME = "dotaitem.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "dota" ;
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_TITLE = "item_name";
    private static final String COLUMN_QUANTITY = "quantity";

    public SQLdatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION );
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_QUANTITY + "INTEGER);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
