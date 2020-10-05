package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.model.Expense;
import com.halils.xpensetracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/customers/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id) {
        return customerService.findCustomerById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
    public void deleteCustomerById(@PathVariable long id){
        customerService.deleteCustomerById(id);
    }

}
