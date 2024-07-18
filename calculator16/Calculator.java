package calculator16;

import homework16.SimpleCalculator;

public class Calculator  {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        double a = 6, b = 2, c = 3;

        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };


        printer.print("Addition: " + calculator.add(a, b, c));
        printer.print("Subtraction: " + calculator.subtract(a, b, c));
        printer.print("Multiplication: " + calculator.multiply(a, b, c));
        printer.print("Division: " + calculator.divide(a, b, c));
    }
}

