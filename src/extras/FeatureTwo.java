package extras;

import java.util.ArrayList;

public class FeatureTwo {

    private static void print(ArrayList<String> names) {
        for (String name : names)
            System.out.print(name + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String str = "name";
        for (int i = 0; i < 20; ++i)
            names.add(str+i);
//        System.out.println(names.toString());
//        print(names);
        names.forEach(name -> System.out.print(name + ", ")); // lambda expressions
    }
}
