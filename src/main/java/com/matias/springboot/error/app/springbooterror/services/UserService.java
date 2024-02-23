package com.matias.springboot.error.app.springbooterror.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.matias.springboot.error.app.springbooterror.models.domain.User;

@Service
public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
}
