package Java2025;

import java.util.Stack;

public class ParenthesisBalanceCheck {

    public static void main(String[] args) {
        String input = "(a + b) * (c - d)";

        if (parenthesisCheck(input)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are NOT balanced.");
        }
    }

    public static boolean parenthesisCheck(String input) {

        Stack<Character> stack = new Stack<>();
        char[] arr = input.toCharArray();

        for(char ch : arr) {
            if(ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
