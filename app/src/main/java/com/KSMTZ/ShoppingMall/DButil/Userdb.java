package com.KSMTZ.ShoppingMall.DButil;

import android.database.sqlite.SQLiteDatabase;

public class Userdb {
    public static boolean createTable(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("create table u_user(username text primary key ,password text,age text,phone text,address text)");
        return true;
    }
}
