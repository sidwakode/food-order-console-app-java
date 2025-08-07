package com.sid.foodorder.service;

import com.sid.foodorder.model.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private List<FoodItem> foodMenu;

    // Constructor to initialize menu with some items
    public MenuService() {
        foodMenu = new ArrayList<>();
        preloadMenu();
    }

    // ✅ Preload some sample items
    private void preloadMenu() {
        foodMenu.add(new FoodItem(101, "Pizza", 199.99));
        foodMenu.add(new FoodItem(102, "Burger", 99.99));
        foodMenu.add(new FoodItem(103, "Pasta", 149.50));
        foodMenu.add(new FoodItem(104, "Biryani", 180.00));
    }

    // ✅ Display all food items
    public void displayMenu() {
        if (foodMenu.isEmpty()) {
            System.out.println("⚠️ No food items available.");
        } else {
            System.out.println("📋 Available Food Items:");
            for (FoodItem item : foodMenu) {
                System.out.println(item);
            }
        }
    }

    // ✅ Search food items by name (case-insensitive)
    public void searchFoodByName(String searchName) {
        boolean found = false;
        System.out.println("🔍 Search Results for: " + searchName);
        for (FoodItem item : foodMenu) {
            if (item.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No matching food item found.");
        }
    }

    // ✅ Add food item (optional for enhancements)
    public void addFoodItem(FoodItem item) {
        foodMenu.add(item);
        System.out.println("✅ Food item added: " + item.getName());
    }

    // ✅ Get all items (for external use)
    public List<FoodItem> getAllFoodItems() {
        return foodMenu;
    }
}