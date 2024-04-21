package week12;

import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", 30, 50000.0),
            new Employee("Alice", 25, 60000.0),
            new Employee("Bob", 35, 45000.0)
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));

        Arrays.sort(employees, Comparator.comparing(Employee::getAge));

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));

    }
}

class Employee {
    private String firstName;
    private int age;
    private double salary;


    public Employee(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
