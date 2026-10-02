# Employee Management System

## Project Overview

A Core Java console-based Employee Management System developed as part of the **Maincrafts Technology Java Developer Internship — Task 1**.

The application allows users to manage employee records through a simple menu-driven interface. All data is stored in memory using an `ArrayList` during the program session. No database, framework, or external library is used.

---

## Features

- Add a new employee with ID, name, and department
- View all employees in a formatted list
- Search for an employee by ID
- Update an employee's department
- Exit the application cleanly

---

## Technologies Used

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| `ArrayList` | In-memory storage of employee records |
| `Scanner` | Reading user input from the console |
| Object-Oriented Programming | Modelling employees as objects |
| Java Module System | `module-info.java` for project structure |

---

## Project Structure

```
EmployeeManagementSystem/
├── src/
│   ├── module-info.java
│   └── com/maincrafts/employeemanagement/
│       ├── Employee.java
│       └── EmployeeApp.java
```

### Employee.java
Represents an employee record. Contains three fields — `id`, `name`, and `department` — and a constructor to initialize them.

### EmployeeApp.java
The main class that runs the application. Contains the menu loop and a dedicated method for each operation: `addEmployee()`, `viewEmployees()`, `searchEmployee()`, `updateDepartment()`, and `exitApp()`.

---

## How the Program Works

When the program starts, a menu is displayed in the console. The user enters a number to select an operation. The program performs the selected operation and returns to the menu. This continues in a loop until the user selects **Exit**.

```
=== Employee Management System ===

--- Menu ---
1. Add Employee
2. View Employees
3. Search Employee
4. Update Employee Department
5. Exit

Enter your choice:
```

---

## How to Run

**Requirements:** Java 21, Spring Tool Suite (STS)

1. Open STS and import or open the `EmployeeManagementSystem` project
2. In the **Package Explorer**, expand `src → com.maincrafts.employeemanagement`
3. Right-click `EmployeeApp.java`
4. Select **Run As → Java Application**
5. The console at the bottom of STS will display the menu
6. Type a number and press **Enter** to interact with the program

---

## Sample Operations

**Adding an employee:**
```
Enter your choice: 1
Enter Employee ID: 101
Enter Employee Name: Abhishek
Enter Department: Development
Employee added successfully!
```

**Viewing all employees:**
```
Enter your choice: 2

ID      Name            Department
----------------------------------
101     Abhishek        Development
102     Rahul           Testing
```

**Searching for an employee:**
```
Enter your choice: 3
Enter Employee ID to search: 101
Employee Found - Name: Abhishek, Department: Development
```

**Searching for a non-existent employee:**
```
Enter your choice: 3
Enter Employee ID to search: 999
Employee not found.
```

**Updating a department:**
```
Enter your choice: 4
Enter Employee ID to update: 101
Enter new Department: Backend Development
Department updated successfully!
```

**Exiting the application:**
```
Enter your choice: 5
Exiting... Goodbye!
```

---

## Concepts Demonstrated

- **Classes and Objects** — `Employee` class models real-world data as an object
- **Constructors** — `Employee` object is initialized using a parameterized constructor
- **ArrayList** — used to store and manage multiple employee records dynamically
- **Scanner** — used to read integer and string input from the console
- **Loops** — `do-while` loop keeps the menu running; `for-each` loop iterates over employees
- **Conditional Statements** — `switch` for menu selection; `if` for search and update logic
- **Methods** — each menu operation is implemented as a separate, focused method

---

## Author

**Abhishek**
Java Developer Intern — Maincrafts Technology
Task 1: Core Java Console Application
