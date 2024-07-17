package homework16;

public class SimpleCalculator {

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double subtract(double a, double b, double c) {
        return a - b - c;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }


    public double divide(double a, double b, double c) {


        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b / c;
    }
}



