package com.fifteendays.coding.day03;

import java.util.Comparator;
import java.util.List;

import static com.fifteendays.coding.day03.Employee.createEmployeeList;

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();
        Employee highestSalariesEmployee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().orElse(null);
        if(highestSalariesEmployee != null){
            System.out.println("Employee with highest salary: " + highestSalariesEmployee.getName() +
                    ", Salary: " + highestSalariesEmployee.getSalary());
        }else {
            System.out.println("Employee without highest salary");
        }
    }

}
