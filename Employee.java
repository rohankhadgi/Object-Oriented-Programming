package com.MortgageCalculator;

public class Employee {
    private int baseSalary;
    private int hourlyWage;
    private int extraHours;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyWage, int extraHours) {
        setSalary(baseSalary);
        setHourlyWage(hourlyWage);
        setExtraHours(extraHours);

        numberOfEmployees++;
    }

    public static void printNoOfEmployees() {
        System.out.println("Total no. of employees: " + numberOfEmployees);
    }

    public int calculateWage (int extraHours) {
        this.extraHours = extraHours;
        return baseSalary + (extraHours * hourlyWage);
    }

    public int calculateWage () {
        return baseSalary + (extraHours * hourlyWage);
    }

    private void setSalary (int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary must be greater than 0.");
        this.baseSalary = baseSalary;
    }

    private int getSalary () {
        return baseSalary;
    }

    private void setHourlyWage (int hourlyWage) {
        if (hourlyWage < 0)
            throw new IllegalArgumentException("Hourly wage must be more than 0.");
        this.hourlyWage = hourlyWage;
    }

    private int getHourlyWage() {
        return hourlyWage;
    }

    private void setExtraHours(int extraHours) {
        if (extraHours < 0)
            throw new IllegalArgumentException("Extra hours must be greater than or equal to 0.");
        this.extraHours = extraHours;
    }

    private int getExtraHours() {
        return extraHours;
    }
}
