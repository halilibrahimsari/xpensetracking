package com.halils.xpensetracking.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    @JsonManagedReference
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        expense.setCustomer(this);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
        expense.setCustomer(null);
    }

}
