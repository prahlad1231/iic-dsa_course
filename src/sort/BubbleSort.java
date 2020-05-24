package sort;

public class BubbleSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-1-i; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 10, 11, 1, -4, 100, 12, 15, 19, 7};
        int[] arr2 = {5, 6, 8, 10, 1, 2, -100, -30, 45, 100, 23, 35, 47, 49};
        sort(arr);
        sort(arr2);
    }
}
