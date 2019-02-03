package com.springboot.springbootdemo.zyr.service.impl;

import com.springboot.springbootdemo.zyr.dao.CustomerDao;
import com.springboot.springbootdemo.zyr.pojo.Customer;
import com.springboot.springbootdemo.zyr.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public Customer getCustomerById(String customerId) {
        return customerDao.selectByPrimaryKey(customerId);
    }

    @Override
    public boolean addCustomer(Customer record) {
        customerDao.insertSelective(record);
        return true;

    }
}
