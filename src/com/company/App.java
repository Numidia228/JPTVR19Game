package com.company;

import java.util.Random;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("Привет.");
        System.out.println("Загадйте минимальное и максимальное число...");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Минимальное: ");
        int userNumber1 = scanner.nextInt();
        System.out.print("Максимальное: ");
        int userNumber2 = scanner.nextInt();
        System.out.print("Программа загадала число от " + userNumber1 + " до " + userNumber2 + ", угадай: ");
        int attempt = 0;
        do {

            int myNumber = random.nextInt((userNumber2 - userNumber1) + 1) + userNumber1;
            System.out.println(myNumber);
            System.out.print("");
            int userNumber = scanner.nextInt();
            if (myNumber == userNumber) {
                System.out.println("Ты угадал, загаданное число: " + myNumber);
                break;
            }else {
                if (attempt > 2) {
                    System.out.println("Ты не угадал, загаданное число: " + myNumber);
                    break;
                } else {
                    System.out.print("Попробуй ещё раз: ");
                }
                attempt++;
                }
        }while (true);
    }
}
