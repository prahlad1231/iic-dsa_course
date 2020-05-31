package sort;

public class SelectionSort {

    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        // to be done by student
    }

    public static void main(String[] args) {
        int[] arr = {10,2,20,12,14,32,13,15,21,1,-10,-20,0,8,100,50,98,67,76,56,54,34,32,23,22};
        selectionSort(arr);
        printArray(arr);
    }
}
