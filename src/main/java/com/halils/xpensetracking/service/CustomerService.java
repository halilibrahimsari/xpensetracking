package com.halils.xpensetracking.service;

import com.halils.xpensetracking.dto.CustomerDto;
import com.halils.xpensetracking.dto.ExpenseDto;
import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerDto addCustomer(Customer customer) {
        Customer result = customerRepository.save(customer);
        return new CustomerDto(result);
    }

    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll().stream().map(CustomerDto::new).collect(Collectors.toList());
    }

    public CustomerDto findCustomerById(long id) {
        return customerRepository.findById(id).map(this::toCustomerDto).orElseThrow();
    }
    private CustomerDto toCustomerDto(Customer customer){
        CustomerDto dto = new CustomerDto(customer);
        dto.setExpenses(customer.getExpenses().stream().map(ExpenseDto::new).collect(Collectors.toList()));
        return dto;
    }

    public void deleteCustomerById(long id) {
        customerRepository.deleteById(id);
    }

    public CustomerDto updateCustomerById(Customer customer) {

       customerRepository.findById(customer.getCustomerId()).orElseThrow();

        Customer updated = customerRepository.save(customer);

        return new CustomerDto(updated);
    }


}
