package com.LearnToCode;

import java.text.NumberFormat;

public class CalculateRemainingBalance {
    final int PERCENT_TO_DEC = 100;
    final int YRS_TO_MTS = 12;

    private int principal;
    private double apr;
    private int years;

    public CalculateRemainingBalance (int principal, double apr, int years) {
        var calculateMortgage = new CalculateMortgage(principal, apr, years);
        this.principal = calculateMortgage.getPrincipal();
        this.apr = calculateMortgage.getAPR();
        this.years = calculateMortgage.getYears();
    }

    public void printRemainingBalance () {
        System.out.println("\nRemaining Balance: ");
        System.out.println("------------------");

        years *= YRS_TO_MTS;
        double monthlyInterest = apr / PERCENT_TO_DEC / YRS_TO_MTS;
        int paidDuration = 1;

        while (paidDuration != (years + 1)) {
            double remainingBalance = principal *
                    ((Math.pow(1 + monthlyInterest, years)-Math.pow(1+monthlyInterest, paidDuration))/
                            (Math.pow(1 + monthlyInterest, years)-1));
            System.out.println("After " + paidDuration + " payments: "+
                    NumberFormat.getCurrencyInstance().format(remainingBalance));
            paidDuration++;
        }
    }

}
