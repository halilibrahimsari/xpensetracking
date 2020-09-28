package com.halils.xpensetracking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Customers")
public class Customer {

    @Id
    private long id;
    private long name;
    private long lastName;

}
