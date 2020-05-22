package arrays;

import java.util.Scanner;

public class TwoDimArray {

    public static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (row1 != row2 && col1 != col2) {
            System.out.println("ERROR: cannot perform addition");
            return;
        }

        int[][] result = new int[row1][col1];
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col1; ++j) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Addition is : ");
        printMatrix(result, row1, col1);
    }

    public static void subtractMatrix(int[][] matrix1, int[][] matrix2) {
        // to be done by student
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (row1 != row2 && col1 != col2) {
            System.out.println("ERROR: cannot perform subtraction");
            return;
        }

        int[][] result = new int[row1][col1];
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col1; ++j) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Subtraction is : ");
        printMatrix(result, row1, col1);
    }

    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        // to be done by student
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (col1 != row2) {
            System.out.println("ERROR: cannot perform multiplication");
            return;
        }

        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col1; ++j) {
                for (int k = 0; k < row2; ++k) {
                    result[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        System.out.println("Multiplication is: ");
        printMatrix(result, row1, col2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix 1 (row col): ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter elements of matrix 1: ");
        // for getting matrix1 from user
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter size of matrix 2 (row col): ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter elements of matrix 2: ");
        // for getting matrix1 from user
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

//        System.out.println("Matrix 1 is : ");
//        printMatrix(matrix1, row1, col1);
//        System.out.println("Matrix 2 is : ");
//        printMatrix(matrix2, row2, col2);

//        addMatrix(matrix1, matrix2);
//        subtractMatrix(matrix1, matrix2);
        multiplyMatrix(matrix1, matrix2);
    }
}
