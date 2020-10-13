package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.dto.ExpenseDto;
import com.halils.xpensetracking.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping(value = "/expenses")
    public List<ExpenseDto> getAllExpenses (){
        return  expenseService.findAllExpenses(); }

    @PostMapping(value = "/expense/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addExpense(@RequestBody ExpenseDto expenseDto){
        expenseService.addExpense(expenseDto);
    }

}
