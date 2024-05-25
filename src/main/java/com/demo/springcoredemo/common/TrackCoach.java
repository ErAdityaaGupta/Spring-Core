package com.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice running for 30 minutes.";
    }
}
