package com.fifteendays.coding.day03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String position;
    private Integer joinedDate;
    private Double salary;

    static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(111, "Bijay Shrestha", 35, "Male", "Software Developer", 2022, 12000.0));
        employees.add(new Employee(112, "Jiya Brein", 32, "Female", "HR", 2015, 25000.0));
        employees.add(new Employee(113, "Paul Niksui", 22, "Male", "Sales & Marketing", 2011, 13500.0));
        employees.add(new Employee(114, "Martin Theron", 30, "Male", "Product Development", 2015, 18000.0));
        employees.add(new Employee(115, "Murali Gowda", 29, "Male", "HR", 2012, 32500.0));
        employees.add(new Employee(116, "Nima Roi", 19, "Female", "Security & Transport", 2016, 22700.0));
        employees.add(new Employee(117, "Iqbal Hussain", 43, "Male", "Account & Finance", 2010, 10500.0));
        employees.add(new Employee(118, "Manu Sharma", 35, "Male", "Product Development", 2015, 27000.0));
        employees.add(new Employee(119, "Amelia Zoe", 31, "Female", "Sales & Marketing", 2016, 34500.0));
        employees.add(new Employee(120, "Jaden Dough", 24, "Male", "Security & Transport", 2015, 11500.0));
        employees.add(new Employee(121, "Jasna Kaur", 28, "Female", "Infrastructure", 2014, 11000.5));
        employees.add(new Employee(122, "Nitin Joshi", 25, "Male", "Product Development", 2016, 15700.0));
        employees.add(new Employee(123, "Jyothi Reddy", 27, "Female", "Account & Finance", 2013, 28200.0));
        employees.add(new Employee(124, "Nicolas Den", 18, "Male", "Sales & Marketing", 2017, 21300.0));

        return employees;
    }
}
