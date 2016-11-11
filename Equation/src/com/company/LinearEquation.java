package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LinearEquation extends Equation {
    @Override
    public void solve() {

        double[] coeffs = Arrays.copyOf(this.getCoefficient(), 2);
        double[] result = new double[1];
        if(coeffs[0] == 0 && coeffs[1] == 0) {
            throw new IllegalCoefficientException("Every real number is a solution!");
        }
        else if(coeffs[0] == 0) {;
            throw new IllegalCoefficientException("Equation is not solvable!");
        }
        else {
            result[0] = (-(coeffs[1] / coeffs[0]));
            this.setResult(result);
        }
    }

    @Override
    public void printSolution() {
        double[] result = Arrays.copyOf(this.getResult(), 1);
        if(result != null) {
            System.out.print("The equation has one solution: " + result[0]);
        }
    }

    @Override
    public void getUserCoefficients(){
        double[] coeff = new double[2];
        Scanner sc = new Scanner(System.in);
        String reader;
        double convReader = -1;
        for(int i = 0; i < 2; i++) {
            do {
                if(i == 0) {
                    System.out.println("Enter coefficient 'a' (a =/= 0)");
                    reader = sc.next();
                    try {
                        convReader = Double.parseDouble(reader);
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect Input");
                        convReader = -1;
                    }
                }
                else {
                    System.out.println("Enter coefficient 'b'");
                    reader = sc.next();
                    try {
                        convReader = Double.parseDouble(reader);
                    } catch (NumberFormatException e) {
                        System.out.print("Incorrect Input");
                        convReader = -1;
                    }
                }
            }while (convReader <= 0 );
            coeff[i] = convReader;
        }
        this.setCoefficient(coeff);
    }

    public LinearEquation() {
        getUserCoefficients();
    }
}
