package com.lakshithafdo.jenkinsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String hello(){
        return helloService.hello();
    }
}
