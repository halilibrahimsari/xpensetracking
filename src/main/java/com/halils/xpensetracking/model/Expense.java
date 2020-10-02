package com.halils.xpensetracking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private long id;

    private Instant expenseDate;

    private String companyName;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Customer customer;
}
