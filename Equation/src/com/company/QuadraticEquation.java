package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class QuadraticEquation extends Equation {
    @Override
    public void solve(){
        double[] coeffs = Arrays.copyOf(this.getCoefficient(), 3);
        double a = coeffs[0];
        double b = coeffs[1];
        double c = coeffs[2];
        double[] result = new double[2];
        if(a == 0 || b == 0) {
            throw new IllegalCoefficientException("The equation is not quadratic");
        }
        if(c == 0) {
            result[0] =  0;
            result[1] = -b;
            this.setResultCount(2);
        }
        else {
            double discr = Math.sqrt( b*b-4*a*c);
            if(discr == 0) {
                result[0] = -b/2*a;
                this.setResultCount(1);
            }
            else if(discr > 0) {
                result[0] = (-b + discr) / (2*a);
                result[1] = (-b - discr) / (2*a);
                this.setResultCount(2);
            }
            else {
                System.out.print("No real solutions!");
                this.setResultCount(0);
            }
        }
        this.setResult(result);
    }

    @Override
    public void printSolution(){
        int resultCount = this.getResultCount();
        double[] result = Arrays.copyOf(this.getResult(), resultCount);
        if(resultCount != 0) {
            String output = "";
            for(int i = 0; i < resultCount; i++ ){
                output = output + result[i] + " ";
            }
            System.out.print("Solutions: " + output);
        }
    }

    @Override
    public void getUserCoefficients(){
        double coeff[] = new double[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            if(i == 0) {
                System.out.print("Enter coefficient 'a' (a =/= 0): ");
            }
            else if(i == 1){
                System.out.print("Enter coefficient 'b': ");
            }
            else {
                System.out.print("Enter coefficient 'c': ");
            }
            coeff[i] = sc.nextDouble();
        }
        this.setCoefficient(coeff);
    }

    public QuadraticEquation() {
        getUserCoefficients();
    }
}