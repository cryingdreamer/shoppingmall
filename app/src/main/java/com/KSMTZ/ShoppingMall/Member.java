package com.KSMTZ.ShoppingMall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.forget.afinally.R;
public class Member extends Activity {
    private TextView username;
    private TextView password;
    private TextView age;
    private TextView phone;
    private TextView address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);
        username = (TextView)findViewById(R.id.username);
        password = (TextView)findViewById(R.id.password);
        age = (TextView)findViewById(R.id.password);
        phone = (TextView)findViewById(R.id.phone);
        address = (TextView)findViewById(R.id.address);
        Button update_info = findViewById(R.id.update_info);
        update_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Member.this,ChangeInfo.class));
                finish();
            }
        });
    }
    public void MyOnclick(View view){
        Intent intent = new Intent(Member.this,Loginning.class);
        startActivity(intent);
    }
    public void change(View view){
        username.setText("");
        password.setText("");
        age.setText("");
        phone.setText("");
        address.setText("");
    }
}
