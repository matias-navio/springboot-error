package com.matias.springboot.error.app.springbooterror.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.springboot.error.app.springbooterror.AppConfig;
import com.matias.springboot.error.app.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    
    @Autowired
    private AppConfig uList;

    @Override
    public List<User> findAll() {
        
        return uList.userList();
    }

    @Override
    public Optional<User> findById(Long id) {
        // con la api Optional y el metodo ofNulable devolvemos el user si existe, y si no manejamos una excepcion
        return Optional.ofNullable(uList.userList().stream().
                                filter(u -> u.getId().equals(id)).
                                findFirst().orElse(null));
    }

}
