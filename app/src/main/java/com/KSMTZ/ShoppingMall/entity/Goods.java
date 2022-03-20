package com.KSMTZ.ShoppingMall.entity;

public class Goods {
    private int goodsid;//商品编号
    private String goodsname;//商品名
    private String goodsphoto;//商品图片
    private double goodsprice;//商品价格
    private String goodstype;//商品类型
    private String goodsintroduce;//商品简介

    public Goods(int goodsid, String goodsphoto, String goodsname, double goodsprice, String goodstype, String goodsintroduce) {
        this.goodsid = goodsid;
        this.goodsphoto = goodsphoto;
        this.goodsname = goodsname;
        this.goodsprice = goodsprice;
        this.goodstype = goodstype;
        this.goodsintroduce = goodsintroduce;
    }


    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsphoto() {
        return goodsphoto;
    }

    public void setGoodsphoto(String goodsphoto) {
        this.goodsphoto = goodsphoto;
    }

    public double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public String getGoodsintroduce() {
        return goodsintroduce;
    }

    public void setGoodsintroduce(String goodsintroduce) {
        this.goodsintroduce = goodsintroduce;
    }
}
