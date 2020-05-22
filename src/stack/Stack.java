package stack;

import java.util.EmptyStackException;

public class Stack {

    private int capacity; // total capacity of the stack
    private int size = 0; // current number of elements in the stack
    private int top = -1; // index of the topmost element in the stack
    private int[] stack;

    public Stack() {
        this(20);
    }

    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
    }

    public void push(int element) throws StackOverflowError {
        if (size == capacity) {
            throw new StackOverflowError("Stack is full");
//            System.out.println("ERROR: StackOverflowError!");
//            return;
        }
        stack[++top] = element;
        size++;
    }

    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
//        int element = stack[top];
//        top--;
//        return element;
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("ERROR: Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int element) {
//        if (search(element) == -1) return false;
//        return true;
        // using ternary operator
        return (search(element) == -1) ? true : false;
    }

    public int search(int element) { // linear search
        int position = 0;
        int i;
        for (i = top, position = 1; i >= 0; i--, position++) {
            if (stack[i] == element) return position;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = -1;
        size = 0;
    }

//    @Override
//    public String toString() {
//
//    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Error: stack is empty");
            return;
        }
        System.out.print("[");
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i]+ ",");
        System.out.print(stack[top] + "]");
    }
}
