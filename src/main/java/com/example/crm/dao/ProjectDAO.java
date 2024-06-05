package com.example.crm.dao;

import com.example.crm.entity.Employee;
import com.example.crm.entity.Project;

import java.util.List;

public interface ProjectDAO {
    List<Project> findAll();

    Project save(Project employee);

    Project findById(long id);

    List<Project> findByName(String name);

    void delete(Long id);
}
