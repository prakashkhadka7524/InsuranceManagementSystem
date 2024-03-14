package com.projects.ims.dao;

import com.projects.ims.model.*;

import java.util.List;

public interface UserDao {

    boolean verifyUserNameAndPasswordAdmin(String userName, String password);

    boolean verifyUserNameAndPasswordCustomer(String userName, String password);

    void registerAdmin();

    void registerCustomer();

    void registerCategory();

    void registerSubCategory();

    void registerPolicy();

    List<Customer> viewAllCustomer();

    List<Admin> viewAllAdmin();

    List<Category> viewAllCategory();

    List<SubCategory> viewAllSubcategories();

    List<Policy> viewAllPolicy();


    Admin viewAdmin(int adminId);


    Category viewCategory(int categoryId);

    SubCategory viewSubCategory(int subCategoryId);

    Category updateCategory(int categoryId);


    SubCategory updateSubCategory(int subCategoryId);

    Policy activatePolicy(int policyId);

    void cancelPolicy(int policyId);

    Customer viewCustomer(int customerId);

    Customer updateCustomer(int customerId);

    void deleteCustomer(int customerId);

    void deleteCategory(int categoryId);

    List<SubCategory> viewAllSubCategory();

    void deleteSubCategory(int subCategoryId);

    Policy viewPolicy(int policyId);

    Policy updatePolicy(int policyId);

    Admin updateAdmin(int adminId);
}
