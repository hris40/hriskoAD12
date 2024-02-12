package org.example;

public class zadacha3 {

    public static void main(String[] args) {
        // Извикване на метода с конкретни сума и период
        calculateLoanPaymentAndTotal(10000, 12);
    }

    // Метод за изчисляване на месечна вноска и обща сума за връщане
    public static void calculateLoanPaymentAndTotal(double loanAmount, int months) {
        double annualInterestRate = 0.07; // Годишен лихвен процент
        double monthlyInterestRate = annualInterestRate / 12; // Месечен лихвен процент
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -months));
        double totalPayment = monthlyPayment * months;

        System.out.println("Месечната вноска за заем от " + loanAmount + " лв. за период от " + months + " месеца е: " + monthlyPayment + " лв.");
        System.out.println("Общата сума за връщане е: " + totalPayment + " лв.");
    }
}
