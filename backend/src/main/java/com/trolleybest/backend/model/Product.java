package com.trolleybest.backend.model;

import java.time.LocalDateTime;

public class Product {
    private int productId;
    private String name;
    private String description;
    private String brand;
    private double price;
    private int stockQuantity;
    private String imageUrl;
    private boolean productAvailable;
    private LocalDateTime createdAt;
}
