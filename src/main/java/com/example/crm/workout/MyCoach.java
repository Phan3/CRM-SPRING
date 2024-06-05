package com.example.crm.workout;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "This is daily workout";
    }
}
