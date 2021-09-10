package com.example.wttech.basicrestapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {

    public int id;
    double salary;
    String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
