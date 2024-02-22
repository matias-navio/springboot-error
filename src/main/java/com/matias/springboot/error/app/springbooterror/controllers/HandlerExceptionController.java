package com.matias.springboot.error.app.springbooterror.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.matias.springboot.error.app.springbooterror.models.Error;

// controlador creado para manejar excepciones de forma global
@RestControllerAdvice
public class HandlerExceptionController {
    private Error error;

    // metodo que devuelve una respuesta con el error que tenemos en el servidor, en este caso division por cero
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionByZero(Exception e){
        error = new Error(e.getMessage(), "División por cero", 500, new Date());

        // cualquiera de los dos return es valido
        // return ResponseEntity.internalServerError().body(error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    } 

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFound(Exception e){
        error = new Error(e.getMessage(), "Ruta no encontrada", 404, new Date());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    } 

}
