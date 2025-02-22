package Exercise9;

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

        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElseThrow(() -> new RuntimeException("No employees found"));

        System.out.println("The maximum salary is: " + maxSalary);
    }
}

