package com.springboot.springbootdemo.zyr.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.springboot.springbootdemo.zyr.pojo.Customer;
import com.springboot.springbootdemo.zyr.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping(value = {"/helloWord"},method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("HelloWord");
        return mv;
    }

    @RequestMapping("/showCustomer")
    @ResponseBody
    public Customer toIndex(HttpServletRequest request, Model model){
        String customerId = request.getParameter("id");
        Customer customer = customerService.getCustomerById(customerId);
        System.out.println("--------------customer----------------"+customer);
        return customer;
    }
}
