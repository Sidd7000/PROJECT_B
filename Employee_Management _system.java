import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    private int nextId = 1;

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    searchEmployee(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.next();
        System.out.print("Enter employee salary: $");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(nextId, name, salary);
        employees.add(employee);
        nextId++;

        System.out.println("Employee added successfully.");
    }

    private void listEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void searchEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to search: ");
        int searchId = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.getId() == searchId) {
                System.out.println("Employee found:");
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee not found with ID " + searchId);
    }
}
