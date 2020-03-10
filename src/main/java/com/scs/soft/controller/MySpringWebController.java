package com.scs.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/springWeb")
@ResponseBody

public class MySpringWebController {
    @RequestMapping("/hello")
    public String hello(){
        return "<h2>Hello,Spring Boot<h2>";
    }
}
