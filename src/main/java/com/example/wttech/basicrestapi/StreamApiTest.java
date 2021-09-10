package com.example.wttech.basicrestapi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class StreamApiTest {

    public static void main(String[] args) {

        StreamApiTest test1 = new StreamApiTest();
        List<Employee> list1 = test1.getEmployees();

        Stream<Employee> empStream1 = list1.stream().filter(e -> (e.salary > 30000));
        List<Employee> employeeList2 = list1.stream().filter(e -> (e.salary > 30000)).collect(Collectors.toList());

        employeeList2.forEach((s) -> System.out.println(s));

    }

    public List<Employee> getEmployees(){

        //New Employee array list
        List<Employee> emps = new ArrayList<>();

        // Below 30k
        emps.add(new Employee(23000, "Jim"));
        emps.add(new Employee(17000, "Larry"));

        // Above 30k
        emps.add(new Employee(77000, "Rajesh"));
        emps.add(new Employee(57000, "William"));
        emps.add(new Employee(127000, "Venkat"));

        return emps;
    }


}
