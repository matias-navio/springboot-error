package com.matias.springboot.error.app.springbooterror.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.matias.springboot.error.app.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    List<User> users;
    public UserServiceImpl(){
        users = Arrays.asList(
            new User(1L, "Matias", "Navio"),
            new User(2L, "Mariano", "Correa"),
            new User(3L, "Juan", "Perez"));
    }

    @Override
    public List<User> findAll() {
        
        return users;
    }

    @Override
    public User findById(Long id) {
        
        return (User) users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

}
