package org.example.exeption.exeption;


import org.example.exeption.CustomErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AnimalNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomErrorMessage handleNoSuchAnimalException(AnimalNotFoundException exception) {
        return new CustomErrorMessage(exception.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(CarNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomErrorMessage handleNoSuchCarException(CarNotFoundException exception) {
        return new CustomErrorMessage(exception.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomErrorMessage handleIllegalArgumentException(IllegalArgumentException exception) {
        return new CustomErrorMessage(exception.getMessage(), LocalDateTime.now());
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CustomErrorMessage handleGeneralxception(Exception exception) {
        return new CustomErrorMessage(exception.getMessage(), LocalDateTime.now());
    }

}
