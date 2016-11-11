package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 1 for Linear equation or 2 for Quadratic equation: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        while(true) {
            if (choice.equals("1")) {
                LinearEquation first = new LinearEquation();
                first.solve();
                first.printSolution();
                break;
            } else if (choice.equals("2")) {
                QuadraticEquation second = new QuadraticEquation();
                second.solve();
                second.printSolution();
                break;
            } else {
                System.out.print("Incorrect input!");
                System.out.println("Enter 1 for Linear equation or 2 for Quadratic equation: ");
            }
            choice = sc.next();
        }

    }
}
