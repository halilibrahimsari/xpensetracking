package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Category;
import com.halils.xpensetracking.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }

    public Category findCategoryById(int id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        return category;
    }

    public void updateCategory(int id, Category category) {
        if (categoryRepository.findById(id).isPresent()) {
            Category updated = categoryRepository.findById(id).get();

            updated.setType(category.getType());
            categoryRepository.save(updated);
        } else {
            System.out.println("Couldn't find category with this ID");
        }
    }

}
