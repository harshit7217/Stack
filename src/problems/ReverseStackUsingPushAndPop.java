package problems;

import java.util.Stack;

public class ReverseStackUsingPushAndPop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=5; i++){
            stack.push(i);
        }

        System.out.println("Stack : "+ stack.toString());

//        Reverse a stack
        stackReverse(stack);
        System.out.println("Reverse Stack: "+ stack.toString());
        stack.clear();
    }

    public static void stackReverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int data = stack.pop();
        stackReverse(stack);
        insertAtBottom(stack, data);
    }

    public static void insertAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }
}
