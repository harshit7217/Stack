package problems;

import java.util.Stack;
import java.lang.Character;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String s = "123*+5-";
        System.out.println(evalution(s));
    }

    public static int evalution(String s){
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(ch == '+'){
                    result = num2 + num1;
                }else if(ch == '-'){
                    result = num2 - num1;
                }else if(ch == '*'){
                    result = num2 * num1;
                }else if(ch == '/'){
                    result = num2 / num1;
                }else {
                    System.out.println("Something is wrong");
                }
                stack.push(result);
            }
        }

        return result;
    }
}
