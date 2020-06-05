package linkedlist;

import java.util.LinkedList;

public class JavaLinkedList {

    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Ram");
        nameList.add("Shyam");
        System.out.println(nameList.toString());
        nameList.addFirst("Hari");
        System.out.println(nameList.toString());
        nameList.add(1, "Sita");
        System.out.println(nameList.toString());
//        System.out.println(nameList.contains("Hari"));
//        System.out.println(nameList.contains("KP Oli"));
        nameList.clear();
        System.out.println(nameList.toString());
    }
}
