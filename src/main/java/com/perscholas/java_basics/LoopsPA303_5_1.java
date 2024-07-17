package com.perscholas.java_basics;

import java.util.Scanner;

public class LoopsPA303_5_1 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);

        int tableSize = sc.nextInt();

        // Print the header row
        System.out.print("    ");
        for (int i = 1; i <= tableSize; i++) {
            //used printf for better formating
            System.out.printf("%4d", i);
        }
        System.out.println();
        //.repeat reapats the dashes for a set number of times
        System.out.println("----".repeat(tableSize+1));

        // Print the multiplication table
        for (int i = 1; i <= tableSize; i++) {
            //u
            System.out.printf("%2d |",i);
            for (int j = 1; j <= tableSize; j++) {
                // Print the product of the row and column numbers
                System.out.printf("%4d", i * j);
            }
            System.out.println();
            sc.close();
        }
}


}
