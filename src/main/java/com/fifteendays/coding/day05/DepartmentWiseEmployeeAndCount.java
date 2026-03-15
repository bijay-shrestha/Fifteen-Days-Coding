package com.fifteendays.coding.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseEmployeeAndCount {
    private static List<Employee> employees;

    public DepartmentWiseEmployeeAndCount() {
        employees = new ArrayList<>();
    }

    public void init() {
        Employee ram = Employee.builder().id(1).name("Ram").department("SALES").salary(20000D).build();
        Employee shyam = Employee.builder().id(2).name("Shyam").department("ENGINEERING").salary(15000D).build();
        Employee hari = Employee.builder().id(3).name("Hari").department("HR").salary(128000D).build();
        Employee sita = Employee.builder().id(4).name("Sita").department("ENGINEERING").salary(18500D).build();
        Employee nandini = Employee.builder().id(5).name("Nandini").department("PRODUCT").salary(30000D).build();
        Employee gita = Employee.builder().id(6).name("Gita").department("HR").salary(40000D).build();
        Employee ashika = Employee.builder().id(7).name("Ashika").department("CUSTOMER SUCCESS").salary(60000D).build();
        Employee sobita = Employee.builder().id(8).name("Sobita").department("ADMIN").salary(40000D).build();
        Employee ravi = Employee.builder().id(9).name("Ravi").department("ENGINEERING").salary(12800D).build();
        Employee balen = Employee.builder().id(10).name("Balen").department("SALES").salary(20000D).build();
        Employee sudan = Employee.builder().id(11).name("Sudan").department("SALES").salary(150000D).build();
        Employee oli = Employee.builder().id(12).name("Oli").department("CUSTOMER SUCCESS").salary(40000D).build();
        Employee harka = Employee.builder().id(13).name("Harka").department("ADMIN").salary(10000D).build();
        Employee gagan = Employee.builder().id(14).name("Gagan").department("SALES").salary(12500D).build();
        Employee madhav = Employee.builder().id(15).name("Madhav").department("CUSTOMER SUCCESS").salary(12800D).build();
        Employee jhalanath = Employee.builder().id(16).name("Jhalanath").department("ENGINEERING").salary(40000D).build();
        Employee madan = Employee.builder().id(17).name("Madan").department("HR").salary(30000D).build();
        Employee raju = Employee.builder().id(18).name("Raju").department("ADMIN").salary(20000D).build();
        Employee sushmita = Employee.builder().id(19).name("Sushmita").department("ENGINEERING").salary(10000D).build();
        Employee nembang = Employee.builder().id(20).name("Nembang").department("SALES").salary(12500D).build();
        Employee aarju = Employee.builder().id(21).name("Aarju").department("CUSTOMER SUCCESS").salary(15000D).build();
        Employee sher = Employee.builder().id(22).name("Sher").department("HR").salary(30000D).build();

        employees.addAll(Arrays.asList(ram, shyam, hari, sita, nandini, gita, ashika, sobita, ravi, balen, sudan, oli, harka,
                gagan, madhav, jhalanath, madan, raju, sushmita, nembang, aarju, sher));
    }

    public static void main(String[] args) {
        DepartmentWiseEmployeeAndCount instance = new DepartmentWiseEmployeeAndCount();
        instance.init();

        //Q: Group employees by department and count.
        Map<String, Long> employeeByDepartment=
               employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeeByDepartment);
    }
}
