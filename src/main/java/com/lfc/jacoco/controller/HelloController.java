package com.lfc.jacoco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * jacoco test
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot Test For Jacoco!";
    }

    @RequestMapping("/test")
    public String test() {
        return "Test Jacoco!";
    }
}
