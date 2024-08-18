package com.mybank.gatewayService.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponseDto> handleDataNotFoundException(RuntimeException ex) {
    	ErrorResponseDto  errorResponse = new ErrorResponseDto(HttpStatus.UNAUTHORIZED.toString(), HttpStatus.UNAUTHORIZED.value() ,  ex.getMessage(), new Date());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}