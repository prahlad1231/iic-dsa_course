package assignment;

public class SortMe {

    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    public static void sort(int[] arr) {
        // to be done by student

    }

    public static void main(String[] args) {
        int[][] num = {{-2, -1, 0, 1, 2, 5, 6},
                {-10, -4, -2, 4, 6, 10, 12},
                {-9, -8, -7, -5, -2, 0, 1, 4, 6, 10, 12}};
        for (int i = 0; i < num.length; ++i) {
            sort(num[i]);
            printArray(num[i]);
        }
    }
}
