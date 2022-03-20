package com.KSMTZ.ShoppingMall.view.view.good;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.KSMTZ.ShoppingMall.common.Shopping;
import com.KSMTZ.ShoppingMall.dao.GoodsDao;
import com.KSMTZ.ShoppingMall.entity.Goods;
import com.forget.afinally.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

public class GoodsDetailActivity extends Activity {
    private ImageView imageView,return_back;
    private TextView goodsname,price,type,introduce,num,costprice;
    private Button jia,jian;//加减按钮
    private TextView bt_buy,bt_addshoppingcar;// 立即购买，加入购物车
    private Intent intent;
    private int count=1;//默认初始为1
    private Goods goods;

    private GoodsDao goodsDao;

    private int max;
    private int id;


    BitmapFactory.Options decodingOptions = new BitmapFactory.Options();
    DisplayImageOptions m_options =
            new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.drawable.default_image)
                    .decodingOptions(decodingOptions)
                    .imageScaleType(ImageScaleType.NONE)
                    .build();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodsdetial);
        init();//初始化
        intent = getIntent();
        id = intent.getIntExtra("goodsid", 0);//获取goodsid


        goodsDao = new GoodsDao(this);//用来查询商品的信息
        goods = goodsDao.queryGoodsById(id);//获取商品信息

        ImageLoader.getInstance().displayImage(goods.getGoodsphoto(), imageView, m_options);//加载图片
        goodsname.setText(goods.getGoodsname());//设置商品名
        price.setText("￥" + goods.getGoodsprice() + "");//设置商品价格


        costprice.setText("￥30 ");//设置原价
        costprice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中间横线
        type.setText(goods.getGoodstype());
        introduce.setText(goods.getGoodsintroduce());
        //返回商品列表     需要传回商品类型，否则会出错
        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoodsDetailActivity.this, com.KSMTZ.ShoppingMall.view.view.good.Goodsliebiao.class);
                intent.putExtra("type", goods.getGoodstype());
                startActivity(intent);
            }
        });

        //点击“+”
        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = Integer.parseInt(num.getText().toString().trim());
                jian.setBackgroundResource(R.color.colorPrimary);
                num.setText(String.valueOf(++count));

            }
        });

        //点击“-”
        jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = Integer.parseInt(num.getText().toString().trim());
                //判断数字是不是大于等于1
                if (count > 1) {
                    num.setText(String.valueOf(--count));
                    jian.setBackgroundResource(R.color.colorPrimary);
                } else {
                    jian.setBackgroundResource(R.color.colorPrimaryDark);
                }
            }
        });
        //点击立刻购买
        bt_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //若用户名为空，则跳到登陆界面
                //若登陆了，则向订单数据库里出入订单信息


            }
        });

    }

    public void joinToShopping(View view){
        goodsDao = new GoodsDao(this);//用来查询商品的信息
        goods = goodsDao.queryGoodsById(id);//获取商品信息
        Shopping.products.add(goods);
        Toast.makeText(this,"商品添加成功",Toast.LENGTH_SHORT).show();
        goodsDao.insert();
    }

    //初始化，获德各个组件
    private  void init(){

        costprice=(TextView)findViewById(R.id.goods_CostPrice);
        imageView=(ImageView) findViewById(R.id.iv_goodsdetail);
        goodsname=(TextView) findViewById(R.id.goods_title);
        price=(TextView) findViewById(R.id.goods_Price);
        type=(TextView) findViewById(R.id.goods_type);
        introduce=(TextView) findViewById(R.id.goods_introduce);
        num=(TextView) findViewById(R.id.num);
        jia=(Button) findViewById(R.id.jia);
        jian=(Button) findViewById(R.id.jian);
        bt_buy=(TextView) findViewById(R.id.bt_buy);
        bt_addshoppingcar=(TextView) findViewById(R.id.bt_addshoppingcar);
        return_back=(ImageView) findViewById(R.id.return_back);





    }
}
