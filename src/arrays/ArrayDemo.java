package arrays;

public class ArrayDemo {

    public static void printArray(String[] names) {
        System.out.println("Names in the array are: ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        int size = 5;
        String[] names = new String[size];
        for (int i = 0; i < size; ++i)
            names[i] = "Name " + i;
        printArray(names);
        System.out.println("Element in thrid index: " + names[3]);
    }
}
