package com.matias.springboot.error.app.springbooterror;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.matias.springboot.error.app.springbooterror.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    public List<User> userList(){
        return Arrays.asList(
            new User(1L, "Matias", "Navio"),
            new User(2L, "Mariano", "Correa"),
            new User(3L, "Juan", "Perez"));
    }
    
}
