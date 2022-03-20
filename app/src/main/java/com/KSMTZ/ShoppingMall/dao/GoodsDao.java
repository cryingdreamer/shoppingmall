package com.KSMTZ.ShoppingMall.dao;

import android.content.Context;
import android.database.Cursor;

import com.KSMTZ.ShoppingMall.DButil.MyOpenHelper;
import com.KSMTZ.ShoppingMall.entity.Goods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GoodsDao {
    private MyOpenHelper dbHelp_goods;//数据库
    //private List<Goods> listGoods=new ArrayList<>();
    private Context context;

    public GoodsDao(Context context) {
        this.context=context;
    }


    public void insert() {
        dbHelp_goods=new MyOpenHelper(context);
        dbHelp_goods.db=dbHelp_goods.getWritableDatabase();
        //food
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd2.alicdn.com/imgextra/i2/2206512314688/O1CN01eKUBPZ1kV9NiOiI04_!!2206512314688.jpg','鸡胸肉','食品区','01','69.9')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd4.alicdn.com/imgextra/i4/2283640146/O1CN01qjO4jo1CwuSuXBOpR_!!2283640146.jpg','东北大米','食品区','02','49.9')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd1.alicdn.com/imgextra/i2/2208643180741/O1CN01sLQDDx1HLQ79qgpsK_!!2208643180741.jpg','荔枝','食品区','03','38.9')");
        //2
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd1.alicdn.com/imgextra/i1/2718973887/O1CN01xDKX6d1eaI8E7MK76_!!2718973887.jpg','婴儿床','母婴区','01','489.0')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd4.alicdn.com/imgextra/i3/14157049/O1CN01nncjq421wUUZauq32_!!14157049.jpg','安抚奶嘴','母婴区','02','39.0')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://img.alicdn.com/imgextra/i4/2856145501/O1CN01nEgzdD1qVVOy6z0sW_!!2856145501.jpg','羊奶粉','母婴区','03','1160.0')");
        //3
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd3.alicdn.com/imgextra/i3/2201439266475/O1CN01129FBr1xhbAXG8IzA_!!2201439266475.jpg','面膜','护肤品区','01','398.0')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/3992482107/O1CN015gya001RR35BEKmrX_!!3992482107.jpg_580x580Q90.jpg_.webp','爽肤水','护肤品区','02','868.0')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/2751752618/O1CN01seZAK21VD5TOE3NTf_!!2751752618.jpg_580x580Q90.jpg_.webp','乳液','护肤品区','03','728.0')");
        //4
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd3.alicdn.com/imgextra/i3/2208892028125/O1CN01T8gAS129tIeZKMYhY_!!2208892028125.jpg','猪肉脯','零食区','01','23.9')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i2/125653549/O1CN01MaWotc1c5UDMbyoqK_!!0-saturn_solar.jpg_580x580Q90.jpg_.webp','零食大礼包','零食区','02','28.8')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/113234321/O1CN01qZkoaj1hn3xkzd6Ax_!!0-saturn_solar.jpg_580x580Q90.jpg_.webp','都市牧场口香糖','零食区','03','29.9')");
        //5
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd3.alicdn.com/imgextra/i2/3886771773/O1CN01p2VbK31Oy4pIeXTVy_!!3886771773.jpg','羽绒服','纺织区','01','388.0')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/2687995194/O1CN01Ysb79S1oEtjAJeT13_!!0-item_pic.jpg_580x580Q90.jpg_.webp','裤裙','纺织区','02','298.0')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/821005472/O1CN01M0xUEi1qIDqcPW1Rs_!!821005472.jpg_580x580Q90.jpg_.webp','半身裙','纺织区','03','159.0')");
        //6
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price') values ('https://gd2.alicdn.com/imgextra/i2/2209868219163/O1CN01Xh1czU2HYhn4WalS0_!!2209868219163.jpg','洗发水','日用品区','01','168.0')");

        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/5085611369/O1CN01M6tQtP1Lz2isgQDzR_!!5085611369.jpg_580x580Q90.jpg_.webp','沐浴露','日用品区','02','28.9')");
        dbHelp_goods.db.execSQL("insert into " + dbHelp_goods.TABLE_NAME +
                "('photo','title','type','introduce','price')  values ('https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i1/60495136/O1CN011noKf8BWaT4Yr3k_!!0-saturn_solar.jpg_580x580Q90.jpg_.webp','抽纸','日用品区','03','10.0')");
    }

    //按照ID查询商品
    public Goods  queryGoodsById(int id){
        dbHelp_goods=new MyOpenHelper(context);
        dbHelp_goods.db=dbHelp_goods.getWritableDatabase();
        Goods goods=null;
        List<Goods> arrayList=new ArrayList<Goods>();

        Cursor c=dbHelp_goods.db.query(dbHelp_goods.TABLE_NAME,null,"goodsid=?",new String[]{id+""},null,null,null,null);

        if(c!=null){
            while(c.moveToNext()) {
                String imageURl=c.getString(c.getColumnIndex("photo"));
                String title=c.getString(c.getColumnIndex("title"));
                String introduce=c.getString(c.getColumnIndex("introduce"));
                String type=c.getString(c.getColumnIndex("type"));
                double price=c.getDouble(c.getColumnIndex("price"));
                goods = new Goods(id, imageURl, title, price,type,introduce);
                return goods;
            }

        }
        return null;
    }
    //按照类型查询商品

    public List<Goods> query(String type){
        dbHelp_goods=new MyOpenHelper(context);
        dbHelp_goods.db=dbHelp_goods.getWritableDatabase();
        List listGoods=new ArrayList();
        Cursor c=dbHelp_goods.db.query(dbHelp_goods.TABLE_NAME,null,"type=?",new String[]{type},null,null,null,null);
        if(c!=null){
            while(c.moveToNext()){
                int goodsid=c.getInt(c.getColumnIndex("goodsid"));
                String imageURl=c.getString(c.getColumnIndex("photo"));
                String title=c.getString(c.getColumnIndex("title"));
                String introduce=c.getString(c.getColumnIndex("introduce"));
                double price=c.getDouble(c.getColumnIndex("price"));
                Goods goods=new Goods(goodsid,imageURl,title,price,type,introduce);
                listGoods.add(goods);
            }
            return listGoods;
        }
        else{
            return null;
        }

    }

    public List<Goods> searchGoods(String key) {
        dbHelp_goods=new MyOpenHelper(context);
        dbHelp_goods.db=dbHelp_goods.getWritableDatabase();
        List<Goods> result = new LinkedList<Goods>();
        Cursor c = dbHelp_goods.db.query(dbHelp_goods.TABLE_NAME, null, "title  like ?", new String[]{"%" + key + "%"}, null, null, null, null);
        //Cursor c = dbHelp_goods.db.query(dbHelp_goods.TABLE_NAME, null, "title=?", new String[]{goodsName}, null, null, null, null);
        //String current_sql_sel = "SELECT  * FROM "+dbHelp_goods.TABLE_NAME +" where title like ?";
        //Cursor c = dbHelp_goods.db.rawQuery(current_sql_sel, new String[]{"%"+goodsName+"%"});

        if (c != null) {
            while (c.moveToNext()) {
                int goodsid = c.getInt(c.getColumnIndex("goodsid"));
                String goodsname = c.getString(c.getColumnIndex("title"));
                String imageURl = c.getString(c.getColumnIndex("photo"));
                String introduce = c.getString(c.getColumnIndex("introduce"));
                double price = c.getDouble(c.getColumnIndex("price"));
                String type=c.getString(c.getColumnIndex("type"));
                Goods goods = new Goods(goodsid, imageURl, goodsname, price, type, introduce);
                result.add(goods);
            }

        }
        return result;
    }
}
