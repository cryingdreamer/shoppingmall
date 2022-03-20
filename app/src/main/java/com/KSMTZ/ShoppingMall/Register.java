package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.KSMTZ.ShoppingMall.dao.UserDao;
import com.forget.afinally.R;
import com.KSMTZ.ShoppingMall.entity.User;
public class Register extends Activity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private EditText editTextAge;
    private EditText editTextPhone;
    private EditText editTextAddress;
    private UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        editTextUsername = (EditText) findViewById(R.id.etUsername);
        editTextPassword = (EditText) findViewById(R.id.etPassword);
        editTextConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        editTextAge = (EditText) findViewById(R.id.etAge);
        editTextPhone = (EditText) findViewById(R.id.etPhone);
        editTextAddress = (EditText) findViewById(R.id.etAddress);
        userDao = new UserDao(this);
    }
    public void regOnclick(View view){
        Intent intent = new Intent(Register.this,Login.class);
        startActivity(intent);
    }
    public void confirm(View view){
        if (editTextUsername.getText().toString().equals("")){
            Toast.makeText(this,"用户名不能为空",Toast.LENGTH_SHORT).show();
        }
        else if (editTextPassword.getText().toString().equals("")){
            Toast.makeText(this,"密码不能为空",Toast.LENGTH_SHORT).show();
        }
        else if(!(editTextPassword.getText().toString().equals(editTextConfirmPassword.getText().toString()))){
            Toast.makeText(this,"两次密码不相同",Toast.LENGTH_SHORT).show();
        }
        else if (editTextAge.getText().toString().equals("")){
            Toast.makeText(this,"年龄不能为空",Toast.LENGTH_SHORT).show();
        }
        else if (editTextPhone.getText().toString().equals("")){
            Toast.makeText(this,"电话不能为空",Toast.LENGTH_SHORT).show();
        }
        else if (editTextAddress.getText().toString().equals("")){
            Toast.makeText(this,"地址不能为空",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"符合条件,注册成功",Toast.LENGTH_SHORT).show();

//            UserDao userDao = new UserDao(this);
            User user = new User(editTextUsername.getText().toString(),editTextPassword.getText().toString(),editTextAge.getText().toString(),editTextPhone.getText().toString(),editTextAddress.getText().toString());
            userDao.add(user);
            startActivity(new Intent(Register.this,Login.class));
            finish();
        }
    }
}
