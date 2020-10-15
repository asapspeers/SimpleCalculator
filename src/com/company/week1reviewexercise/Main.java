package com.company.week1reviewexercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] vars = new int[1];
        System.out.println("Welcome to the Dream Corp Calculator! Type two numbers.");
        for(int i = 0; i < vars.length; i++) {
            vars[i] = sc.nextInt();
        }

        int number = vars[0];
        String s = String.valueOf(number);
        int firstInt = 0;
        int secondInt = 0;

        try {
            firstInt = Character.digit(s.charAt(0), 10);
            secondInt = Character.digit(s.charAt(1), 10);
        } catch (Exception e){
            System.out.println("Missing one or more integer(s)");
            System.exit(0);
        }

        if (vars != null ){
            System.out.println("Now pick an operand:");
            String operand = sc.next();
            if (operand.equals("*")) {
                System.out.println( firstInt + " " + operand + " " +  secondInt + " = " + (firstInt * secondInt));
            } else if (operand.equals("+")) {
                System.out.println( firstInt + " " + operand + " " +  secondInt + " = " + (firstInt + secondInt));
            } else if  (operand.equals("-")) {
                System.out.println( firstInt + " " + operand + " " +  secondInt + " = " + (firstInt - secondInt));
            } else if  (operand.equals("/")) {
                double fir = firstInt;
                double sec = secondInt;
                double d = fir / sec;
                System.out.println( firstInt + " " + operand + " " +  secondInt + " = " + d);
            }else {
                System.out.println("Couldn't identify operand. Please try again.");
                System.exit(0);
            }
        }
    }
}

