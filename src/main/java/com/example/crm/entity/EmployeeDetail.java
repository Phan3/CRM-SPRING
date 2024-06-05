package com.example.crm.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_detail")
@Data
@NoArgsConstructor
public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_detail_generator")
    @SequenceGenerator(name="employee_detail_generator", sequenceName = "employee_detail_seq", allocationSize = 1)
    private Long id;

    @Column
    private Long salary;

    public EmployeeDetail(Long salary) {
        this.salary = salary;
    }
}
