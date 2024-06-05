package com.example.crm.service;

import com.example.crm.dao.ProjectDAO;
import com.example.crm.entity.Project;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectDAO projectDAO;

    @Transactional
    public Project save(Project project) {
        return projectDAO.save(project);
    }

    public List<Project> findAll(){
        List<Project> projects = projectDAO.findAll();
/*        projects.forEach(project -> project.setEmployees(project.getEmployees()));
        projects.forEach(project -> System.out.println(project.getEmployees()));*/
        //projects.stream().forEach(project -> {project.getEmployees()});
        return projects;
    }
}
