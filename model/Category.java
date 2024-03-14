package com.projects.ims.model;

public class Category {
    private int categoryId;
    private String typesOfCoverage; // can be life or, vehicle or others
    private String isItPersonalOrNot; // personal or commercial
    private double durationOfInsurance;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTypesOfCoverage() {
        return typesOfCoverage;
    }

    public void setTypesOfCoverage(String typesOfCoverage) {
        this.typesOfCoverage = typesOfCoverage;
    }

    public String isItPersonalOrNot() {
        return isItPersonalOrNot;
    }

    public void setItPersonalOrNot(String itPersonalOrNot) {
        isItPersonalOrNot = itPersonalOrNot;
    }

    public double getDurationOfInsurance() {
        return durationOfInsurance;
    }

    public void setDurationOfInsurance(double durationOfInsurance) {
        this.durationOfInsurance = durationOfInsurance;
    }

    public Category() {
    }

    public Category(int categoryId, String typesOfCoverage, String isItPersonalOrNot, double durationOfInsurance) {
        this.categoryId = categoryId;
        this.typesOfCoverage = typesOfCoverage;
        this.isItPersonalOrNot=isItPersonalOrNot;
        this.durationOfInsurance = durationOfInsurance;
    }
}
