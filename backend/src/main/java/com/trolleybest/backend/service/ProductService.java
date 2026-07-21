package com.trolleybest.backend.service;

import com.trolleybest.backend.model.Product;
import com.trolleybest.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> fetchProductList(){
        return productRepository.findAll();
    }
}
