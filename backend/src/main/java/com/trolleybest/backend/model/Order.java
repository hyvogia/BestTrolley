package com.trolleybest.backend.model;

import java.time.LocalDateTime;

public class Order {
    private int orderId;
    private int customerId;
    private LocalDateTime orderDate;
    private double totalAmount;
    private String orderStatus;
    private String shippingAddress;
}
