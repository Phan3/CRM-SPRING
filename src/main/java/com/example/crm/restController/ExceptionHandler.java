package com.example.crm.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<StudentErrorResponse> studentException(StudentNotFoundException exception) {
        return new ResponseEntity<>(new StudentErrorResponse(404, exception.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
    }
}
