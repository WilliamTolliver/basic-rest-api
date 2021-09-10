package com.example.wttech.basicrestapi.controller;

import com.example.wttech.basicrestapi.Employee;
import com.example.wttech.basicrestapi.service.UserService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Timed(value = "greeting.time", description = "Time taken to return greeting")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users/{id}")
    public Employee findEmployee(@PathVariable int id){

        Employee employee = userService.findOne(id);
        System.out.println("THIS IS THE POST ONE, ths id : " + id);

        return employee;
    }

    @PostMapping("/users/create")
    public Employee findEmployeeWithBody(Employee emp1){

        System.out.println("THIS IS THE REQUEST BODY " + emp1.getName());
        System.out.println("THIS IS THE REQUEST BODY " + emp1.getId());
        System.out.println("THIS IS THE REQUEST BODY " + emp1.getSalary());

        return emp1;
    }

    @GetMapping("/users")
    public List<Employee> GetAllEmployees(){

        List<Employee> emps = userService.findAll();
        System.out.println("We got a request for all the users!");

        return emps;
    }

    @PostMapping("users/{id}/{name}/{salary}")
    public void createEmployee(){

    }

}
