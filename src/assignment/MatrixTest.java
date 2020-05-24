package assignment;

public class MatrixTest {

    public static void main (String [] args) {
        int[][] m1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] m2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] m3 = {{1, 2},
                {3, 4},
                {5, 6}};

        int[][] result;
        System.out.println("Transpose of m1 is :");
        result = Matrix.transpose(m1);
        Matrix.printMatrix(result);
        System.out.println("\nTranspose of m2 is :");
        result = Matrix.transpose(m2);
        Matrix.printMatrix(result);
        System.out.println("\nTranspose of m3 is :");
        result = Matrix.transpose(m3);
        Matrix.printMatrix(result);
    }
}
