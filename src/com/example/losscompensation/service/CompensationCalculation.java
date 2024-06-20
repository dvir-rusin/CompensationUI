package com.example.losscompensation.service;

import com.example.losscompensation.model.UserInput;

public class CompensationCalculation {
    public double calculateCompensation(UserInput input) {
        // Assuming a simple calculation based on a fixed formula for demonstration purposes
        double futureEarningsLoss = input.getLastIncome() * input.getDisabilityPercentage() / 100;
        int yearsUntilRetirement = 67 - input.getAge();
        return futureEarningsLoss * yearsUntilRetirement;
    }
}
