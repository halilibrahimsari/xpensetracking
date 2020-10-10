package com.halils.xpensetracking.service;

import com.halils.xpensetracking.model.Category;
import com.halils.xpensetracking.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }

    public Optional<Category> findCategoryById(int id) {
        return categoryRepository.findById(id);
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
