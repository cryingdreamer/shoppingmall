package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.KSMTZ.ShoppingMall.dao.UserDao;
import com.forget.afinally.R;

public class Login extends Activity {
    private UserDao userDao;
    private EditText tvUsername;
    private EditText tvPassword;
    private Button ivLogin;
    private int flag = -10;
    //登录页面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //获取用用输入的userName passWord
        tvUsername = (EditText) findViewById(R.id.tvUsername);
        tvPassword = (EditText) findViewById(R.id.etPassword);
        ivLogin =  findViewById(R.id.ivLogin);

        userDao = new UserDao(this);

//        ivLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String user = tvUsername.getText().toString();
//                String pass = tvPassword.getText().toString();
//                flag = userDao.login(user, pass);
//            }
//        });
    }
    public void Return(View view){
        Intent intent = new Intent(Login.this, com.KSMTZ.ShoppingMall.Mainweb.class);
        startActivity(intent);
    }
    public void Login(View v) {
        String user = tvUsername.getText().toString();
        String pass = tvPassword.getText().toString();
        flag = userDao.login(user, pass);
        switch (flag) {
            case -1:
                Toast.makeText(this,"用户名不存在",Toast.LENGTH_SHORT).show();
                break;
            case 0:
                Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login.this, com.KSMTZ.ShoppingMall.Loginning.class);
                startActivity(intent);
                break;
            case 1:
                Toast.makeText(this,"密码错误",Toast.LENGTH_SHORT).show();
                break;
        }
    }
//    public void Return(View view) {
//
//        if (userDao.login("","")=="") {
//
//        }
//        Intent intent = new Intent(Login.this,Mainweb.class);
//        //intent.setClass(Mainweb.this,Login.class);
//        startActivity(intent);
//    }
    public void toRegister(View view){
        Intent intent = new Intent(Login.this, com.KSMTZ.ShoppingMall.Register.class);
        startActivity(intent);
    }
}
