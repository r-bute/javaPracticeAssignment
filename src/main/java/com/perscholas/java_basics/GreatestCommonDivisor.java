package com.perscholas.java_basics;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public void gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Both numbers must be positive integers.");
        } else {
            int gcd = 1;
            for (int i = 1; i <= Math.min(num1, num2); i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");
        }
    }

    public void tuitionDoubling(double initialTuition) {

        double tuition = initialTuition;
        double targetTuition = initialTuition * 2;
        double rate = 0.07;
        int years = 0;

        while (tuition < targetTuition) {
            tuition += tuition * rate;
            years++;
           // System.out.println(tuition);

        }

        System.out.println("Tuition will be doubled in " + years + " years.");
    }

}
