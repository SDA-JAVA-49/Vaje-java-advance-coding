package Exercise8;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empNum;
    private String name;
    private double empSal;

    public Employee(int empNum, String name, double empSal) {
        this.empNum = empNum;
        this.name = name;
        this.empSal = empSal;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return empSal;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 25000);
        Employee emp2 = new Employee(102, "Jane", 35000);
        Employee emp3 = new Employee(103, "Alice", 40000);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        List<Employee> sortedEmployees = employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("Employees sorted by name:");
        sortedEmployees.forEach(emp ->
                System.out.println("ID: " + emp.getEmpNum() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));
    }
}


