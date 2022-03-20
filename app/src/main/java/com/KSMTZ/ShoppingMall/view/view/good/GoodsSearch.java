package com.KSMTZ.ShoppingMall.view.view.good;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.KSMTZ.ShoppingMall.Mainweb;
import com.KSMTZ.ShoppingMall.adapter.GoodsAdapter;
import com.KSMTZ.ShoppingMall.dao.GoodsDao;
import com.KSMTZ.ShoppingMall.entity.Goods;
import com.forget.afinally.R;

import java.util.List;

public class GoodsSearch extends Activity {
    private ListView lv_searchList;
    private TextView search_tv;
    private Intent intent;
    private ImageView back;
    private String goodsname;
    private List<Goods> list;
    private GoodsAdapter goodsAdapter;
    private GoodsDao goodsDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        back=(ImageView)findViewById(R.id.return_back);
        lv_searchList=(ListView) findViewById(R.id.lv_goodssearch);
        search_tv = (TextView)findViewById(R.id.search_TV);
        //主页查询
        goodsDao=new GoodsDao(GoodsSearch.this);
        intent=getIntent();
        goodsname=intent.getStringExtra("goodsname");
        initData();
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(GoodsSearch.this,Mainweb.class);
                startActivity(intent2);
            }
        });
    }
    private void initData(){
        list=goodsDao.searchGoods(goodsname);
        if(list.size()>0){
            goodsAdapter=new GoodsAdapter(list,GoodsSearch.this);
            lv_searchList.setAdapter(goodsAdapter);
            lv_searchList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    intent=new Intent(GoodsSearch.this,GoodsDetailActivity.class);
                    int goodsId=list.get(i).getGoodsid();
                    intent.putExtra("goodsid",goodsId);
                    startActivity(intent);
                }
            });
        }else{
            lv_searchList.setVisibility(View.GONE);
            search_tv.setVisibility(View.VISIBLE);
        }


    }
}
