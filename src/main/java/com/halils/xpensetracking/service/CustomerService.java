package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Category;
import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer (Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers (){
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(long id){
        return customerRepository.findById(id);
    }

    public void deleteCustomerById (long id){
        customerRepository.deleteById(id);
    }

    public void updateCustomerById(long id, Customer customer) {
        if (customerRepository.findById(id).isPresent()) {
            Customer updatedCustomer = customerRepository.findById(id).get();

            updatedCustomer.setFirstName(customer.getFirstName());
            updatedCustomer.setLastName(customer.getLastName());
            customerRepository.save(updatedCustomer);
        } else {
            System.out.println("Couldn't find customer with this ID");
        }
    }
}
