package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.dto.CustomerDto;
import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customers")
    public List<CustomerDto> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping(value = "/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping(value = "/customers/{id}")
    public CustomerDto getCustomerById(@PathVariable long id) {
        return customerService.findCustomerById(id);
    }

    @GetMapping(value = "/customers/{id}/expenses")
    public Object getCustomerByIdExpenses(@PathVariable long id) {
        return getCustomerById(id).getExpenses();
    }

    @DeleteMapping(value = "/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
    }

    @PutMapping(value = "/customers")
    public CustomerDto updateCustomerById(@RequestBody Customer customer) {
        return customerService.updateCustomerById(customer);
    }


}
