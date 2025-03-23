# Overview

The Electricity Billing System is a Java Swing-based desktop application designed to automate the process of electricity bill generation and management.
The system allows administrators to register customers, calculate electricity bills based on power consumption, generate invoices, retrieve previous billing history, and print bills.
This project follows the MVC (Model-View-Controller) architecture, ensuring a well-structured and maintainable codebase.
The application is connected to a MySQL database to store customer details, billing records, and consumption data.

# Features

🔹 Customer Management
Add new customers with details such as name, meter number, address, and contact information.
View and manage customer information in a tabular format.

🔹 Bill Calculation & Generation
Calculate electricity bills based on units consumed and predefined tariff rates.
Generate monthly bills for customers with detailed breakdowns.

🔹 Billing History
Retrieve previous billing records for any meter number and month.
Display all past bills for quick reference.

🔹 Print & Save Bills
Generate a bill receipt and print it for record-keeping.

# Technologies Used
## 🛠️ Technologies Used  

| **Technology**  | **Purpose** |
|---------------|-----------|
| **Java (Swing & AWT)** | GUI development |
| **MySQL** | Database management |
| **JDBC (Java Database Connectivity)** | Database connectivity |
| **MVC Architecture** | Code organization |


# Workflow

1. Customer Registration
Admin enters customer details, and the system assigns a meter number.

2. Bill Calculation
The system takes meter readings and applies predefined tariff rates to calculate the total bill.

3. Bill Generation
The application generates a detailed bill with a breakdown of charges.

4. Billing History
Past billing records can be retrieved for audit and reference.

5. Print Bill
The generated bill can be printed for physical records.

# Installation & Setup

📜 Prerequisites
Ensure you have the following installed:
✔ Java JDK (8 or later)
✔ MySQL Server
✔ MySQL Connector for Java


