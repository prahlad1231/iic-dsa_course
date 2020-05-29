package search;

// 1. Array must be sorted
public class BinarySearch {

    int binarySearch(int[] arr, int startIndex, int endIndex, int element) {
        if (startIndex > endIndex) return -1; // base case
        int mid = (startIndex + endIndex) / 2;
        if (arr[mid] == element) return mid;
        else if (arr[mid] < element)
            return binarySearch(arr, mid + 1, endIndex, element);
        else if (arr[mid] > element)
            return binarySearch(arr, startIndex, mid - 1, element);
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 10, 15, 20, 21, 25, 50, 60, 70, 77, 99, 101, 102, 110, 120,
                    130, 150, 200, 999, 1000};
        int element = 2;
        int index = binarySearch.binarySearch(arr, 0, arr.length - 1, element);
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

}
