package com.example.wttech.basicrestapi.service;

import com.example.wttech.basicrestapi.Employee;
import com.example.wttech.basicrestapi.StreamApiTest;
import com.example.wttech.basicrestapi.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    public static void main(String[] args) {
        UserService us1 = new UserService();
        us1.findOne(1);
    }

    // Declarations
    @Autowired
    StreamApiTest test1;

    public Employee findOne(int id) {

        List<Employee> employeeList = test1.getEmployees();

        return null;
    }

    public List<Employee> findAll() {

        List<Employee> employeeList = test1.getEmployees();

        return employeeList;
    }
}
