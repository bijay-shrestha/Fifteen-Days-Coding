package com.fifteendays.coding.day03;

import java.util.Comparator;
import java.util.List;

import static com.fifteendays.coding.day03.Employee.createEmployeeList;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();

        Employee secondHighestSalaryEmployee = employeeList.stream().sorted(
                Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        if(secondHighestSalaryEmployee != null) {
            System.out.println("Employee with second highest salary: " + secondHighestSalaryEmployee.getName() +
                    ", Salary: " + secondHighestSalaryEmployee.getSalary());
        }else  {
            System.out.println("Employee without second highest salary");
        }

    }
}
