package com.firstassignment.customer.request;

public class CreatCustomerRequest {

    private String name;
    private String lastName;
    private String city;
    private String note;


    public CreatCustomerRequest(){}

    public CreatCustomerRequest(String name, String lastName, String city, String note) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }




}
