package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type anything: ");
        String input = scanner.nextLine();

        StringProcessor processor = new StringProcessor();
        processor.process(input);

        scanner.close();
    }
}
