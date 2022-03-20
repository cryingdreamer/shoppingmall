package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.forget.afinally.R;
public class My extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
    }
    public void toLogin(View view) {
        Intent intent = new Intent(My.this,Login.class);
        //intent.setClass(Mainweb.this,Login.class);
        startActivity(intent);
    }
    public void toMainweb(View view) {
        Intent intent = new Intent(My.this,Mainweb.class);
        //intent.setClass(Mainweb.this,Login.class);
        startActivity(intent);
    }
}
