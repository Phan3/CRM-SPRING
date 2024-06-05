package com.example.crm.dto;

import com.example.crm.entity.Employee;
import lombok.Data;

@Data
public class EmployeeDto extends Employee {

    Long salary;

}
