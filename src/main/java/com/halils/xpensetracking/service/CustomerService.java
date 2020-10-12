package com.halils.xpensetracking.service;

import com.halils.xpensetracking.dto.CustomerDto;
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

    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer result = customerRepository.save(customerDto.toEntity());
        return new CustomerDto(result);
    }

    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll().stream().map(CustomerDto::new).collect(Collectors.toList());
    }

    public CustomerDto findCustomerById(long id) {
        return customerRepository.findById(id).map(CustomerDto::new).orElseThrow();
    }

    public void deleteCustomerById(long id) {
        customerRepository.deleteById(id);
    }

    public CustomerDto updateCustomerById(long id, CustomerDto customer) {
        Customer replaced = customerRepository.findById(id).map(x -> {
            x.setFirstName(customer.getFirstName());
            x.setLastName(customer.getLastName());
            return customerRepository.save(x);
        }).orElseThrow();
        return new CustomerDto(replaced);
    }
}
