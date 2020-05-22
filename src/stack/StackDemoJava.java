package stack;

import java.util.Stack;

public class StackDemoJava {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // generics
        for (int i = 10; i <= 100; i = i + 10) {
            stack.push(i);
        }
//        System.out.println(stack.pop());
//        System.out.println(stack.toString());
//        System.out.println(stack.peek());
//        System.out.println(stack.toString());

//        System.out.println(stack.empty());

//        System.out.println(stack.search(80));
        stack.clear();
        System.out.println(stack.toString());
    }
}
