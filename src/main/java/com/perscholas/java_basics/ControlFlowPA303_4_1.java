package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowPA303_4_1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 10){
            x = 15;
            System.out.println(x);

        }
        sc.close();

    }
}
