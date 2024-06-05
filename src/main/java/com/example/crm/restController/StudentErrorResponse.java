package com.example.crm.restController;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentErrorResponse {
    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    int status;
    String message;

    long timeStamp;
}
