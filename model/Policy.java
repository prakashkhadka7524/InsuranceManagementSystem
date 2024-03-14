package com.projects.ims.model;

public class Policy {
    private int policyId;
    private String policyHolderName;
    private double policyPremiumAmount;
    private double policyCoverage;

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getPolicyPremiumAmount() {
        return policyPremiumAmount;
    }

    public void setPolicyPremiumAmount(double policyPremiumAmount) {
        this.policyPremiumAmount = policyPremiumAmount;
    }

    public double getPolicyCoverage() {
        return policyCoverage;
    }

    public void setPolicyCoverage(double policyCoverage) {
        this.policyCoverage = policyCoverage;
    }

    public Policy() {
    }

    public Policy(int policyId, String policyHolderName, double policyPremiumAmount, double policyCoverage) {
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.policyPremiumAmount = policyPremiumAmount;
        this.policyCoverage = policyCoverage;
    }

    
}
