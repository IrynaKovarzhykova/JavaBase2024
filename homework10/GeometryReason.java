package homework10;

import java.util.Scanner;

public class GeometryReason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("\nEnter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is " + volume);


        int[] array = {10, 20, 30, 40, 50};
        int sum = calculateArraySum(array);
        System.out.println("\nArray elements: " + java.util.Arrays.toString(array));
        System.out.println("The sum of all elements in the array is " + sum);


        System.out.print("\nEnter a string: ");
        scanner.nextLine();  // Consume newline left-over
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("The string in reverse order: " + reversedString);


        System.out.print("\nEnter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int powerResult = power(a, b);
        System.out.println("The result of " + a + "^" + b + " is " + powerResult);


        System.out.print("\nEnter an integer n: ");
        int n = scanner.nextInt();
        System.out.print("Enter a text string: ");
        scanner.nextLine();  // Consume newline left-over
        String text = scanner.nextLine();
        printTextNTimes(n, text);
    }


    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);
    }


    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }


    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }


    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }


    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }


    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
