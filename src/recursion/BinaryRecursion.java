package recursion;

// 1 1 2 3 5 8 13 ......

public class BinaryRecursion {

    int fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        BinaryRecursion br = new BinaryRecursion();
        System.out.println("1st fibonacci number: " + br.fibonacci(1));
        System.out.println("2nd fibonacci number: " + br.fibonacci(2));
        System.out.println("3rd fibonacci number: " + br.fibonacci(3));
        System.out.println("4th fibonacci number: " + br.fibonacci(4));
        System.out.println("5th fibonacci number: " + br.fibonacci(5));
        System.out.println("10th fibonacci number: " + br.fibonacci(10));
    }
}
