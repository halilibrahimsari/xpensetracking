package com.halils.xpensetracking.repository;

import com.halils.xpensetracking.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
