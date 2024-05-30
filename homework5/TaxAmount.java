package homework5;

import java.util.Scanner;

public class TaxAmount {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the income: ");
    double income = scanner.nextDouble();
    double taxAmount = 0;
    if (income <= 10000) {
        taxAmount = income * 0.025;
    } else if (income <= 25000) {
        taxAmount = income * 0.043;
    } else {
        taxAmount = income * 0.067;
    }
    System.out.printf("Income: EUR %.2f%n", income);
    System.out.printf("Tax amount: EUR %.2f%n", taxAmount);
    }
}

