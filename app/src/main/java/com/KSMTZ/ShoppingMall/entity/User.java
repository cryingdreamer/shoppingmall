package com.KSMTZ.ShoppingMall.entity;

public class User {
    private String Username;
    private String Password;
    private String Age;
    private String Phone;
    private String Address;
    //储存用户信息
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public User(String Username,String Password,String Age,String Phone,String Address){
        this.Address = Address;
        this.Age = Age;
        this.Password = Password;
        this.Phone = Phone;
        this.Username = Username;
    }
}
