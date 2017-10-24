package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BaoX on 23/10/2017.
 */
public class Customer{
    private String id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
    private List<Customer> customer = new ArrayList();

    public String getId(){
        return id;
    }
    public void setId(String input){
        this.id = input;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String input){
        this.companyName = input;
    }
    public String getContactName(){
        return contactName;
    }
    public void setContactName(String input){
        this.contactName = input;
    }
    public String getContactTitle(){
        return contactTitle;
    }
    public void setContactTitle(String input){
        this.contactTitle = input;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String input){
        this.address = input;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String input){
        this.city = input;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public void setPostalCode(String input){
        this.postalCode = input;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String input){
        this.country = input;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String input){
        this.phone = input;
    }
    public String getFax(){
        return fax;
    }
    public void setFax(String input){
        this.fax = input;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
