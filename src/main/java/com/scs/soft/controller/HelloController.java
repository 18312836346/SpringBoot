package com.scs.soft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String  hello(){
        return "hello spring Boot !!!";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable (value ="name") String name){
        return "Hello,"+name;
    }
}
