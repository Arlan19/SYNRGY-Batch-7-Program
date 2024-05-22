package com.example.demo.skemployee.service;


import com.example.demo.skemployee.entity.Employee;

import java.util.Map;

public interface EmployeeService {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

}
