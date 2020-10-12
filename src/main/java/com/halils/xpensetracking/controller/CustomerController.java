package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.dto.CustomerDto;
import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/customers")
    public List<CustomerDto> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping(value = "/customers/add")
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.addCustomer(customerDto);
    }

    @GetMapping(value = "/customer/{id}")
    public CustomerDto getCustomerById(@PathVariable long id) {
        return customerService.findCustomerById(id);
    }

    @DeleteMapping(value = "/customer/{id}")
    public void deleteCustomerById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
    }

    @PutMapping(value = "/customer/{id}")
    public CustomerDto updateCustomerById(@PathVariable long id, @RequestBody CustomerDto customer) {
        return customerService.updateCustomerById(id, customer);
    }


}
