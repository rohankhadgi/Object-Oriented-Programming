package com.LearnToCode;

public class TaxCalculator2018 extends AbstractTaxCalculator {
    private double taxableIncome;
    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        getTaxableIncome(100_000, 20_000)
        return taxableIncome*0.3;
    }
}
