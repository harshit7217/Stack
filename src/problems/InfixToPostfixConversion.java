package problems;

import java.util.Stack;

public class InfixToPostfixConversion {

    public static void main(String[] args) {
        System.out.println(conversion("A*B-(C+D)+E"));
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    public static String conversion(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuffer postfix = new StringBuffer();

        for (char ch : infix.toCharArray()) {
            if (isOperand(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // Remove '('
            } else if (isOperator(ch)) {
                // Pop operators with higher or equal precedence
                // Exception: ^ is right-associative, so we don't pop if precedences are equal
                while (!stack.isEmpty() && stack.peek() != '('
                        && (precedence(stack.peek()) > precedence(ch)
                        || (precedence(stack.peek()) == precedence(ch) && ch != '^'))) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') throw new IllegalArgumentException("Mismatched parentheses");
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

//    Precendence
    public static int precedence(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/' || ch == '%') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
}
