package com.KSMTZ.ShoppingMall.DButil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MydbOpenHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="test.db";//数据库的文件名
    private static final int DB_VERSION=2;//数据库的版本
    public MydbOpenHelper(Context context){
        super(context,DB_NAME,null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //在onCreate()方法中创建数据库对象
        // db.execSQL("create table user(id integer primary key autoincrement)");
        com.KSMTZ.ShoppingMall.DButil.Userdb.createTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //升级数据库时执行
        db.execSQL("drop table user");
        onCreate(db);
    }
}
