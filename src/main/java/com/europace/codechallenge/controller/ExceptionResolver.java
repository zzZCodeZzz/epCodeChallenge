package com.europace.codechallenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Todo create sufficient error responses

@ControllerAdvice
public class ExceptionResolver {

    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ResponseEntity validationError(Exception ex) {
        return ResponseEntity.badRequest().body("deserialization error");
    }
}
