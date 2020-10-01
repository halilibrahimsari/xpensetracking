package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    String getAllCustomers(){
        return customerService.findAllCustomers();
    }
}
