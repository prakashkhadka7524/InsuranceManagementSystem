package com.projects.ims.client;
import com.projects.ims.dao.impl.UserDaoImpl;
import com.projects.ims.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserMain {
   static Scanner scan = new Scanner(System.in);


    static UserDaoImpl userDao = new UserDaoImpl();
    ArrayList<Customer> customers = new ArrayList<>();
   static UserMain user= new UserMain();
    void mainMethod(){

        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("                      1)Sign up for Admin");
            System.out.println("                      2)Sign up for Customer");
            System.out.println("                      3)Admin Login");
            System.out.println("                      4)Client Login");
            System.out.println("                      5)Exit");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            int options = scan.nextInt();
            switch (options) {
                case 1:userDao.registerAdmin();
                    break;
                case 2:userDao.registerCustomer();
                    break;
                case 3:
                    System.out.println("Enter Username:");
                    String username =scan.next();
                    System.out.println("Enter Password:");
                    String password = scan.next();
                    boolean check = userDao.verifyUserNameAndPasswordAdmin(username, password);
                    if (check){
                        System.out.println("Login successful!");
                        user.loginAdmin();

                    }
                    else {
                        System.out.println("Admin Doesn't exits!");}
                    break;
                case 4:
                    System.out.println("Enter Username:");
                    String userNameCustomer =scan.next();
                    System.out.println("Enter Password:");
                    String passwordCustomer = scan.next();
                    boolean checkCustomer = userDao.verifyUserNameAndPasswordCustomer(userNameCustomer, passwordCustomer);
                    if (checkCustomer) {
                        System.out.println("Login successful!");
                        user.loginCustomer();
                    }
                    else {
                        System.out.println("User Doesn't exits!");}
                    break;
                default:
                    System.out.println("Choose between 1 to 4!! Please");
            }
        }
    }

        public static void main (String[]args){
            UserMain user = new UserMain();
            user.mainMethod();
        }
        public void loginAdmin() {

            UserDaoImpl userDao= new UserDaoImpl();
                    while (true) {
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("                      1)Add a Customer");
                        System.out.println("                      2)All the Customers");
                        System.out.println("                      3)View Customer");
                        System.out.println("                      4)Update Customer");
                        System.out.println("                      5)Delete Customer");
                        System.out.println("                      6)Add a Category");
                        System.out.println("                      7)All the Category");
                        System.out.println("                      8)View Category");
                        System.out.println("                      9)Update Category");
                        System.out.println("                      10)Delete Category");
                        System.out.println("                      11)Add a Sub Category");
                        System.out.println("                      12)All the Sub Category");
                        System.out.println("                      13)View Sub Category");
                        System.out.println("                      14)Update Sub Category");
                        System.out.println("                      15)Delete Sub Category");
                        System.out.println("                      16)Add a Policy");
                        System.out.println("                      17)All the Policy");
                        System.out.println("                      18)View Policy");
                        System.out.println("                      19)Update Policy");
                        System.out.println("                      20)Cancel Policy");
                        System.out.println("                      21)Back");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                        int options = scan.nextInt();
                        switch (options) {
                            case 1:userDao.registerCustomer();
                                break;
                            case 2:
                                List<Customer> customers = userDao.viewAllCustomer();
                                int count = 0;

                                for (Customer customer : customers) {
                                    if (customer != null)
                                        System.out.println(customer.getUserId()+" "+customer.getUserFirstName()+" "+customer.getUserLastName()+" "+
                                                customer.getUserEmail()+" "+customer.getUserName()+" "+customer.getPassword());
                                    else
                                        count++;
                                }
                                if (count != 0)
                                    System.out.println("Customers Not Exist");

                                break;
                            case 3:
                                System.out.println("Enter CustomerId Number :");
                                Customer customer = userDao.viewCustomer(scan.nextInt());
                                if (customer != null)
                                    System.out.println(customer.getUserId()+" "+customer.getUserFirstName()+" "+customer.getUserLastName()+" "+
                                            customer.getUserEmail()+" "+customer.getUserName()+" "+customer.getPassword());
                                else
                                    System.out.println("Customer is Not Exist");
                                break;
                            case 4:
                                System.out.println("Enter the customer id to update");

                                userDao.updateCustomer( scan.nextInt());
                                break;
                            case 5:
                                System.out.println("Enter the customer id to delete");
                               userDao.deleteCustomer( scan.nextInt());
                                break;
                            case 6:userDao.registerCategory();
                                break;
                            case 7:List<Category> categories = userDao.viewAllCategory();
                                int countCategory = 0;


                                for (Category category : categories) {
                                    if (category != null)
                                        System.out.println(category.getCategoryId()+" "+category.getDurationOfInsurance()+"" +
                                                " "+category.getTypesOfCoverage()+" "+category.isItPersonalOrNot());
                                    else
                                        countCategory++;
                                }
                                if (countCategory != 0)
                                    System.out.println("Category Not Exist");

                                break;
                            case 8:
                                System.out.println("Enter CategoryId Number :");
                                Category category = userDao.viewCategory(scan.nextInt());
                                if (category != null)
                                    System.out.println(category.getCategoryId()+" "+category.getDurationOfInsurance()+"" +
                                            " "+category.getTypesOfCoverage()+" "+category.isItPersonalOrNot());
                                else
                                    System.out.println("Category is Not Exist");
                                break;
                            case 9:
                                System.out.println("Enter the category id to update");
                                userDao.updateCategory(scan.nextInt());
                                break;
                            case 10:
                                System.out.println("Enter the category id to delete");
                                ;userDao.deleteCategory(scan.nextInt());
                                break;
                            case 11:userDao.registerSubCategory();
                                break;
                            case 12:List<SubCategory> subCategories = userDao.viewAllSubCategory();
                                int countSubCategory = 0;

                                for (SubCategory subCategory : subCategories) {
                                    if (subCategory != null)
                                        System.out.println(subCategory.getSubCategoryId()+" "+subCategory.getSubCategoryType()+" "+subCategory.getName());
                                    else
                                        countSubCategory++;
                                }
                                if (countSubCategory != 0)
                                    System.out.println("SubCategory Not Exist");
                                break;
                            case 13:
                                System.out.println("Enter CategoryId Number :");
                                SubCategory subCategory = userDao.viewSubCategory(scan.nextInt());
                                if (subCategory != null)
                                    System.out.println(subCategory.getSubCategoryId()+" "+subCategory.getSubCategoryType()+" "+subCategory.getName());
                                else
                                    System.out.println("SubCategory is Not Exist");
                                break;
                            case 14:
                                System.out.println("Enter the subcategory id to update");
                                int subCategoryId1=scan.nextInt();
                                userDao.updateSubCategory(subCategoryId1);
                                break;
                            case 15:
                                System.out.println("Enter the subcategory id to view");
                                int subCategoryId2=scan.nextInt();
                                userDao.deleteSubCategory(subCategoryId2);
                            break;
                            case 16:userDao.registerPolicy();
                                break;
                            case 17:List<Policy> policies = userDao.viewAllPolicy();
                                int countPolicy = 0;

                                for (Policy policy : policies) {
                                    if (policy != null)
                                        System.out.println(policy.getPolicyId()+" "+policy.getPolicyCoverage()+policy.getPolicyPremiumAmount()+" "+policy.getPolicyHolderName());
                                    else
                                        countPolicy++;
                                }
                                if (countPolicy != 0)
                                    System.out.println("Policy Not Exist");

                                break;
                            case 18:
                                System.out.println("Enter PolicyId Number :");
                                Policy policy = userDao.viewPolicy(scan.nextInt());
                                if (policy != null)
                                    System.out.println(policy.getPolicyId()+" "+policy.getPolicyCoverage()+policy.getPolicyPremiumAmount()+" "+policy.getPolicyHolderName());
                                else
                                    System.out.println("SubCategory is Not Exist");
                                break;
                            case 19:
                                System.out.println("Enter the subcategory id to view");
                                int policyId1=scan.nextInt();
                                userDao.updatePolicy(policyId1);
                                break;
                            case 20:
                                System.out.println("Enter the subcategory id to view");
                                int policyId2=scan.nextInt();
                                userDao.cancelPolicy(policyId2);
                                break;
                            case 21:user.mainMethod();
                                break;
                            default:
                                System.out.println("Choose between 1 to 21");
                        }
                        }
                }






        public void loginCustomer() {
                    while (true) {
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("                      1)Sign up as a Customer");
                        System.out.println("                      2)Update your information");
                        System.out.println("                      3)View the list of Category");
                        System.out.println("                      4)View the list of SubCategory");
                        System.out.println("                      21)Back");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                        int options = scan.nextInt();
                        switch (options) {
                            case 1:userDao.registerCustomer();
                                break;
                            case 2:userDao.updateCustomer(scan.nextInt());
                                break;
                            case 3:userDao.viewAllCategory();
                                break;
                            case 4:userDao.viewAllSubCategory();
                            break;
                            case 5:user.mainMethod();
                                break;
                            default:
                                System.out.println("Choose between 1 to 5");
                        }
                     }
          
          
}}
        
    
