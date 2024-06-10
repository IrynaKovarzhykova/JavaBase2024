package homework7;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }


        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeSum);


        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);


        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1 && firstNegativeIndex < array.length - 1) {
            int sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.printf("Average of numbers after the first negative number: %.2f\n", average);
        } else {
            System.out.println("There are no numbers after the first negative number.");
        }
    }
}


