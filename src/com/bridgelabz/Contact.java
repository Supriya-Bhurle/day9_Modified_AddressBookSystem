package com.bridgelabz;

public class Contact {
    private String name;
    private  String SurName;
    private String address;
    private  String city;
    private String state;
    private String phoneNo;
    private String zipCode;
    private String gmail ;
    public Contact() {
    }

    public Contact(String name, String SurName, String address, String city, String state, String phoneNo, String zipCode, String gmail) {
        this.name = name;
        this.SurName = SurName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNo = phoneNo;
        this.zipCode = zipCode;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return SurName;
    }

    public void setLastName(String lastName) {
        this.SurName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getGmail() {

        return gmail;
    }

    public void setGmail(String gmail) {

        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastName='" +SurName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';

}}
