package com.trolleybest.backend.model;

import java.time.LocalDateTime;

public class Admin extends User {
    private String adminLevel;

    public String getAdminLevel() {
        return adminLevel;
    }
    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }


}
