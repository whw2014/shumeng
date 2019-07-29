package com.example.smdt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/abc")
    public void getInfo(){
        System.out.println("ascascs");
        System.out.println("ascascs");
        System.out.println("dev_01");
    }
}
