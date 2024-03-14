package com.projects.ims.model;

public class Admin {
    private int adminId;
    private String adminFirstName;
    private String adminLastName;
    private String adminEmail;
    private String adminName;
    private String password;

    public Admin() {

    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(int adminId, String adminFirstName, String adminLastName, String adminEmail, String adminName, String password) {
        this.adminId = adminId;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminEmail = adminEmail;
        this.adminName = adminName;
        this.password = password;
    }
}