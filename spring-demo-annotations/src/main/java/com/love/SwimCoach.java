package com.love;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach
{
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return email;
    }

    @Override
    public String getDailyFortune() {
        return team;
    }
}