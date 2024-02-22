package com.matias.springboot.error.app.springbooterror.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/app")
    public String index(){

        int num = 100/0;
        return "Ok 200";
    }
}
