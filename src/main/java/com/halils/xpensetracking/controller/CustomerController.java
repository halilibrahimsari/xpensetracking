package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/customers")
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping(value = "/customers/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping(value = "/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id) {
        return customerService.findCustomerById(id);
    }

    @DeleteMapping(value = "/customer/{id}")
    public void deleteCustomerById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
    }

    @PutMapping(value = "/customer/{id}")
    public void updateCustomerById(@PathVariable long id, @RequestBody Customer customer) {
        customerService.updateCustomerById(id, customer);
    }


}
