package com.halils.xpensetracking.repository;

import com.halils.xpensetracking.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
