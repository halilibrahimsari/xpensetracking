package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Expense;
import com.halils.xpensetracking.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    public List<Expense> findAllExpenses (){
        return expenseRepository.findAll();
    }
}
