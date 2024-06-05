package com.example.crm.workout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {

    private Coach coach;

    @GetMapping("getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @Autowired
    public void setCoach(@Qualifier("myCoach") Coach coach) {
        this.coach = coach;
    }
}
