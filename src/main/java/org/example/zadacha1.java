package org.example;

public class zadacha1 {

    public static void main(String[] args) {
        // Примерно извикване на метода със заплата
        printYearlySalary(2500);
    }

    // Метод за изчисляване и отпечатване на годишната заплата
    public static void printYearlySalary(double monthlySalary) {
        double yearlySalary = monthlySalary * 12;
        System.out.println("Годишната заплата при месечна заплата от " + monthlySalary + " е: " + yearlySalary);
    }
}