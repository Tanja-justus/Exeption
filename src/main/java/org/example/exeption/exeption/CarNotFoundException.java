package org.example.exeption.exeption;


import java.util.NoSuchElementException;

public class CarNotFoundException extends NoSuchElementException{

    public CarNotFoundException ( String message) {

        super(message);
    }
}
