package homework6;

public class Сalculating {
    public static void main(String[] args) {
        int totalSum = 0;

        for (int i = 1; i <= 6; i++) {
            totalSum += i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, totalSum);
        }

        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d%n", totalSum);
    }
}

