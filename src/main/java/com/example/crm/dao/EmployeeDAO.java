package com.example.crm.dao;

import com.example.crm.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findById(long id);

    List<Employee> findByName(String name);

    void delete(Long id);


}
