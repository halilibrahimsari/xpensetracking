package com.halils.xpensetracking.dto;

import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.model.Expense;
import lombok.Data;

import java.util.List;

@Data
public class ExpenseDto {

    private final List<Expense> expenses;

    ExpenseDto(Customer customer){
        this.expenses = customer.getExpenses();
    }
}
