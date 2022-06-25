package com.example.demospringapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MessageTester {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MessageTester.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
