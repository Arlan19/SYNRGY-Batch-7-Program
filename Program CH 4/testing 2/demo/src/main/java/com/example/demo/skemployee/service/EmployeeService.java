package com.example.demo.skemployee.service;


import com.example.demo.skemployee.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Map save(Employee request);
    Map edit(Employee request);
    Map delete(Employee request);
    Map list();

    Map getById(Long id);

    Map getByName(String name);

    Map pagination(int page, int size);

    Map paginationByName(int page, int size, String name);

}
