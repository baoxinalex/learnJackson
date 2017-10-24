package com.company;

import java.util.List;

/**
 * Created by BaoX on 23/10/2017.
 */
public class AllCustomers {
    private List<Customer> customer;
    //private ResponseStatus responseStatus;

    public List<Customer> getCustomer(){
        return customer;
    }
    public void setCustomer(List<Customer> input){
        this.customer = input;
    }
//    public ResponseStatus getResponseStatus(){
//        return responseStatus;
//    }
//    public void setResponseStatus(ResponseStatus input){
//        this.responseStatus = input;
//    }
}
