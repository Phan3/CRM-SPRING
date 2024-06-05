package com.example.crm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/*@Entity
@Table(name = "project")
@Data*/
public class Project {
/*    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_generator")
    @SequenceGenerator(name="project_generator", sequenceName = "project_seq", allocationSize = 1)
    private Long id;*/

    /*@Column*/
    String projectName;

/*    @ManyToMany(mappedBy = "projects", cascade = { CascadeType.ALL })
    @JsonBackReference*/
/*    @OneToMany(mappedBy = "project")
    Set<EmployeeProject> employees = new HashSet<>();*/

/*    void addEmployee(Employee employee) {
        this.employees.add(employee);
    }*/



}
