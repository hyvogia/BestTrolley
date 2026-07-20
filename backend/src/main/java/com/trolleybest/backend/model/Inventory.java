package com.trolleybest.backend.model;

import java.time.LocalDateTime;

public class Inventory {
    private int inventoryId;
    private int productId;
    private int quantityAvailable;
    private int reorderLevel;
    private LocalDateTime lastUpdated;


}
