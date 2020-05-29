package assignment;

import java.util.Stack;

public class BalanceBracket {

    /*
        return true if the input brackets are balanced, otherwise false
        Example: ()[]{} is balanced but ()[]{] is not balanced
                 [[{()()}]]() is balanced but [[{{})()}]] is not balanced
        Note: brackets are balanced if the opening bracket is followed by its respective
            closing bracket (opening bracket might be followed by another opening bracket too)
     */
    public static boolean isBalanced(String s) {
        // to be done by student
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            switch (c) {
                // we want to push the character in stack for all cases of opening bracket
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] input = {"()()[][{{}}]",
                "({{{[()]}}})()",
                "(({{}})([))]))",
                "()[[]]{}{}}()",
                "{{(([[]]))}{}}"};
        for (int i = 0; i < input.length; ++i) {
            System.out.println(isBalanced(input[i]));
        }
    }
}
