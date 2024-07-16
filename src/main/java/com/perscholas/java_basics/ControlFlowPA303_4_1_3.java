package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowPA303_4_1_3 {

    public void rangeCalculation(){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0){
            System.out.println("Enter positive number");
        }
        else if (x < 10) {
            System.out.println(x + " is less than 10.");
        }
        else if (x < 20){
            System.out.println(x + " between 10 and 20.");
        }
        else  {
            System.out.println(x + " is greater than or equal to 20.");
        }

        sc.close();

    }

    public void outOfRangeCalculation(){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("Enter positive number");
        }
        else if (x < 10 || x > 20) {
            System.out.println(x +" is Out of range.");
        }
        else {
            System.out.println(x + " is In range.");
        }
    }

    public void gradePrintOut(){
        System.out.println("Enter Marks");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Marks"+"     Grade ");

        if (x >= 90 && x <= 100) {
            System.out.println( x + "          A ");
        }
        else if (x >= 80 && x < 90) {
            System.out.println( x + "          B ");
        }
        else if (x >= 70 && x < 80) {
            System.out.println( x + "          C ");
        }
        else if (x >= 60 && x < 70) {
            System.out.println( x + "          D ");
        }
        else if (x>=0 && x < 60) {
            System.out.println( x + "          F ");
        }
        else{
            System.out.println( x +"       Score out of range. ");
        }
    }

    public void weekdayCalculation(){
        System.out.println("Enter Weekday");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
            default:System.out.println("Out of range.");

        }


    }

    public void taxCalculation(){
        System.out.println("Enter Tax Filling Status : ");
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();
        //sc.next();
        System.out.println("Enter income : ");
        int income = sc.nextInt();

        switch (status){
            case "S":
                if(income< 0 && income <= 8350){
                    System.out.println("User filing as Single will pay a marginal Tax rate of 10%");

                } else if (income < 8351 && income <= 33950) {
                    System.out.println("User filing as Single will pay a marginal Tax rate of 15%.");

                }
                else if (income < 33951 && income <= 82250) {
                    System.out.println("User filing as Single will pay a marginal Tax rate of 25%.");

                }
                else if (income < 82251 && income <= 171550) {
                    System.out.println("User filing as Single will pay a marginal Tax rate of 28%.");

                }
                else if (income < 171551 && income <= 372950) {
                    System.out.println("User filing as Single will pay a marginal Tax rate of 33%.");

                }
                else {
                    System.out.println("User filing as Single will pay a marginal Tax rate of 35%.");
                }
                break;
            case "MFJ" :
                if(income< 0 && income <= 16700){
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 10%");

                } else if (income < 16701 && income <= 67900) {
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 15%.");

                }
                else if (income < 67900 && income <= 137050) {
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 25%.");

                }
                else if (income < 137050 && income <= 208850) {
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 28%.");

                }
                else if (income < 208850 && income <= 372950) {
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 33%.");

                }
                else {
                    System.out.println("User filing as Married Filing Jointly or Qualifying Widow(er) will pay a marginal Tax rate of 35%.");
                }
                break;
            case "MFS" :
                if(income< 0 && income <= 8350){
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 10%");

                } else if (income < 8351 && income <= 33950) {
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 15%.");

                }
                else if (income < 33951 && income <= 68525) {
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 25%.");

                }
                else if (income < 68526 && income <= 104425) {
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 28%.");

                }
                else if (income < 104426 && income <= 186475) {
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 33%.");

                }
                else {
                    System.out.println("User filing as Married Filing Separately will pay a marginal Tax rate of 35%.");
                }
                break;
            case "HOH" :
                if(income< 0 && income <= 11950){
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 10%");

                } else if (income < 11951 && income <= 45500) {
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 15%.");

                }
                else if (income < 45500 && income <= 117450) {
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 25%.");

                }
                else if (income < 117450 && income <= 190200) {
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 28%.");

                }
                else if (income < 190201 && income <= 372950) {
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 33%.");

                }
                else {
                    System.out.println("User filing as Head of Household will pay a marginal Tax rate of 35%.");
                }
                break;


            default:System.out.println("Invalid input.");
        }

    }



}
