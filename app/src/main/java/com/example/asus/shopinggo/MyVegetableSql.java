package com.example.asus.shopinggo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/27.
 */
public class MyVegetableSql {
    private SQLiteDatabase db;

    public MyVegetableSql(SQLiteDatabase db) {
        this.db = db;
    }
    public void add(Vegetables vegetables){
        db.execSQL("insert into vegetable(image,name,price) values(?,?,?)",
                new Object[]{vegetables.getImage(),vegetables.getName(),vegetables.getPrice()});
    }
    public List<Vegetables> quuery(){
        List<Vegetables> list=new ArrayList<>();
        Cursor cursor=db.rawQuery("select * from vegetables",null);
        if(cursor.moveToNext()){
            int image=cursor.getInt(cursor.getColumnIndex("image"));
            String name=cursor.getString(cursor.getColumnIndex("name"));
            double price=cursor.getDouble(cursor.getColumnIndex("price"));
            Vegetables vegetables=new Vegetables(image,name,price);
            list.add(vegetables);
        }
        return list;
    }
}

