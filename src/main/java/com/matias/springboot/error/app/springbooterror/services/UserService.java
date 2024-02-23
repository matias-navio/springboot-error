package com.matias.springboot.error.app.springbooterror.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matias.springboot.error.app.springbooterror.models.domain.User;

@Service
public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
