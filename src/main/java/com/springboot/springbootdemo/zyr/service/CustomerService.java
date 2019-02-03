package com.springboot.springbootdemo.zyr.service;

import com.springboot.springbootdemo.zyr.pojo.Customer;

public interface CustomerService {


    public Customer getCustomerById(String customerId);

    boolean addCustomer(Customer record);
}
