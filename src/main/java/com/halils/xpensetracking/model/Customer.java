package com.halils.xpensetracking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "customer")
public class Customer {

    @Id
    private long id;
    private long name;
    private long lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Expense> expense = new ArrayList<>();
}
