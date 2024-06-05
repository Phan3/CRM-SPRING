package com.example.crm.controller;

import com.example.crm.dto.EmployeeDto;
import com.example.crm.entity.Employee;
import com.example.crm.entity.EmployeeDetail;
import com.example.crm.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.Random;

@Controller
public class EmployeeController {

    final private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employeeForm")
    public String showForm(Model model) {
        EmployeeDto employee = new EmployeeDto();
        employee.setEmail("Phan" + new Random().nextInt(100) + "@gmail.com");
        model.addAttribute("employee", employee);
        model.addAttribute("gender", Arrays.asList("Male", "Female"));
        model.addAttribute("studentList", employeeService.getAll());
        return "showStudentForm";
    }

    @PostMapping("/addEmployee")
    public RedirectView addEmployee(@ModelAttribute EmployeeDto employeeDto, Model model) {
        Employee employee = new Employee(null, employeeDto.getFirstName(),employeeDto.getLastName()
        ,employeeDto.getEmail(), null, new EmployeeDetail(employeeDto.getSalary()));

        employeeService.save(employee);
        model.addAttribute("employee", new Employee());
        model.addAttribute("gender", Arrays.asList("Male", "Female"));
        model.addAttribute("studentList", employeeService.getAll());
        return new RedirectView("/studentForm");
    }


    @GetMapping("/deleteEmployee")
    public RedirectView delete(@RequestParam Long employeeId) {
        employeeService.delete(employeeId);
        return new RedirectView("/studentForm");
    }
}
