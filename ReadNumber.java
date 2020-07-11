package com.LearnToCode;

import java.util.Scanner;

public class ReadNumber {
    private double value;
    private String term;
    private int min;
    private int max;

    private int principal;
    private double apr;
    private int years;

    public ReadNumber(String term) {
        setTerm(term);
        setMinMax();
        readNumber();
        assignValue();
    }

    private void setTerm(String term) {
        if (!(term.toLowerCase().equals("principal") ||
                !term.toLowerCase().equals("apr") ||
                !term.toLowerCase().equals("years"))) {
            throw new IllegalArgumentException("Please enter valid term (principal, apr, years): ");
        }
        this.term = term.toLowerCase();
    }

    private void setMinMax () {
        if (term.equals("principal")) {
            min = 1_000;
            max = 1_000_000;
        }

        else if (term.equals("apr")) {
            min = 0;
            max = 30;
        }

        else if (term.equals("years")) {
            min = 0;
            max = 20;
        }
    }

    private void readNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the " + term + " : ");
        double temp = scanner.nextDouble();
        if (temp < min  && temp > max) {
            throw new IllegalArgumentException("Enter a value more than " + min + " and less than " + max);
        }
        value = temp;
    }

    private double getValue() {
        return value;
    }

    public double assignValue () {
        switch(term) {
            case "principal":
                principal = (int) value;
                break;

            case "apr":
                apr = value;
                break;

            case "years":
                years = (int) value;
                break;
        }
        return value;
    }
}