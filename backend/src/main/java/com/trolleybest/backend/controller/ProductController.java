package com.trolleybest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trolleybest.backend.model.Product;
import com.trolleybest.backend.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("products")
    public List<Product> fetchProductList(){
        return productService.fetchProductList();
    }
}
