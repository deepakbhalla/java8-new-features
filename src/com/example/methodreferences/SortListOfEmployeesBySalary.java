package com.example.methodreferences;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortListOfEmployeesBySalary {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 30, BigDecimal.valueOf(20000)));
        employees.add(new Employee("H", 20, BigDecimal.valueOf(50000)));
        employees.add(new Employee("D", 80, BigDecimal.valueOf(30000)));
        employees.add(new Employee("H", 50, BigDecimal.valueOf(10000)));
        employees.add(new Employee("C", 10, BigDecimal.valueOf(80000)));

        System.out.println("---- sorted by salary -----");
        employees.sort(ComparatorProvider::compareBySalary);
        employees.forEach(System.out::println);
        
        System.out.println("\n---- sorted by Age -----");
        employees.sort(ComparatorProvider::compareByAge);
        employees.forEach(System.out::println);
    }

    /**
     * ComparatorProvider class.
     */
    static class ComparatorProvider {

        public static int compareBySalary(Employee e1, Employee e2) {
            return e1.getSalary().compareTo(e2.getSalary());
        }

        public static int compareByAge(Employee e1, Employee e2) {
            return e1.getAge().compareTo(e2.getAge());
        }
    }

    /**
     * Employee class.
     */
    static class Employee {

        String name;
        Integer age;
        BigDecimal salary;

        public Employee(String name, Integer age, BigDecimal salary) {
            super();
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
        }
    }
}
