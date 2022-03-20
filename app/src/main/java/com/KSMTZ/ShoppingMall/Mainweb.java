package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.KSMTZ.ShoppingMall.dao.GoodsDao;
import com.KSMTZ.ShoppingMall.view.view.good.GoodsSearch;
import com.KSMTZ.ShoppingMall.view.view.good.Goodsliebiao;
import com.forget.afinally.R;

public class Mainweb extends Activity {
    private TextView food;
    private TextView mumandbaby;
    private TextView skin;
    private TextView spin;
    private TextView snacks;
    private TextView daily;
    private ImageView bt_search;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainweb);
        GoodsDao goodsDao=new GoodsDao(Mainweb.this);
        goodsDao.insert();
        food = findViewById(R.id.imageView1);
        mumandbaby = findViewById(R.id.imageView2);
        skin = findViewById(R.id.imageView3);
        spin = findViewById(R.id.imageView4);
        snacks = findViewById(R.id.imageView5);
        daily = findViewById(R.id.imageView6);
        bt_search= findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.ET1);
        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","食品区");
                startActivity(intent);
            }
        });
        mumandbaby.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","母婴区");
                startActivity(intent);
            }
        });
        skin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","护肤品区");
                startActivity(intent);
            }
        });
        spin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","纺织区");
                startActivity(intent);
            }
        });
        snacks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","零食区");
                startActivity(intent);
            }
        });
        daily.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainweb.this,Goodsliebiao.class);
                intent.putExtra("type","日用品区");
                startActivity(intent);
            }
        });
        bt_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String goodsname=editText.getText().toString();
                Intent intent=new Intent(Mainweb.this, GoodsSearch.class);
                intent.putExtra("goodsname",goodsname);
                startActivity(intent);

            }
        });
    }
    public void toShoppingCar(View view){
        Intent intent = new Intent(Mainweb.this, com.KSMTZ.ShoppingMall.ShoppingCar.class);
        startActivity(intent);
    }
    public void toWeather(View view){
        Intent intent = new Intent(Mainweb.this,HttpActivity.class);
        startActivity(intent);
    }
    public void OnClickit(View view) {
        Intent intent = new Intent(Mainweb.this,Login.class);
        //intent.setClass(Mainweb.this,Login.class);
        startActivity(intent);
    }
    public void OnclickitToMainweb(View view){
//        Intent intent = new Intent(Mainweb.this,Mainweb.class);
//        //intent.setClass(Mainweb.this,Login.class);
//        startActivity(intent);
    }


}
