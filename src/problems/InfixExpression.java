package problems;

import java.util.Stack;

public class InfixExpression {

    public static void main(String[] args) {
        String str = "1+2*3-5";
        System.out.println(infixExpression(str));
    }

    public static int infixExpression(String s){
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                operand.push(ch -'0');
                if(!operator.isEmpty()){
                    int num2 = operand.pop();
                    int num1 = operand.pop();
                    char temp = operator.pop();
                    switch(temp){
                        case '+':
                            operand.push(num1 + num2);
                            break;
                        case '-':
                            operand.push(num1 - num2);
                            break;
                        case '*':
                            operand.push(num1 * num2);
                            break;
                        case '/':
                            operand.push(num1 / num2);
                            break;
                    }
                }
            }else {
                operator.push(ch);
            }
        }
        return operand.pop();
    }
}
