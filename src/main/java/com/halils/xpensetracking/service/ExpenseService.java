package com.halils.xpensetracking.service;

import com.halils.xpensetracking.dto.ExpenseDto;
import com.halils.xpensetracking.model.Category;
import com.halils.xpensetracking.model.Customer;
import com.halils.xpensetracking.model.Expense;
import com.halils.xpensetracking.repository.CategoryRepository;
import com.halils.xpensetracking.repository.CustomerRepository;
import com.halils.xpensetracking.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CustomerRepository customerRepository;

    public List<ExpenseDto> findAllExpenses (){
        return expenseRepository.findAll().stream().map(ExpenseDto::new).collect(Collectors.toList());
    }

    public void addExpense(ExpenseDto expenseDto){
        Customer customer = customerRepository.findById(expenseDto.getCustomerId()).orElseThrow();
        Category category = categoryRepository.findById(expenseDto.getCategoryId()).orElseThrow();
        Expense expense = expenseDto.toEntity();
        expense.setCustomer(customer);
        expense.setCategory(category);
        expenseRepository.save(expense);
    }
}
