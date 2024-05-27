package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for thr dependency
    private Coach myCoach;

//    private Coach anotherCoach;

    // define the constructor for dependency injection.
    @Autowired
   // public DemoController(@Qualifier("SwimCoach") Coach theCoach @Qualifier("trackCoach") Coach theAnotherCoach
    public DemoController(@Qualifier("hey") Coach theCoach
                           ){
        System.out.println("In constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
    }

//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    @Autowired
//    public void setCoach(Coach theCoach){ // we can give any name which we want for this method, and it would work the same.
//        myCoach = theCoach;
//    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: myCoach = anotherCoach, " + (myCoach == anotherCoach);
//    }


}
