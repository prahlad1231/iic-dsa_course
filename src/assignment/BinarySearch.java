package assignment;

public class BinarySearch {

    int binarySearch(String[] names, int startIndex, int endIndex, String name) {
        // to be done by student
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"apple", "appzz", "ball", "cat", "dog", "elephant", "fox", "giraffe",
                        "joker", "kite", "lemon", "lion", "man", "mouse", "net", "nike", "orange",
                        "poke", "zebra"};
        BinarySearch binarySearch = new BinarySearch();
        for (int i = 0; i < names.length; ++i) {
            int index = binarySearch.binarySearch(names, 0, names.length, names[i]);
            System.out.println("Index of " + names[i] + " is " + index);
        }
        int index = binarySearch.binarySearch(names, 0, names.length, "cow");
        if (index == -1) {
            System.out.println("Element not found!");
        }
    }
}
