package com.example.crm.controller;

import com.example.crm.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    private final EmployeeService employeeService;

    public DemoController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping( "/showForm")
    public String showFormsdfsd(Model theModel) {
        theModel.addAttribute("studentList", employeeService.getAll());
        return "showForm";
    }

    @PostMapping("/processForm")
    public String processForm(HttpServletRequest request, @RequestParam String studentName, Model theModel) {
        theModel.addAttribute("name", studentName.toUpperCase());
        return "studentFormConfirm";
    }

}
