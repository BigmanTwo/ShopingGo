package com.example.asus.shopinggo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Asus on 2016/4/27.
 */
public class MySqlOpen extends SQLiteOpenHelper {
    public MySqlOpen(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //自增型需用下划线开始
        db.execSQL("create table if not exists vagetable (_id Integer primery key ATOUINCREMENT,image int,name varchar(20),price double )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
