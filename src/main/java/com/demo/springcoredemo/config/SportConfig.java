package com.demo.springcoredemo.config;

import com.demo.springcoredemo.common.Coach;
import com.demo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("hey")
    public Coach SwimCoach(){
        return new SwimCoach();
    }
}
