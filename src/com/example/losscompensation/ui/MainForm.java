package com.example.losscompensation.ui;

import com.example.losscompensation.model.UserInput;
import com.example.losscompensation.service.CompensationCalculation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextField disabilityPercentageField;
    private JTextField ageField;
    private JTextField lastIncomeField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public MainForm() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        disabilityPercentageField = new JTextField(20);
        ageField = new JTextField(20);
        lastIncomeField = new JTextField(20);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Compensation Amount: ");

        mainPanel.add(new JLabel("Disability Percentage:"));
        mainPanel.add(disabilityPercentageField);
        mainPanel.add(new JLabel("Age:"));
        mainPanel.add(ageField);
        mainPanel.add(new JLabel("Last Income:"));
        mainPanel.add(lastIncomeField);
        mainPanel.add(calculateButton);
        mainPanel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int disabilityPercentage = Integer.parseInt(disabilityPercentageField.getText());
                    int age = Integer.parseInt(ageField.getText());
                    double lastIncome = Double.parseDouble(lastIncomeField.getText());

                    UserInput userInput = new UserInput(disabilityPercentage, age, lastIncome);
                    CompensationCalculation calculation = new CompensationCalculation();
                    double compensation = calculation.calculateCompensation(userInput);

                    resultLabel.setText("Compensation Amount: " + compensation);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Loss Compensation Calculator");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
