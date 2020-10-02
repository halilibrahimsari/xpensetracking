package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;


}
