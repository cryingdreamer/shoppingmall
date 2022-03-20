package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.forget.afinally.R;

public class Loginning extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logining);
    }

    public void back(View view){
        startActivity(new Intent(Loginning.this, com.KSMTZ.ShoppingMall.Mainweb.class));
        finish();
    }

    public void Tologin(View view){
        Intent intent = new Intent(Loginning.this,Login.class);
        startActivity(intent);
    }
    public void Tomainweb(View view){
        Intent intent = new Intent(Loginning.this, com.KSMTZ.ShoppingMall.Mainweb.class);
        startActivity(intent);
    }
    public void Toweather(View view){
        Intent intent = new Intent(Loginning.this,HttpActivity.class);
        startActivity(intent);
    }
    public void ToShoppingcar(View view){
        Intent intent = new Intent(Loginning.this, com.KSMTZ.ShoppingMall.ShoppingCar.class);
        startActivity(intent);
    }
    public void message(View view){
        Intent intent = new Intent(Loginning.this,Member.class);
        startActivity(intent);
    }
}
