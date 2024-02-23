package com.matias.springboot.error.app.springbooterror.exceptions;

public class UserNotFoundException extends RuntimeException{

    // constructor que recibe el mensaje de error
    public UserNotFoundException(String message){
        super(message);
    }
}
