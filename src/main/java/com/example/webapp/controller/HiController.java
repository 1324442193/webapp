package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HiController {
    @GetMapping("/hi")//映射输入内容
    @RequestMapping("/hi")//
    public String hi(){
        return "hi spring boot";
    }
}
