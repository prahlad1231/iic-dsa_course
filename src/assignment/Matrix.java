package assignment;

public class Matrix {

    public static void printMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; ++i){
            for (int j = 0; j < c; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;
        int[][] trans = new int[r][c];
        for (int row = 0; row < r; ++row) {
            for (int col = 0; col < c; ++col) {
                trans[row][col] = matrix[col][row];
            }
        }
//        printMatrix(trans);
        return trans;
    }
}
