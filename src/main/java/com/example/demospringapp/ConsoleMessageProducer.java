package com.example.demospringapp;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ConsoleMessageProducer implements MessageProducer{

    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomość: ");
        String message = scanner.nextLine();
        return "Example message " + message;
    }
}
