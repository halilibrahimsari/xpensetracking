package com.halils.xpensetracking.controller;

import com.halils.xpensetracking.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/category")
    String getCategoryById (){
        return categoryService.findCategoryById();
    }
}
