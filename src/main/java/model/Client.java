package model;

import enums.SexTypeEnum;

public class Client extends Person {
    private String id;
    private String email;
    private String city;
    private String password;
    private int phoneNum;

    public Client() {
    }

    public Client(String id,String email, String city, String password, int phonenumber) {
        this.id=id;
        this.email = email;
        this.city = city;
        this.password = password;
        this.phoneNum = phonenumber;
    }

    public Client(String firstname, String lastname, int age, SexTypeEnum sex, String id,String email, String city, String password, int phonenumber) {
        super(firstname, lastname, age, sex);
        this.id=id;
        this.email = email;
        this.city = city;
        this.password = password;
        this.phoneNum = phonenumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Client{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}

