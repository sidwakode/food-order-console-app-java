package com.sid.foodorder.model;

public class Customer {
    private int id;
    private String name;
    private String contact;

    public Customer(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + ", Contact=" + contact + "]";
    }
}