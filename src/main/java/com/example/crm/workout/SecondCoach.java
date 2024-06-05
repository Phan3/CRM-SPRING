package com.example.crm.workout;

import org.springframework.stereotype.Component;

@Component
public class SecondCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return null;
    }

    public SecondCoach() {
    }
}
