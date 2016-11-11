package com.company;

import java.util.Arrays;

public abstract class Equation implements Solvable {
    private double[] result;
    private double[] coefficient;
    private int resultCount;

    public abstract void getUserCoefficients();

    public double[] getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double[] inputCoefficient) {
        this.coefficient = Arrays.copyOf(inputCoefficient, inputCoefficient.length);
    }

    protected double[] getResult() {
        return result;
    }

    public void setResult(double[] result) {
        this.result = result;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }
}
