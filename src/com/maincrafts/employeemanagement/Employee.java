package com.maincrafts.employeemanagement;

/**
 * Represents an Employee with an ID, name, and department.
 */
public class Employee {

    public int id;
    public String name;
    public String department;

    // Constructor to initialize all fields
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
