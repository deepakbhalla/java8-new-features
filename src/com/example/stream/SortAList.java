package com.example.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "F", "D");
        // System.out.println(list.stream().sorted().collect(Collectors.toList()));
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list);

        List<Employee> el = Arrays.asList(
                new Employee(5, "Deepak", 56),
                new Employee(2, "Bhalla", 52),
                new Employee(6, "Ashok", 60));
        Collections.sort(el, Comparator.comparing(Employee::getId));
        System.out.println(el);

        Collections.sort(el, Comparator.comparing(Employee::getName));
        System.out.println(el);

        Collections.sort(el, Comparator.comparing(Employee::getAge).reversed());
        System.out.println(el);

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(input.stream().mapToInt(n -> n).sum());
    }

    static class Employee {
        private int id;
        private String name;
        private long age;

        public Employee(int id, String name, long age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public long getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
        }
    }
}
