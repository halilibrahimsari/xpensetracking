package com.halils.xpensetracking.dto;

import com.halils.xpensetracking.model.Customer;
import lombok.Data;

@Data
public class CustomerDto {

    private final long id;
    private final String firstName;
    private final String lastName;

    public CustomerDto(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
