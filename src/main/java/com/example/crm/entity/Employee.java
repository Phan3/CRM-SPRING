package com.example.crm.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
@Setter
@Getter
@AllArgsConstructor
public class Employee implements Serializable {

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name="employee_generator", sequenceName = "employee_seq", allocationSize = 1)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column
    String email;

    String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employee_detail_id")
    EmployeeDetail employeeDetail;

/*    @ManyToMany(cascade = { CascadeType.ALL })
    @JsonManagedReference
    @JoinTable(
            name = "employee_project",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )*/
/*    @OneToMany(mappedBy = "employee")
    Set<EmployeeProject> projects;*/


/*    public void addProject(EmployeeProject project) {
        this.projects.add(project);
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
