package com.fifteendays.coding.day08;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployeeList();

        Optional<Employee> secondHighestEarningEmployee = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(secondHighestEarningEmployee.get());

    }
}
