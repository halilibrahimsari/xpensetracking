package com.halils.xpensetracking.dto;

import com.halils.xpensetracking.model.Expense;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@NoArgsConstructor
@Data
public class ExpenseDto {

    private Long expenseId;
    private String expenseDate;
    private String company;
    private Double amount;
    private Long customerId;
    private Integer categoryId;


    public ExpenseDto(Expense expense){
        this.expenseId = expense.getExpenseId();
        this.expenseDate = expense.getExpenseDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        this.company = expense.getCompany();
        this.amount = expense.getAmount();
        this.customerId = expense.getCustomer().getCustomerId();
        this.categoryId = expense.getCategory().getCategoryId();
    }

    public Expense toEntity(){
        Expense expense = new Expense();
        expense.setExpenseDate(LocalDate.parse(expenseDate));
        expense.setCompany(company);
        expense.setAmount(amount);
        return expense;
    }




}
