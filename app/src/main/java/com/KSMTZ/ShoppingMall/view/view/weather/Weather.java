package com.KSMTZ.ShoppingMall.view.view.weather;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Weather extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Thread(new MyHttpRequest()).start();
    }
    private class MyHttpRequest implements Runnable{

        @Override
        public void run() {
            try {

                URL url=new URL("http://v.juhe.cn/weather/index?format=2&key=f421a4c763d10b6bf18c64957872a9cf&cityname="+URLEncoder.encode("济南","UTF-8"));
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();

                connection.setConnectTimeout(100000);
                connection.setRequestMethod("GET");
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.connect();
                if(connection.getResponseCode()!=HttpURLConnection.HTTP_BAD_REQUEST){
                    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String temp="";
                    final StringBuilder response=new StringBuilder();
                    while ((temp=bufferedReader.readLine())!=null){
                        response.append(temp);
                    }

                    Log.d(MyHttpRequest.class.toString(),response.toString());

                    bufferedReader.close();
                }
                connection.disconnect();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
