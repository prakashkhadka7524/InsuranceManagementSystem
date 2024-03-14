package com.projects.ims.dao.impl;

import com.projects.ims.dao.UserDao;
import com.projects.ims.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Category> categories = new ArrayList<>();
    ArrayList<SubCategory> subCategories = new ArrayList<>();
    ArrayList<Policy> policies = new ArrayList<>();

    @Override
    public boolean verifyUserNameAndPasswordAdmin(String userName, String password) {
        System.out.println("Enter the User name");
        userName = scanner.next();
        System.out.println("Enter password");
        password = scanner.next();
        boolean login = false;
        for (Admin admin : admins) {
            if (admin.getAdminName().equals(userName)
                    && admin.getPassword().equals(password)) {
                login = true;
                break;
            }
        }

        return login;
    }

    @Override
    public boolean verifyUserNameAndPasswordCustomer(String userName, String password) {
        System.out.println("Enter the User name");
        userName = scanner.next();
        System.out.println("Enter password");
        password = scanner.next();
        boolean login = false;
        for (Customer customer : customers) {
            if (customer.getUserName().equals(userName)
                    && customer.getPassword().equals(password)) {
                login = true;
                break;
            }
        }

        return login;
    }


    @Override
    public void registerAdmin() {
        System.out.println("Enter adminId:");
        int adminId = scanner.nextInt();
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        System.out.println("Enter Email:");
        String email = scanner.next();
        System.out.println("Enter Username:");
        String userName = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();
        admins.add(new Admin(adminId, firstName, lastName, email, userName, password));
        System.out.println("Admin Registration Successful!!");
    }

    @Override
    public void registerCustomer() {
        System.out.println("Enter userId:");
        int customerID = scanner.nextInt();
        System.out.println("Enter First Name:");
        String customerFirstName = scanner.next();
        System.out.println("Enter Last Name:");
        String customerLastName = scanner.next();
        System.out.println("Enter Email:");
        String email = scanner.next();
        System.out.println("Enter Username:");
        String userName = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();
        customers.add(new Customer(customerID, customerFirstName, customerLastName, email, userName, password));
        System.out.println(" Client registration Successful!!");

    }

    @Override
    public List<Customer> viewAllCustomer() {
        return customers;
    }

    @Override
    public List<Admin> viewAllAdmin() {
        return admins;
    }


    @Override
    public void registerCategory() {
        System.out.println("Enter Category Id");
        int categoryId = scanner.nextInt();
        System.out.println("Enter typesOfCoverage");
        String typesOfCoverage = scanner.next();
        System.out.println("Enter isItPersonalOrNot");
        String isItPersonalOrNot = scanner.next();
        System.out.println("Enter durationOfInsurance");
        double durationOfInsurance = scanner.nextDouble();
        categories.add(new Category(categoryId, typesOfCoverage, isItPersonalOrNot, durationOfInsurance));
        System.out.println("Registration for category successful!!");

    }


    @Override
    public void registerSubCategory() {
        System.out.println("Enter subcategory Id");
        int subCategoryId = scanner.nextInt();
        System.out.println("Enter the name :");
        String name = scanner.next();
        System.out.println("Enter Sub category type");
        String subCategoryType = scanner.next();
        subCategories.add(new SubCategory(subCategoryId, name, subCategoryType));
        System.out.println("Registration for Sub Category successful!!");

    }

    @Override
    public void registerPolicy() {
        System.out.println("Enter Policy Id");
        int policyId = scanner.nextInt();
        System.out.println("Enter the policyHolderName :");
        String policyHolderName = scanner.next();
        System.out.println("Enter policy type");
        double policyPremiumAmount = scanner.nextDouble();
        System.out.println("Enter the policy coverage");
        double policyCoverage = scanner.nextDouble();
        policies.add(new Policy(policyId, policyHolderName, policyPremiumAmount, policyCoverage));
        System.out.println("Registration for policy successful!!");
    }

    @Override
    public Admin viewAdmin(int adminId) {
        for (Admin admin : admins) {

            if (admin != null) {
                if (admin.getAdminId() == adminId) {
                    return admin;
                }

            }

        }
        return null;

    }


    @Override
    public List<Category> viewAllCategory() {

        return categories;
    }

    @Override
    public List<SubCategory> viewAllSubcategories() {

        return subCategories;
    }


    @Override
    public List<Policy> viewAllPolicy() {

        return policies;
    }


    @Override
    public Category viewCategory(int categoryId) {
        for (Category category : categories) {

            if (category != null) {
                if (category.getCategoryId() == categoryId) {
                    return category;
                }

            }

        }
        return null;

    }


    @Override
    public SubCategory viewSubCategory(int subCategoryId) {

        for (SubCategory subCategory : subCategories) {

            if (subCategory != null) {
                if (subCategory.getSubCategoryId() == subCategoryId) {
                    return subCategory;
                }

            }

        }
        return null;

    }

    @Override
    public Admin updateAdmin(int adminId) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (Admin admin : admins) {

            if (admin != null) {
                if (admin.getAdminId() == adminId) {
                    count++;
                    System.out.println("Do you want to update 1)email  2) address ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter First name");
                            String adminFirstName = sc.next();
                            admin.setAdminFirstName(adminFirstName);
                            System.out.println("adminFirstName updated");
                            break;
                        case 2:
                            System.out.println("Enter last name");
                            String adminLastName = sc.next();
                            admin.setAdminLastName(adminLastName);
                            System.out.println("adminLastName updated");
                            break;
                        case 3:
                            System.out.println("Enter last name");
                            String email = sc.next();
                            admin.setAdminEmail(email);
                            System.out.println("email updated");
                            break;
                        case 4:
                            System.out.println("Enter user name");
                            String userName = sc.next();
                            admin.setAdminName(userName);
                            System.out.println("Admin username updated");
                            break;
                        case 5:
                            System.out.println("Enter password");
                            String password = sc.next();
                            admin.setPassword(password);
                            System.out.println("Admin password updated");
                            break;


                        default:
                            System.out.println("Choose 1 to 5 between");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Customer updateCustomer(int customerId) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (Customer customer : customers) {

            if (customer != null) {
                if (customer.getUserId() == customerId) {
                    count++;
                    System.out.println("Do you want to update 1)First name  2) last name 3)email 4)username 5)password ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter First name");
                            String customerFirstName = sc.next();
                            customer.setUserFirstName(customerFirstName);
                            System.out.println("adminFirstName updated");
                            break;
                        case 2:
                            System.out.println("Enter last name");
                            String customerLastName = sc.next();
                            customer.setUserLastName(customerLastName);
                            System.out.println("customerLastName updated");
                            break;
                        case 3:
                            System.out.println("Enter email");
                            String email = sc.next();
                            customer.setUserEmail(email);
                            System.out.println("email updated");
                            break;
                        case 4:
                            System.out.println("Enter user name");
                            String userName = sc.next();
                            customer.setUserName(userName);
                            System.out.println(" username updated");
                            break;
                        case 5:
                            System.out.println("Enter password");
                            String password = sc.next();
                            customer.setPassword(password);
                            System.out.println(" password updated");
                            break;


                        default:
                            System.out.println("Choose 1 to 5 between");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Category updateCategory(int categoryId) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (Category category : categories) {

            if (category != null) {
                if (category.getCategoryId() == categoryId) {
                    count++;
                    System.out.println("Do you want to update 1)First name  2) last name 3)email 4)username 5)password ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter durationOfInsurance");
                            double durationOfInsurance = sc.nextDouble();
                            category.setDurationOfInsurance(durationOfInsurance);
                            System.out.println("durationOfInsurance updated");
                            break;
                        case 2:
                            System.out.println("Enter typesOfCoverage");
                            String typesOfCoverage = sc.next();
                            category.setTypesOfCoverage(typesOfCoverage);
                            System.out.println("typesOfCoverage updated");
                            break;
                        case 3:
                            System.out.println("Enter itPersonalOrNot");
                            String itPersonalOrNot = sc.next();
                            category.setItPersonalOrNot(itPersonalOrNot);
                            System.out.println("itPersonalOrNot updated");
                            break;


                        default:
                            System.out.println("Choose 1 to 3 between");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public SubCategory updateSubCategory(int subCategoryId) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (SubCategory subCategory : subCategories) {

            if (subCategory != null) {
                if (subCategory.getSubCategoryId() == subCategoryId) {
                    count++;
                    System.out.println("Do you want to update 1)subCategoryName  2) last name  ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter subCategoryName");
                            String subCategoryName = sc.next();
                            subCategory.setName(subCategoryName);
                            System.out.println("subCategoryName updated");
                            break;
                        case 2:
                            System.out.println("Enter subCategoryType");
                            String subCategoryType = sc.next();
                            subCategory.setSubCategoryType(subCategoryType);
                            System.out.println("subCategoryType updated");
                            break;


                        default:
                            System.out.println("Choose 1 to 2 between");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Policy updatePolicy(int policyId) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (Policy policy : policies) {

            if (policy != null) {
                if (policy.getPolicyId() == policyId) {
                    count++;
                    System.out.println("Do you want to update 1)subCategoryName  + \"\\t\" + 2) last name  ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter policyHolderName");
                            String policyHolderName = sc.next();
                            policy.setPolicyHolderName(policyHolderName);
                            System.out.println("policyHolderName updated");
                            break;
                        case 2:
                            System.out.println("Enter policyPremiumAmount");
                            double policyPremiumAmount = sc.nextDouble();
                            policy.setPolicyPremiumAmount(policyPremiumAmount);
                            System.out.println("policyPremiumAmount updated");
                            break;
                        case 3:
                            System.out.println("Enter policyCoverage");
                            double policyCoverage = sc.nextDouble();
                            policy.setPolicyCoverage(policyCoverage);
                            System.out.println("policyCoverage updated");
                            break;


                        default:
                            System.out.println("Choose 1 to 3 between");
                    }
                }
            }
        }
        return null;
    }


    @Override
    public Policy activatePolicy(int policyId) {

        for (Policy policy : policies) {

            if (policy != null) {
                if (policy.getPolicyId() == policyId) {
                    System.out.println("Your policy has been activated");
                }

            }

        }
        return null;
    }


    @Override
    public Customer viewCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getUserId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(int customerId) {
        int i = 0;
        int count = 0;
        Iterator<Customer> iter = customers.iterator();

        while (iter.hasNext()) {
            Customer customer = iter.next();

            if (customer.getUserId() == customerId) {
                count++;
                iter.remove();

                System.out.println("Record Deleted SuccessFully");
            } else {
                i++;
            }


        }
        if (count == 0)
            System.out.println("Record is not Exist");


    }

    @Override
    public void deleteCategory(int categoryId) {
        int i = 0;
        int count = 0;
        Iterator<Category> iter = categories.iterator();

        while (iter.hasNext()) {
            Category category = iter.next();

            if (category.getCategoryId() == categoryId) {
                count++;
                iter.remove();

                System.out.println("Record Deleted SuccessFully");
            } else {
                i++;
            }


        }
        if (count == 0)
            System.out.println("Record is not Exist");

    }

    @Override
    public List<SubCategory> viewAllSubCategory() {
        return subCategories;
    }

    @Override
    public void deleteSubCategory(int subCategoryId) {
        int i = 0;
        int count = 0;
        Iterator<SubCategory> iter = subCategories.iterator();

        while (iter.hasNext()) {
            SubCategory subCategory = iter.next();

            if (subCategory.getSubCategoryId() == subCategoryId) {
                count++;
                iter.remove();

                System.out.println("Record Deleted SuccessFully");
            } else {
                i++;
            }


        }
        if (count == 0)
            System.out.println("Record is not Exist");

    }

    @Override
    public Policy viewPolicy(int policyId) {
        return null;
    }

    public void cancelPolicy(int policyId) {
        int i = 0;
        int count = 0;
        Iterator<Policy> iter = policies.iterator();

        while (iter.hasNext()) {
            Policy policy = iter.next();

            if (policy.getPolicyId() == policyId) {
                count++;
                iter.remove();

                System.out.println("Record Deleted SuccessFully");
            } else {
                i++;
            }


        }
        if (count == 0)
            System.out.println("Record is not Exist");
    }
}
