package com.xue.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${zuul.routes.item-service.serviceid}")
    private String path;

    @GetMapping("hello")
    public String test(){
        return "hello"+path;
    }

}
