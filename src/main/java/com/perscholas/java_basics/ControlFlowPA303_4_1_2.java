package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowPA303_4_1_2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 10){
            System.out.println(x + " is less than 10");
        }
        else  {
            System.out.println(x + " is greater than 10");
        }
    }
}
