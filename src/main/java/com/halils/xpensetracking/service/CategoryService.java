package com.halils.xpensetracking.service;

import com.halils.xpensetracking.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public String findCategoryById(){
        return "found one";
    }
}
