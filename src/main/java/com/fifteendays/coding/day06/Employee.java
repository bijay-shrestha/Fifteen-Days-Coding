package com.fifteendays.coding.day06;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Employee {
    private Integer id;
    private String name;
    private String department;
    private Double salary;
}
