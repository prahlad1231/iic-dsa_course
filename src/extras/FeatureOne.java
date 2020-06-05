package extras;

// Variable length arguments or varargs

public class FeatureOne {

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10,20,30,40));
        System.out.println(add(10));
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
    }
}
