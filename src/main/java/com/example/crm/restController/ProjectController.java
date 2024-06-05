package com.example.crm.restController;

import com.example.crm.entity.Project;
import com.example.crm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "projects")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("")
    public Project save(@RequestBody Project project) {
        //project.setId(0L);
        return projectService.save(project);
    }

    @GetMapping("")
    public ResponseEntity<List<Project>> findAll(){
        return new ResponseEntity<>(projectService.findAll(), HttpStatus.OK);
    }
}
