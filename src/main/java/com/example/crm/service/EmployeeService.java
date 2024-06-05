package com.example.crm.service;

import com.example.crm.dao.EmployeeDAO;
import com.example.crm.dao.ProjectDAO;
import com.example.crm.entity.Employee;
import com.example.crm.entity.EmployeeProject;
import com.example.crm.entity.Project;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    ProjectDAO projectDAO;
    public List<Employee> getAll() {
       return employeeDAO.findAll();
    }

    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    public Employee findById(long id) {
        return employeeDAO.findById(id);
    }

    public List<Employee> findByName(String name) {
        return employeeDAO.findByName(name);
    }

    @Transactional
    public Employee update(Employee employee) {
        return  employeeDAO.save(employee);
    }

    public void delete(Long id) {
        employeeDAO.delete(id);
    }

    @Transactional
    public Employee assignEmployeeToProject(int projectId, int employeeId){
        Employee employee = employeeDAO.findById(employeeId);
        Project addProject = projectDAO.findById(projectId);
        //System.out.println("add project: " + addProject.getProjectName());
        //employee.addProject(new EmployeeProject(employee, addProject));
        /*Set<Project> projects = employee.getProjects();
        projects.add(addProject);
        employee.setProjects(projects);*/
        /*System.out.println("===================Projects: =======");
        projects.stream().forEach(e -> System.out.println(e.getProjectName()));*/
        employee  = employeeDAO.save(employee);
        return employee;
    }
}
