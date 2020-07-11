package com.LearnToCode;;

import java.text.NumberFormat;

public class CalculateMortgage {
    final int PERCENT_TO_DEC = 100;
    final int YRS_TO_MTS = 12;

    private int principal;
    private double apr;
    private int years;

    public CalculateMortgage (int principal, double apr, int years) {
        setPrincipal(principal);
        setAPR(apr);
        setYears(years);
    }

    private void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getPrincipal() {
        return principal;
    }

    private void setAPR(double apr) {
        this.apr = apr;
    }

    public double getAPR() {
        return apr;
    }

    private void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public double calculateMortgage () {
        years *= YRS_TO_MTS;
        double monthlyInterest = apr / PERCENT_TO_DEC / YRS_TO_MTS;

        double monthlyPayment = principal *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, years))/
                        (Math.pow(1 + monthlyInterest, years) - 1));

        return monthlyPayment;
    }

    public void printMonthlyPayment(double monthlyPayment) {
        System.out.println("\nYour monthly payment is: " +
        NumberFormat.getCurrencyInstance().format(monthlyPayment));
        System.out.println("----------------------------------");
    }
}

