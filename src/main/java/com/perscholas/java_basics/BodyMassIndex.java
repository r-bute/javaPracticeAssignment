package com.perscholas.java_basics;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight, height, bodyMassIndex;
        System.out.println("Enter the weight in kilograms");
        weight = in.nextDouble();
        System.out.println("Enter the height in cm");
        height = in.nextDouble();
        bodyMassIndex = weight * (height * height);
        //System.out.println("Body Mass Index: " + bodyMassIndex);

        if (bodyMassIndex <= 18.5) {
            System.out.println("The body mass index is " + bodyMassIndex + " is underweight .");
        }
        else if (bodyMassIndex <= 25.5) {
            System.out.println("The body mass index is " + bodyMassIndex + " is normal .");
        }
        else if (bodyMassIndex <= 30) {
            System.out.println("The body mass index is " + bodyMassIndex + " is overweight .");
        } else {
            System.out.println("The body mass index is " + bodyMassIndex + " is Obese .");
        }

    }
}
