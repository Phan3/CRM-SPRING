package com.example.crm.restController;

import com.example.crm.entity.Employee;
import com.example.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping(value = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    //@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/assign/{projectId}/{employeeId}")
    public ResponseEntity<Employee> assignEmployeeToProject(@PathVariable int projectId
            , @PathVariable int employeeId){
        Employee employee = employeeService.assignEmployeeToProject(projectId, employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/employees")
    public List<Employee> getAll() {
        employeeService.getAll();
        return employeeService.getAll();
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        employee.setId(0L);
        return employeeService.save(employee);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity<List<Employee>> findByName(@PathVariable String name) {
        List<Employee> employees = employeeService.findByName(name);
        if(CollectionUtils.isEmpty(employees)) {
            throw new StudentNotFoundException("Student not found");
        }
        return new ResponseEntity<>(employeeService.findByName(name), HttpStatus.OK);
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
        return new ResponseEntity<>(new StudentErrorResponse(404, exception.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
    }
}
