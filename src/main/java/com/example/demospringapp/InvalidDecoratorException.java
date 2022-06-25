package com.example.demospringapp;

public class InvalidDecoratorException extends RuntimeException{
    public InvalidDecoratorException(String message) {
        super(message);
    }
}
