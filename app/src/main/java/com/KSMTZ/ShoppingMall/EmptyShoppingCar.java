package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.forget.afinally.R;
public class EmptyShoppingCar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_shopping_car);
    }
    public void ShoppingCar_to_mainweb(View view){
        Intent intent = new Intent(EmptyShoppingCar.this, com.KSMTZ.ShoppingMall.Mainweb.class);
        startActivity(intent);
    }
}
