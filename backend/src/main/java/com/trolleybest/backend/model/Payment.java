package com.trolleybest.backend.model;

import java.time.LocalDateTime;

public class Payment {
    private int paymentId;
    private int orderId;
    private String paymentMethod;
    private String paymentStatus;
    private LocalDateTime paymentDate;
    private double amount;
}
