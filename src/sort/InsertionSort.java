package sort;

public class InsertionSort {

    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        /*
          i = index of rightmost element
          j = index of iterator for iterating to elements on the left of i
        */
        int i, j;
        i = 1;
        while (i < len) {
            j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
//                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
//                }
                j--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,2,20,12,14,32,13,15,21,1,-10,-20,0,8,100,50,98,67,76,56,54,34,32,23,22};
        insertionSort(arr);
        printArray(arr);
    }
}









