package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.model.Expense;
import com.halils.xpensetracking.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/expenses")
    public List<Expense> getAllExpenses (){
        return expenseService.findAllExpenses();
    }


}
