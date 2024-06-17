package homework9;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        fillMatrix(matrix);
        printMatrix(matrix);

        int evenRowSum = sumEvenRows(matrix);
        int oddRowSum = sumOddRows(matrix);
        System.out.println("Sum of elements in even rows: " + evenRowSum);
        System.out.println("Sum of elements in odd rows: " + oddRowSum);

        int evenColProduct = productEvenCols(matrix);
        int oddColProduct = productOddCols(matrix);
        System.out.println("Product of elements in even columns: " + evenColProduct);
        System.out.println("Product of elements in odd columns: " + oddColProduct);

        if (isMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    private static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static int sumEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int sumOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int productEvenCols(int[][] matrix) {
        int product = 1;
        for (int j = 0; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static int productOddCols(int[][] matrix) {
        int product = 1;
        for (int j = 1; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;
        for (int i = 0; i < size; i++) {
            magicSum += matrix[0][i];
        }

        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }


        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < size; i++) {
            diag1Sum += matrix[i][i];
            diag2Sum += matrix[i][size - 1 - i];
        }

        return diag1Sum == magicSum && diag2Sum == magicSum;
    }
}

