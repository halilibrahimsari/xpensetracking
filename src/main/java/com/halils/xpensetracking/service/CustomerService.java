package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String findAllCustomers (){
        return "allCustomers";
    }
}
