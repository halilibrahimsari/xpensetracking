package com.halils.xpensetracking.repository;

import com.halils.xpensetracking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
