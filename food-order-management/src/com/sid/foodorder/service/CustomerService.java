package com.sid.foodorder.service;

import com.sid.foodorder.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customerList;

    public CustomerService() {
        customerList = new ArrayList<>();
    }

    // Method to add a new customer
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("✅ Customer added successfully!");
    }

    // Method to display all customers
    public void displayAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("⚠️ No customers available.");
        } else {
            System.out.println("📋 List of Customers:");
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }

    // Optional: Get all customers (if needed in future)
    public List<Customer> getAllCustomers() {
        return customerList;
    }
}