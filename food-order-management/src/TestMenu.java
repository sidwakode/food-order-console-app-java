import com.sid.foodorder.model.Customer;
import com.sid.foodorder.model.FoodItem;
import com.sid.foodorder.service.CustomerService;
import com.sid.foodorder.service.MenuService;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {

        MenuService menuService = new MenuService(); // Day 2 & 3
        CustomerService customerService = new CustomerService(); // Day 4
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== 🍽️ Food Order Management System ======");
            System.out.println("1. Display Food Menu");
            System.out.println("2. Search Food by Name");
            System.out.println("3. Add New Customer");
            System.out.println("4. Display All Customers");
            System.out.println("0. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    menuService.displayMenu();
                    break;

                case 2:
                    System.out.print("🔍 Enter food name to search: ");
                    String name = scanner.nextLine();
                    menuService.searchFoodByName(name);
                    break;

                case 3:
                    System.out.print("👤 Enter Customer ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("👤 Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("📞 Enter Contact Number: ");
                    String contact = scanner.nextLine();

                    Customer newCustomer = new Customer(id, customerName, contact);
                    customerService.addCustomer(newCustomer);
                    break;

                case 4:
                    customerService.displayAllCustomers();
                    break;

                case 0:
                    System.out.println("👋 Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("❗ Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}