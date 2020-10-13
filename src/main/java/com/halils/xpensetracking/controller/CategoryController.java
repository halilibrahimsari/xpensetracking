package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.model.Category;
import com.halils.xpensetracking.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/categories")
    List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping(value = "/categories/{id}")
    Category getCategoryById(@PathVariable int id) {
        return categoryService.findCategoryById(id);
    }

    @PostMapping(value = "/categories")
    Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @DeleteMapping(value = "/categories/{id}")
    void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategoryById(id);
    }

    @PutMapping(value = "/categories/{id}")
    void updateCategory(@PathVariable int id, @RequestBody Category category) {
        categoryService.updateCategory(id, category);
    }


}
