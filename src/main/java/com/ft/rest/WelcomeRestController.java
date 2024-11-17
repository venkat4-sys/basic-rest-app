package com.ft.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/getMsg")
    public String getWelcomeMsg(){
        return "hello world dot ,i am vasikar";
    }
}
