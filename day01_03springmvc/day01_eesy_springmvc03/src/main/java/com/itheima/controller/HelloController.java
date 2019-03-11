package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HelloController {
   @RequestMapping("/hello")
    public String sayHello(){
       System.out.println("执行了");
       return "success";
        }
}
