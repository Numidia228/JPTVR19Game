package com.company;

import java.util.Random;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("Привет.");
        System.out.print("Программа загадала число, угадай: ");
        Random random = new Random();
        int myNumber = random.nextInt(5 - 0 + 1) + 0;
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if (myNumber == userNumber)
            System.out.println("Ты угадал, загаданное число: " + myNumber);
        else
            System.out.println("Ты не угадал, загаданное число: " + myNumber);

    }
}
