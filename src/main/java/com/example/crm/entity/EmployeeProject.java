package com.example.crm.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class EmployeeProject implements Serializable {

   /* @EmbeddedId
    private EmployeeProjectKey id;

    public EmployeeProject() {
    }

    public EmployeeProject(Employee employee, Project project) {
        this.employee = employee;
        this.project = project;
    }

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    Employee employee;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    Project project;*/
}
