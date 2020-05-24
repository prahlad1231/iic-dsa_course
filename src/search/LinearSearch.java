package search;

public class LinearSearch {

    public static int linearSearch(int[] arr) {
        // to be completed by student
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 ,100, 32, 34, 12, 43, 19, 20, 201, 278, 129};
        int index = linearSearch(arr);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
