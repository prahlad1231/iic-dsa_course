package assignment;

public class SortMe {

    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    /*
        find the squares of the sorted array and then
        sort the result
        Example: input: [-2, -1, 3, 4]
                output: [1, 4, 9, 16]
     */
    public static void sort(int[] arr) {
        // to be done by student
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            arr[i] = arr[i] * arr[i];
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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
