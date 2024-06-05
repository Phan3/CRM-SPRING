package com.example.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class EmployeeProjectKey implements Serializable {

    @Column(name = "employee_id")
    Long employeeId;

    @Column(name = "project_id")
    Long projectId;
}
