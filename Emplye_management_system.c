#include <stdio.h>
#include <string.h>

// Define the structure for an employee record
struct Employee {
    int id;
    char name[50];
    char position[50];
    float salary;
};

// Function to add an employee
void addEmployee(struct Employee employees[], int *employeeCount) {
    if (*employeeCount < 100) {
        struct Employee newEmployee;
        newEmployee.id = *employeeCount + 1;

        printf("Enter employee name: ");
        scanf("%s", newEmployee.name);
        printf("Enter employee position: ");
        scanf("%s", newEmployee.position);
        printf("Enter employee salary: ");
        scanf("%f", &newEmployee.salary);

        employees[*employeeCount] = newEmployee;
        (*employeeCount)++;

        printf("Employee added successfully.\n");
    } else {
        printf("Maximum employee limit reached.\n");
    }
}

// Function to display all employees
void displayEmployees(struct Employee employees[], int employeeCount) {
    printf("Employee ID\tName\tPosition\tSalary\n");
    for (int i = 0; i < employeeCount; i++) {
        printf("%d\t\t%s\t%s\t\t%.2f\n", employees[i].id, employees[i].name, employees[i].position, employees[i].salary);
    }
}

// Function to search for an employee by name
void searchEmployee(struct Employee employees[], int employeeCount, const char searchName[]) {
    int found = 0;
    for (int i = 0; i < employeeCount; i++) {
        if (strcmp(employees[i].name, searchName) == 0) {
            printf("Employee found:\n");
            printf("ID: %d\nName: %s\nPosition: %s\nSalary: %.2f\n", employees[i].id, employees[i].name, employees[i].position, employees[i].salary);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Employee not found.\n");
    }
}

int main() {
    struct Employee employees[100];
    int employeeCount = 0;
    int choice;
    char searchName[50];

    while (1) {
        printf("\nEmployee Management System\n");
        printf("1. Add Employee\n");
        printf("2. Display Employees\n");
        printf("3. Search Employee\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addEmployee(employees, &employeeCount);
                break;
            case 2:
                displayEmployees(employees, employeeCount);
                break;
            case 3:
                printf("Enter the name to search: ");
                scanf("%s", searchName);
                searchEmployee(employees, employeeCount, searchName);
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
