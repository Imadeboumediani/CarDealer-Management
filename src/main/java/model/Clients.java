package model;

import enums.SexTypeEnum;

public class Clients extends Person {
    private String email;
    private String city;
    private String password;
    private int phoneNum;

    public Clients() {
    }

    public Clients(String email, String city, String password, int phonenumber) {
        this.email = email;
        this.city = city;
        this.password = password;
        this.phoneNum = phonenumber;
    }

    public Clients(String firstname, String lastname, int age, SexTypeEnum sex, String email, String city, String password, int phonenumber) {
        super(firstname, lastname, age, sex);
        this.email = email;
        this.city = city;
        this.password = password;
        this.phoneNum = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}

