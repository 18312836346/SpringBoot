package com.scs.soft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MySpringBootController {
    @RequestMapping("/hello")
  public String hello(){
        return  "Hello,Spring Boot!";
    }
}
