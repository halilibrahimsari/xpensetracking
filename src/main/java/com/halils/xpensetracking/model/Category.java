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
@Table (name = "category")
public class Category {

    @Id
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Expense> expense = new ArrayList<>();
}
