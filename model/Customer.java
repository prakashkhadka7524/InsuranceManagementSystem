package com.projects.ims.model;

public class Customer {
    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerName;
    private String password;
    public Customer(){

    }

    public int getUserId() {
        return customerId;
    }



    public String getUserFirstName() {
        return customerFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.customerFirstName = userFirstName;
    }

    public String getUserLastName() {
        return customerLastName;
    }

    public void setUserLastName(String userLastName) {
        this.customerLastName = userLastName;
    }

    public String getUserEmail() {
        return customerEmail;
    }

    public void setUserEmail(String userEmail) {
        this.customerEmail = userEmail;
    }

    public String getUserName() {
        return customerName;
    }

    public void setUserName(String userName) {
        this.customerName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(int userId, String userFirstName, String userLastName, String userEmail, String userName, String password) {
        this.customerId = userId;
        this.customerFirstName = userFirstName;
        this.customerLastName = userLastName;
        this.customerEmail = userEmail;
        this.customerName = userName;
        this.password = password;
    }
}
