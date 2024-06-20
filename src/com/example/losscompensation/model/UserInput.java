package com.example.losscompensation.model;

public class UserInput {
    private int disabilityPercentage;
    private int age;
    private double lastIncome;

    public UserInput(int disabilityPercentage, int age, double lastIncome) {
        this.disabilityPercentage = disabilityPercentage;
        this.age = age;
        this.lastIncome = lastIncome;
    }

    public int getDisabilityPercentage() {
        return disabilityPercentage;
    }

    public int getAge() {
        return age;
    }

    public double getLastIncome() {
        return lastIncome;

    }
}
