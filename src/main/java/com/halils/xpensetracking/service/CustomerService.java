package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers (){
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(long id){
        return customerRepository.findById(id);
    }

    public void addCustomer (Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomerById (long id){
        customerRepository.deleteById(id);
    }
}
