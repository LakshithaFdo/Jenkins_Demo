package com.lakshithafdo.jenkinsDemo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "Hello Spring Boot and Github Action";
    }
}
