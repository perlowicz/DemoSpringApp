package com.example.demospringapp.producer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@Profile("console")
public class ConsoleMessageProducer implements MessageProducer{

    private final Scanner scanner;

    public ConsoleMessageProducer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomość: ");
        String message = scanner.nextLine();
        return "Example message " + message;
    }
}
