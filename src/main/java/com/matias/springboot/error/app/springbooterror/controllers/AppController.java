package com.matias.springboot.error.app.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matias.springboot.error.app.springbooterror.exceptions.UserNotFoundException;
import com.matias.springboot.error.app.springbooterror.models.domain.User;
import com.matias.springboot.error.app.springbooterror.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService uService;

    @GetMapping("/app")
    public String index(){
        // int num = 100/0;
        int value = Integer.parseInt("10x");
        return "Ok 200";
    }

    @GetMapping("/users/{id}")
    public User users(@PathVariable Long id){
        // en caso de que el usuario sea null lanzamos una excepcion de nuestra clase que creamos para manejarla
        User user = uService.findById(id).
        orElseThrow(() -> new UserNotFoundException("El usuario no existe en la base de datos!"));

        return user;
    }
}
