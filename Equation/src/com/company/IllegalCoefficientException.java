package com.company;

public class IllegalCoefficientException extends IllegalArgumentException {
    public void getMessage(String message){
        System.out.println(message);
    }
    public IllegalCoefficientException(String message){
        super();
        getMessage(message);
    }
}
