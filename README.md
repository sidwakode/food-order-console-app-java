# 🍽️ Food Order Management System (Phase 1 – Core Java)

A console-based Java application simulating real-time food ordering operations such as menu browsing, customer management, order placement, and billing. Designed with a clean layered structure (Model-Service-Utility) following core Java principles and best practices.

---

## 📌 Overview

This project replicates a food ordering workflow for small restaurants or kiosks using **pure Core Java**. It handles operations like:

- Viewing and searching food items
- Managing customers
- Placing orders
- Calculating bills and applying discounts
- Storing and retrieving order history via file I/O

The application is modular and extensible, following OOP principles and service-driven logic separation.

---

## 🔧 Technologies & Concepts Used

- **Java 8+**
- OOPs (Encapsulation, Inheritance, Composition)
- Collections (ArrayList, HashMap)
- File I/O (BufferedReader/Writer)
- Exception Handling (Custom Exceptions)
- UUID-based unique ID generation
- Enum, Switch-case, Loops
- Layered structure: `model`, `service`, `util`

---

## 🗂️ Project Structure

com.foodorder
│
├── model # Contains entity classes: FoodItem, Customer, Order
├── service # Business logic: MenuService, CustomerService, OrderService
├── util # Utility classes: ID generation, Billing, File I/O
└── Main.java # CLI runner for the app


---

## 🚀 Features (Phase 1 – Core Java)

- ✅ Add & View Food Items (with category)
- ✅ Add & View Customers
- ✅ Place Orders (multiple items per customer)
- ✅ Generate Bill with discounts
- ✅ Assign unique Order IDs (UUID)
- ✅ Store order history in file
- ✅ Read history from file
- ✅ Console-based menu (switch-case driven)
- ✅ Exception handling for invalid/empty data
- ✅ Modular, layered project structure

---

## 🔜 Phase 2 (Coming Soon – Spring Boot + REST APIs)

This Core Java version will evolve into a Spring Boot RESTful API with full-stack capabilities:

- RESTful Controllers
- JPA Entity Mapping
- MySQL integration
- Swagger for API documentation
- Validation, Exception Handling, Pagination
- Role-based authentication (JWT)

---

## ▶️ Run Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/food-order-management-system.git
   cd food-order-management-system
Open in any IDE (IntelliJ, Eclipse)

Run Main.java from the com.foodorder package

Follow the CLI menu to perform actions

🧠 Real-World Thinking
This project simulates a real-world backend console app that can easily scale to web APIs. The architecture is layered with clear separation of concerns to reflect professional Java development practices. Each class is responsible for a single functionality (SRP - Single Responsibility Principle).

.

🧩 Future Enhancements
Migrate to Spring Boot REST APIs

Connect with MySQL database

Create API endpoints for all operations

Add user authentication

Integrate Swagger docs and Postman collection

Deploy using Docker + CI/CD pipeline

👨‍💻 Author
Sidharth Wakode
Java Developer | MCA | Hands-on Software Engineer
📧 sidwakode5@gmail.com
🔗 LinkedIn Profile https://www.linkedin.com/in/sidharth-wakode-59a4562a3/
