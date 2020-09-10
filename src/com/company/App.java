package com.company;

import java.util.Random;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("Привет.");
        System.out.print("Программа загадала число от 0 до 5, угадай: ");
        Random random = new Random();
        int attempt = 0;
        do {


        int myNumber = random.nextInt(5 - 0 + 1) + 0;
        Scanner scanner = new Scanner(System.in);
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
