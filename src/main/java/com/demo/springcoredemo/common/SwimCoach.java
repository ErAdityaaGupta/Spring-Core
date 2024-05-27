package com.demo.springcoredemo.common;

// we are not using the @component annotation on purpose as we want to configure this using the java code
// and the bean annotation.
public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 4 laps as a warmup for the practice.";
    }
}
