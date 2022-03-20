package com.KSMTZ.ShoppingMall.DButil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper extends SQLiteOpenHelper {

    public SQLiteDatabase db;//数据库
    public static final int DB_version=1;
    public String TABLE_NAME="goodstb";//商品表
    public static final String DB_NAME="goods.db";

    public MyOpenHelper(Context context){
        super (context,DB_NAME,null,DB_version);
        db=getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        //AUTOINCREMENT 每存储一个新行，就会生成一个唯一的整数
        db.execSQL("CREATE TABLE "+TABLE_NAME+"(goodsid integer primary key autoincrement,"
                +"title text not null,"
                +"introduce text not null,"
                +"price integer not null,"
                +"photo text not null,"
                +"type text not null)"
        );

    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,int i,int i1){
        sqLiteDatabase.execSQL(" ");
        onCreate(sqLiteDatabase);
    }
}
