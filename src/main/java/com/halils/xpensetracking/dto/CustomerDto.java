package com.halils.xpensetracking.dto;

import com.halils.xpensetracking.model.Customer;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private List<ExpenseDto> expenses;

    public CustomerDto(Customer customer){
        this.id = customer.getCustomerId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
    }

    public Customer toEntity(){
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return customer;
    }

}
