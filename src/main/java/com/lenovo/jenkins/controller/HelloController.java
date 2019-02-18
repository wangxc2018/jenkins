package com.lenovo.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.err.println("调用 /hello");
        return "hello Spring Boot";
    }
}
