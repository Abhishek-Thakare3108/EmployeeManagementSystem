package com.maincrafts.employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main application class — runs the Employee Management System console menu.
 */
public class EmployeeApp {

    // Shared list to store all employees
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===");

        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // flush leftover newline after reading choice

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> searchEmployee();
                case 4 -> updateDepartment();
                case 5 -> exitApp();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    // Displays the main menu
    static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee Department");
        System.out.println("5. Exit");
    }

    // Adds a new employee to the list
    static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        employees.add(new Employee(id, name, department));
        System.out.println("Employee added successfully!");
    }

    // Displays all employees using a for-each loop
    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\nID\tName\t\tDepartment");
        System.out.println("----------------------------------");
        for (Employee emp : employees) {
            System.out.println(emp.id + "\t" + emp.name + "\t\t" + emp.department);
        }
    }

    // Searches for an employee by ID
    static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();

        for (Employee emp : employees) {
            if (emp.id == id) {
                System.out.println("Employee Found - Name: " + emp.name + ", Department: " + emp.department);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Updates the department of an existing employee
    static void updateDepartment() {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (Employee emp : employees) {
            if (emp.id == id) {
                System.out.print("Enter new Department: ");
                emp.department = scanner.nextLine();
                System.out.println("Department updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Closes the scanner and exits cleanly
    static void exitApp() {
        scanner.close();
        System.out.println("Exiting... Goodbye!");
    }
}
